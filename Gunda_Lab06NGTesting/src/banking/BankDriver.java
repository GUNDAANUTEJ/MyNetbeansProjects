/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * The driver class to test all the classes
 *
 * @author Nithya Karepe
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        //Note: (i). You can create any variables required within the main method but not as global/instance variables.
        //      (ii). The dates times provided for the transaction times are in yyyy-MM-dd HH:mm:ss
        // 1. Create an arraylist of Accounts and name it as accounts to store the list of accounts
        ArrayList<Account> accounts = new ArrayList<>();
        // 2. Create a scanner object and name it as sc to read the input from keyboard
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNext()) {
            // 3. Read the values account type, first name, last name, date of birth from the input file
            String accountType = sc.nextLine();
            String firstName = sc.next();
            String lastName = sc.next();
            sc.nextLine();
            String dob = sc.nextLine();
            // 4. Create an Customer object.
            Customer customer = new Customer(dob, firstName, lastName);
            // 5. Create an Account object.
            long accountNo = sc.nextLong();
            
            boolean hasLimitedWithdrawals = sc.nextBoolean();
            Account account = new Account(accountNo, customer, hasLimitedWithdrawals);
            // 6. Print full name of the customer.
            System.out.println("------------------------------------------------------------\n Name of the customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n------------------------------------------------------------");
            //7. while(Iterate){
            while (!sc.hasNext("newAccount") && sc.hasNext()) {
                //     a. Read trasaction and a create transaction object by initalizing the multiple argument constructor.
                String transactionType = sc.next();
                double amount = sc.nextDouble();
                //String date = sc.next();
                String time =sc.nextLine();
               // LocalDate ldate = LocalDate.parse(date);
                //LocalTime ltime = LocalTime.parse(time.strip());
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d H:m:s");
               // LocalDateTime dateTime = LocalDateTime.of(ldate,ltime);
               LocalDateTime dateTime = LocalDateTime.parse(time.strip(),formatter);
                Transaction transaction = new Transaction(transactionType, amount, dateTime);
                //     b. call makeTransaction() method on account object.
                String makeTransaction = account.makeTransaction(transaction);
                //     c. Print appropiate message upon completing each transaction based on return value of makeTransaction().
                //if makeTransaction returns "Insufficient Balance" print "Insufficient funds. Available funds: {funds}".
                //  where {funds} is the available funds on account.
                if (makeTransaction.equals("Insufficient Balance")) {
                    System.out.printf("Insufficient funds. Available funds: %.2f\n", account.getBalance());
                } //if makeTransaction returns "MaxTransactions" print "Exceeded number of withdrawals transactions. Number of available withdrawals per month: 6"
                else if (makeTransaction.equals("MaxTransactions")) {
                    System.out.printf("Exceeded number of withdrawals transactions. Number of available withdrawals per month: 6\n");
                } //if makeTransaction returns "Transaction Successful" then print "The balance after {transactionType} in dollars is {funds}"
                //  where {transactionType} is type of transaction.
                else if (makeTransaction.equals("Transaction Successful")) {
                    System.out.printf("The balance after %s in dollars is %.2f\n", transaction.getTransactionType(), account.getBalance());
                }
            }
            // 10. Add Account object to accounts Arraylist.
            accounts.add(account);
        }
        // Print "Invoke getNoofWithdrawals() on SavingsAccount objects"
        System.out.println("************************************************************************\n"
                + "*********Invoke getNoofWithdrawals() on Account objects**********\n"
                + "************************************************************************");
        // 11(a). For each Account from accounts, invoke getNoofWithdrawals() method on SavingsAccount objects
        // 11(b). Print number of withdrawls made in this month for each account.
        for (Account account : accounts) {
            System.out.printf("%s made %d withdrawals in this month.\n", account.getCustomer().getFirstName(), account.getNoofWithdrawals());
        }
        // Print "Invoke generateStatement() on all objects in accounts ArrayList"
        System.out.println("***********************************************************************\n"
                + "****Invoke generateStatement() on all objects in accounts ArrayList****\n"
                + "************************************************************************");
        // 12. Invoke generateStatement() method on all objects in accounts ArrayList and print all account statements
        for (Account account : accounts) {
            System.out.printf("%s ************************************************************************\n", account.generateStatement());
        }
    }

}
