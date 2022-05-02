/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accounts;

import enums.TransactionType;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Account> accounts = new ArrayList<>();

        Scanner scan = new Scanner(new File("input.txt"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/d HH:m:s");
        while (scan.hasNext()) {
            String accType = scan.nextLine();
            String fname = scan.next();
            String lname = scan.nextLine().trim();;
            String dob = scan.nextLine();
            Customer Cust = new Customer(dob, fname, lname);
            Long accNumber = scan.nextLong();
            Account acc;

            if (accType.equals("savings")) {

                boolean hasWithdrawals = scan.nextBoolean();
                acc = new SavingsAccount(Cust, accNumber, hasWithdrawals);
            } else {

                acc = new CurrentAccount(Cust, accNumber);
            }

            System.out.println("------------------------------------------------------------");
            System.out.println("Name of the customer: " + Cust.getFirstName() + "  " + Cust.getLastName());
            System.out.println("------------------------------------------------------------");
            while (scan.hasNext("DEPOSIT") || scan.hasNext("WITHDRAW") || scan.hasNext("ONLINEPURCHASE")) {
                String transacType = scan.next();

                double amount = scan.nextDouble();
                scan.skip("\\s*");
                String date = scan.nextLine().replaceAll("-", "/");

                LocalDateTime local = LocalDateTime.parse(date, formatter);
                Transaction Trans = new Transaction(TransactionType.valueOf(transacType), amount, local);

                try {
                    double balance = acc.makeTransaction(Trans);
                    System.out.println("The balance after " + transacType + " in dollars is " + String.format("%.2f", Math.round(balance * 100) / 100.0));
                } catch (Exception ex) {
                    System.out.println(ex.toString());
                }
            }
            accounts.add(acc);
        }

        System.out.println("*************************************************"
                
                + "***********************\n"
                
                + "*********Invoke getNoofWithdrawals() on SavingsAccount objects**"
                
                + "********\n"
                
                + "*********************************************************"
                
                + "***************");
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                System.out.println(account.getCustomer().getFirstName() + " made "
                        
                        + ((SavingsAccount) account).getNoofWithdrawals() + " withdrawals in this month.");
            }
        }
        System.out.println("***************************************************"
                
                + "********************\n"
                
                + "****Invoke generateStatement() on all objects in accounts"
                
                + " ArrayList****\n"
                
                + "*********************************************************"
                
                + "***************");
        for (Account account : accounts) {
            System.out.println(account.generateStatement());
        }
    }

}
