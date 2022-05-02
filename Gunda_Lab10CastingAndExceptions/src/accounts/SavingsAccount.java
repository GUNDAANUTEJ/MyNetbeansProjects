/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import exceptions.InsufficentFundsException;
import exceptions.MaxTransactionsException;
import java.time.LocalDateTime;


/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class SavingsAccount extends Account {

    boolean hasLimitedWithdrawals;

    public SavingsAccount(Customer customer, long accountNumber, boolean hasLimitedWithdrawals) {
        super(customer, accountNumber);
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    public int getNoofWithdrawals() {
        int count = 0;
        LocalDateTime today = java.time.LocalDateTime.now();
        int month = today.getMonthValue();
        int year = today.getYear();
        for (Transaction t : transactions) {
            if (t.getTransactionType().equals(TransactionType.WITHDRAW)) {
                if (t.getTrannsactonTime().getMonthValue() == month) {
                    if (t.getTrannsactonTime().getYear() == year) {
                        count = count + 1;
                    }
                }
            }
        }
        return count;
    }

    @Override
    public double makeTransaction(Transaction transaction) throws Exception{
        switch (transaction.getTransactionType()) {
            case DEPOSIT:
                transaction.setAdditionalCharges(0.00);
                transaction.setStatus("SUCCESS");
                balance = balance + transaction.getAmount();
                transactions.add(transaction);
                break;
            case ONLINEPURCHASE:
                if (balance < transaction.getAmount()) {
                    transaction.setAdditionalCharges(0.00);
                    transaction.setStatus("FAILED");
                    transactions.add(transaction);
                    throw new InsufficentFundsException();
                } else {
                    transaction.setAdditionalCharges(1.99);
                    transaction.setStatus("SUCCESS");
                    balance = balance - (transaction.getAmount()
                            + transaction.getAdditionalCharges());
                    transactions.add(transaction);
                }
                break;
            case WITHDRAW:
                if (balance < transaction.getAmount()) {
                    transaction.setAdditionalCharges(0.00);
                    transaction.setStatus("FAILED");
                    transactions.add(transaction);
                    throw new InsufficentFundsException();
                } else {
                    if (hasLimitedWithdrawals) {
                        if (getNoofWithdrawals() > 6) {
                            transaction.setAdditionalCharges(0.0);
                            transaction.setStatus("FAILED");
                            transactions.add(transaction);
                            throw new MaxTransactionsException();
                        } else {
                            transaction.setAdditionalCharges(0.00);
                            transaction.setStatus("SUCCESS");
                            balance = balance - transaction.getAmount();
                            transactions.add(transaction);
                        }
                    } else {
                        if (getNoofWithdrawals() > 6) {
                            double addcharges = (2.59 > ((0.01)
                                    * transaction.getAmount()) ? 2.59 : ((0.01)
                                    * transaction.getAmount()));
                            transaction.setAdditionalCharges(addcharges);
                            transaction.setStatus("SUCCESS");
                            balance = balance - (transaction.getAmount()
                                    + transaction.getAdditionalCharges());
                            transactions.add(transaction);
                        } else {
                            transaction.setAdditionalCharges(0.00);
                            transaction.setStatus("SUCCESS");
                            balance = balance - transaction.getAmount();
                            transactions.add(transaction);
                        }
                    }
                }
                break;
            default:
                break;
        }
        return balance;
    }

    @Override
    public String toString() {
        String transactionlimit;
        if (hasLimitedWithdrawals) {
            transactionlimit = "6 Transactions";
        } else {
            transactionlimit = "No Limit";
        }
        return super.toString() + "Account Type: Savings Account" + "	Interest Rate: " + String.format("%.2f", Math.round(SAVING_INTEREST * 100) / 100.0) + "%" + "\nTransaction Limit for withdrawal: " + transactionlimit + "\n";
    }

    /**
     * Generates the Statement
     * @return Statement
     */
    @Override
    public String generateStatement() {
        return toString() + super.generateStatement() + "\nCurrent Balance: " + String.format("%.2f", Math.round(balance * 100) / 100.0) + "		Interest: $" + Math.round(((SAVING_INTEREST / 100) * balance) * 100) / 100.0 + "\n*******************************************************************************";
    }

}

