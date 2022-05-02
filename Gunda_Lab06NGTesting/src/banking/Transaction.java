/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Transaction {
    
    private double additionalCharges;
    private double amount;
    private String status;
    private LocalDateTime transactionTime;
    private String transactionType;

    /**
     *
     * @param transactionType
     * @param amount
     * @param transactionTime
     */
    public Transaction(String transactionType, double amount, LocalDateTime transactionTime) {
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionTime = transactionTime;
    }

    /**
     *  gets additional charges
     * @return
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     *  sets Additional charges
     * @param additionalCharges
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     * gets amount
     * @return
     */
    public double getAmount() {
        return amount;
    }

    /**
     * sets amount
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * gets status
     * @return
     */
    public String getStatus() {
        return status;
    }

    /**
     * sets status
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     *  local date time Transaction
     * @return
     */
    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    /**
     *  set transaction
     * @param transactionTime
     */
    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    /**
     * get transaction
     * @return
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * set transaction type
     * @param transactionType
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public String toString() {
        String format = String.format("%-22s %-22s %-14.2f %-18.2f %s \n", transactionType, transactionTime.format(DateTimeFormatter.ofPattern("yyyy-M-d H:m:s")), amount, additionalCharges, status);
        return format;

    }
}
