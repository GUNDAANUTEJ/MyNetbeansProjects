/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounts;

import enums.TransactionType;
import exceptions.OverdraftLimitExceededException;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class CurrentAccount extends Account {

    public CurrentAccount(Customer customer, long accountNumber) {
        super(customer, accountNumber);
    }
    @Override
    public double makeTransaction(Transaction transaction) throws Exception {
        if (transaction.getTransactionType().equals(TransactionType.DEPOSIT)) {
            transaction.setAdditionalCharges(0.00);
            transaction.setStatus("SUCCESS");
            balance = balance + transaction.getAmount();
            transactions.add(transaction);

        } else if (transaction.getTransactionType().equals(TransactionType.ONLINEPURCHASE)) {
            if ((balance + OVERDRAFT_LIMIT) < (transaction.getAmount())) {
                transaction.setAdditionalCharges(0.00);
                transaction.setStatus("FAILED");
                transactions.add(transaction);
                throw new OverdraftLimitExceededException();

            } else {
                transaction.setAdditionalCharges(1.59);
                transaction.setStatus("SUCCESS");
                balance = balance - (transaction.getAmount() + transaction.getAdditionalCharges());
                transactions.add(transaction);
            }
        } else if (transaction.getTransactionType().equals(TransactionType.WITHDRAW)) {
            if ((balance + OVERDRAFT_LIMIT) < (transaction.getAmount())) {
                transaction.setAdditionalCharges(0.00);
                transaction.setStatus("FAILED");
                transactions.add(transaction);
                throw new OverdraftLimitExceededException();
            } else {
                transaction.setAdditionalCharges(0.00);
                transaction.setStatus("SUCCESS");
                balance = balance-(transaction.getAmount());
                transactions.add(transaction);
            }
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + "Account Type: Current Account	" + "Overdraft Limit: $" + String.format("%.2f", OVERDRAFT_LIMIT) + "\n";
    }

    /**
     * Generates the statement
     * @return Statement
     */
    @Override
    public String generateStatement() {
        double Over = 0.00;
        double avail = OVERDRAFT_LIMIT;
        if (balance < 0) {
            Over = Math.abs(balance);
            avail = OVERDRAFT_LIMIT - Math.abs(balance);
            balance = 0.00;
        }
        return toString() + super.generateStatement() + "\nCurrent Balance: " 
                
                + String.format("%.2f", Math.round(balance * 100) / 100.0) +   "\nOverdraft usage: $" 
                
                + String.format("%.2f", Math.round(Over * 100) / 100.0) +
                
                "		Overdraft available: $" + 
                
                String.format("%.2f", Math.round(avail * 100) / 100.0) +
                
                "\n************************************************"
                
                + "*******************************";
    }

}

