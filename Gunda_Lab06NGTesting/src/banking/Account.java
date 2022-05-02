/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Account {

    private long accountNumber;
    private Customer customer;
    private double balance;
    ArrayList<Transaction> transaction;
    private boolean hasLimitedWithdrawals;
    private static final double SAVING_INTEREST = 5.80;

    /**
     *
     * @param accountNumber
     * @param customer
     * @param hasLimitedWithdrawals
     */
    public Account(long accountNumber, Customer customer, boolean hasLimitedWithdrawals) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
        transaction = new ArrayList<>();
    }

    /**
     * gets Account number
     * @return
     */
    public long getAccountNumber() {
        return accountNumber;
    }

    /**
     * sets Account Number
     * @param accountNumber
     */
    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * gets Customer
     * @return
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * sets Customer
     * @param customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * gets Balance
     * @return
     */
    public double getBalance() {
        return balance;
    }

    /**
     * sets Balance
     * @param balance
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * array get transaction
     * @return
     */
    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    /**
     * sets transaction
     * @param transaction
     */
    public void setTransaction(ArrayList<Transaction> transaction) {
        this.transaction = transaction;
    }

    /**
     *  is method has limited withdrawals
     * @return
     */
    public boolean isHasLimitedWithdrawals() {
        return hasLimitedWithdrawals;
    }

    /**
     * sets has limited withdrawals
     * @param hasLimitedWithdrawals
     */
    public void setHasLimitedWithdrawals(boolean hasLimitedWithdrawals) {
        this.hasLimitedWithdrawals = hasLimitedWithdrawals;
    }

    /**
     *  string generate statement
     * @return
     */
    public String generateStatement() {
        String result = getCustomer().toString() + "\nAccount Number: " + getAccountNumber() + "\nAccount Information:-â€ƒ â€ƒ Interest Rate: 5.80%\n"
                + "Transaction Limit for withdrawal: No Limit\n"
                + "-------------------------------------------------------------------------------\n"
                + "Transaction Typeâ€ƒ â€ƒ â€ƒ Transaction Timeâ€ƒ â€ƒ Amountâ€ƒ â€ƒ Additional Chargesâ€ƒ â€ƒ Status\n";
        for (Transaction t : getTransaction()) {
            result = result.concat(t.toString());
        }
        result = result.concat("-------------------------------------------------------------------------------\n");
        String bal = String.format("Current Balance: %14.2f Interest: $%.2f\n", getBalance(), getBalance() * SAVING_INTEREST / 100);
        result = result.concat(bal);
        return result;
    }

    /**
     *   gets number of withdrawals
     * @return
     */
    public int getNoofWithdrawals() {
        int count = 0;

        LocalDate currentDate = LocalDate.now();
        DayOfWeek dow = currentDate.getDayOfWeek();
        int dom = currentDate.getDayOfMonth();
        int doy = currentDate.getDayOfYear();
        Month m = currentDate.getMonth();
        int y = currentDate.getYear();
        for (Transaction t : getTransaction()) {
            if (t.getTransactionType().equals("WITHDRAW") && m.equals(t.getTransactionTime().getMonth())) {

                count++;
            }
        }
        return count;
    }

    /**
     *  string makeTransaction
     * @param transaction
     * @return
     */
    public String makeTransaction(Transaction transaction) {

        getTransaction().add(transaction);
        if (transaction.getTransactionType().equals("DEPOSIT")) {
            transaction.setAdditionalCharges(0.00);
            transaction.setStatus("SUCCESS");
            setBalance(transaction.getAmount() + getBalance());
            //  getTransaction().add(transaction);
            return "Transaction Successful";
        } else if (transaction.getTransactionType().equals("ONLINEPURCHASE")) {
            transaction.setAdditionalCharges(1.99);
            if (getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges()) >= 0) {
                transaction.setStatus("SUCCESS");
                setBalance(getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges()));
                // getTransaction().add(transaction);
                return "Transaction Successful";
            }
        } else if (transaction.getTransactionType().equals("WITHDRAW")) {
            if (!hasLimitedWithdrawals) {
                if (getNoofWithdrawals() > 6) {
                    double value = transaction.getAmount() * 0.01;
                    transaction.setAdditionalCharges(Math.max(value, 2.59));
                    if (getBalance() < transaction.getAmount()) {
                        transaction.setAdditionalCharges(0.00);
                        transaction.setStatus("FAILED");
                        // getTransaction().add(transaction);
                        return "Insufficient Balance";
                    } else if (getBalance() > transaction.getAmount() + transaction.getAdditionalCharges()) {
                        transaction.setStatus("SUCCESS");
                        setBalance(getBalance() - (transaction.getAmount() + transaction.getAdditionalCharges()));
                        //  getTransaction().add(transaction);
                        return "Transaction Successful";
                    }
                } else if (getNoofWithdrawals() <= 6 && getBalance() - transaction.getAmount() >= 0) {
                    transaction.setAdditionalCharges(0.00);
                    transaction.setStatus("SUCCESS");
                    setBalance(getBalance() - transaction.getAmount());
                    //  getTransaction().add(transaction);
                    return "Transaction Successful";
                }
            } else {
                if (getNoofWithdrawals() > 6) {
                      if (getBalance() < transaction.getAmount()) {
                        transaction.setAdditionalCharges(0.00);
                        transaction.setStatus("FAILED");
                      return "Insufficient Balance";}
                    transaction.setAdditionalCharges(0.00);
                    transaction.setStatus("FAILED");
                    // getTransaction().add(transaction);
                    return "MaxTransactions";
                } else if (getNoofWithdrawals() <= 6 && getBalance() - transaction.getAmount() >= 0) {
                    transaction.setAdditionalCharges(0.00);
                    transaction.setStatus("SUCCESS");
                    setBalance(getBalance() - transaction.getAmount());
                    //   getTransaction().add(transaction);
                    return "Transaction Successful";
                }
            }
        }
        transaction.setAdditionalCharges(0.00);
        transaction.setStatus("FAILED");
        // getTransaction().add(transaction);
        return "Insufficient Balance";
    }
}
