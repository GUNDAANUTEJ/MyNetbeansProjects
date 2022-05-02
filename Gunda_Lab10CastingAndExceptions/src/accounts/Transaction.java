/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import java.time.LocalDateTime;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Transaction {

    private double additionalCharges;
    private double amount;
    private String status;
    private LocalDateTime trannsactonTime;
    private TransactionType transactionType;

    /**
     * Constructor with 3 arguments
     * @param transactionType Type of the transaction
     * @param amount Amount
     * @param trannsactonTime Time of the transaction
     */
    public Transaction(TransactionType transactionType, double amount, LocalDateTime trannsactonTime) {
        this.amount = amount;
        this.trannsactonTime = trannsactonTime;
        this.transactionType = transactionType;
    }

    /**
     * Gets the additional charges
     * @return Additional Charges
     */
    public double getAdditionalCharges() {
        return additionalCharges;
    }

    /**
     * Gets Amount
     * @return Amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Gets Status
     *
     * @return Status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Gets the Time of the Transaction
     * @return Time of the transaction
     */
    public LocalDateTime getTrannsactonTime() {
        return trannsactonTime;
    }

    /**
     * Gets type of the transaction
     * @return Type of the transaction
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the additional charges
     * @param additionalCharges Additional Charges
     */
    public void setAdditionalCharges(double additionalCharges) {
        this.additionalCharges = additionalCharges;
    }

    /**
     * Sets the status
     * @param status status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * toString
     * @return toString
     */
    @Override
    public String toString() {
        //return transactionType+"\t\t"+trannsactonTime+"\t"+amount+"\t\t"+additionalCharges+"\t\t"+status;
        return String.format("%-24s", transactionType) + String.format("%-24s", trannsactonTime) + "$" + String.format("%-16s", String.format("%.2f", amount)) + "$" + String.format("%-24s", String.format("%.2f", additionalCharges)) + status;
    }

}

