/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

import java.util.Scanner;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class StarbucksDriver {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String customerName;
        String contactNumber;
        String customerType;
        String address;
        int orderNumber=0;
        int itemNumber;
        int itemQuantity;
        String addItem;
        String addOrder;
        double cashPaid;
        System.out.println("***** Welcome to Starbucks *****");
        Scanner scan = new Scanner(System.in);
        do {
            orderNumber++;
            do {
                System.out.print("Please enter the full name (Firstname Lastname): ");
                customerName = scan.nextLine();
            } while (customerName.isBlank());
            do {
                System.out.print("Please enter the Address: ");
                address = scan.nextLine();
            } while (address.isBlank());
            do {
                System.out.print("Please enter Contact Number: ");
                contactNumber = scan.next();
            } while (contactNumber.length() != 10);
            do {
                System.out.print("Please enter Customer Type(Regular/New): ");
                customerType = scan.next();
            } while (!"Regular".equalsIgnoreCase(customerType) && !"New".equalsIgnoreCase(customerType));
            System.out.println("\n!*!*!*!*! Welcome Board " + customerName + " !*!*!*!*!\n");
            Starbucks customer = new Starbucks(customerName, address, contactNumber, customerType);
            do {
                itemNumber = selectItems(scan);
                itemQuantity = getQuantity(scan);
                customer.setBillAmount(customer.getBillAmount() + 
                        itemQuantity * customer.getItemCost(customer.getItemName(itemNumber)));
                System.out.print("Do you want to add one more item(Y/N))? ");
                addItem = scan.next();
                customer.updateReceipt(itemQuantity, itemNumber);
            } while ("Y".equalsIgnoreCase(addItem));
            customer.setOrder(String.valueOf(orderNumber));
            System.out.println("Bill amount is " + customer.getFinalBillAmount());
            System.out.print("Enter the cash paid: $");
            cashPaid=scan.nextDouble();
            System.out.println("\n***************************************");
            System.out.print(customer.getOrderWithName());
            System.out.print(customer.getContactDetails());
            System.out.print(customer.getFinalBillReciept());
            System.out.println("Change received is as follow");
            System.out.println(customer.getBalance(cashPaid));
            System.out.println("***************************************");
            System.out.print("Do you want add one more order(Y/N))? ");
            addOrder = scan.next();
        } while ("Y".equalsIgnoreCase(addOrder));
        System.out.println("Thank you!");
        
        scan.close();
    }
    
    /**
     * Returns Quantity values by reading it
     * @param scan
     * 
     */
    private static int getQuantity(Scanner scan) {
        System.out.print("Enter the quantity: ");
        return scan.nextInt();
    }
    /**
     * Returns selected Item Values
     * @param scan
     *
     */
    private static int selectItems(Scanner scan) {
        int itemNumber;
        
            System.out.print("Select items from following list\n"
                    + "1.Ham & Swiss Panini\n"
                    + "2.Cheese & Fruit Bistro Box\n"
                    + "3.Turkey Pesto Panini\n"
                    + "4.Salted Caramel or Birthday Cake Pop\n"
                    + "5.Roasted Tomato & Mozzarella Panini\n");
            itemNumber = scan.nextInt();
            scan.nextLine();
        
        
        if(itemNumber < 1 || itemNumber > 5)
        {
            System.out.println("Please choose the number 1 to 5");
            itemNumber = scan.nextInt();
            scan.nextLine();
        }
        
        return itemNumber;
    }
    
    
}
