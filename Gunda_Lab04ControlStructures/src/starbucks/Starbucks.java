/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starbucks;

/**
 *
 * @author Gunda Sai Naga Anu Teja 
 */
public class Starbucks {
    
    private String customerName;
    private String address;
    private String contactNumber;
    private String customerType;
    private String billReciept;
    private double billAmount;
    private String order;
    
    /**
     * Creating a constructor and attribute
     * @param customerName
     * @param address
     * @param contactNumber
     * @param customerType
     */
    public  Starbucks(String  customerName,  String  address,  String contactNumber, String customerType){
    
        
        this.customerName = customerName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.customerType = customerType;
        billReciept = "";
        billAmount = 0;
        order = "";
        
        
    }
    
    /**
     * Getter method for Customer Name
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }
    
    /**
     * Getter method for Address
     * @return address
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Getter method for Contact Number
     * @return contactNumber
     */
    public String getContactNumber() {
        return contactNumber;
    }
    
    /**
     * Getter method for Customer Type
     * @return customerType
     */
    public String getCustomerType() {
        return customerType;
    }
    
    /**
     * Getter method for Bill Receipt
     * @return billReciept
     */
    public String getBillReciept() {
        return billReciept;
    }
    
    /**
     * Getter method for bill amount
     * @return billAmount
     */
    public double getBillAmount() {
        return billAmount;
    }
    
    /**
     * Getter method for Order
     * @return order
     */
    public String getOrder() {
        return order;
    }
    
    /**
     * Setter method for Customer Name
     * @param customerName
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    /**
     * Setter method for Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Setter method for Contact Number
     * @param contactNumber
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    /**
     * Setter method for Customer Type
     * @param customerType
     */
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    
    /**
     * Setter method for Bill Receipt
     * @param billReciept
     */
    public void setBillReciept(String billReciept) {
        this.billReciept = billReciept;
    }
    
    /**
     * Setter method for Bill Amount
     * @param billAmount
     */
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    /**
     * Setter method for Order
     * @param order
     */
    public void setOrder(String order) {
        this.order = order;
    }
    
    /**
     *
     * returns Initials of Name getNameInitials
     */
    public String getNameInitials()
    {
        if (customerName.length() != 0) {
            String rt = customerName.trim();
            String ft = rt.substring(0, 1);

            for (int a = 0; a < rt.length(); a++) {

                if (rt.charAt(a) == ' ') {

                    ft = ft.concat(".").concat(rt.substring(a + 1, a + 2));
                }
            }
            return ft.concat(".").toUpperCase();
        }
        return null;
    }
    
    /**
     * Returns Item Name getItemName
     * @param itemNumber
     * 
     */
    String getItemName(int itemNumber) {
        switch (itemNumber) {
            case 1:
                return "Ham & Swiss Panini";
            case 2:
                return "Cheese & Fruit Bistro Box";
            case 3:
                return "Turkey Pesto Panini";
            case 4:
                return "Salted Caramel or Birthday Cake Pop";
            case 5:
                return "Roasted Tomato & Mozzarella Panini";
            default:
                return "Please choose the number 1 to 5";
        }

    }
    
    /**
     * Returns Item Cost getItemCost
     * @param itemName
     * 
     */
    double getItemCost(String itemName) {

        switch (itemName) {
            case "Ham & Swiss Panini":
                return 5.25;
            case "Cheese & Fruit Bistro Box":
                return 4.95;

            case "Turkey Pesto Panini":
                return 5.96;

            case "Salted Caramel or Birthday Cake Pop":
                return 3.50;
            case "Roasted Tomato & Mozzarella Panini":
                return 3.46;
            default:
                return 0.0;

        }

    }
    
    /**
     * Returns Updated Receipt updateReceipt
     * @param itemNumber
     * @param quantity
     * 
     */
     public void updateReceipt(int quantity, int itemNumber) {

        if(billReciept == "" ){
            String s = "The Following is the bill for purchased products\n";
            billReciept = s;
            
        

        String name = getItemName(itemNumber);
        double cost = getItemCost(name);
        double total = quantity * cost;
        String one = name + "(" + getItemCost(name) + ")";
        String two = "          " + "*" + quantity;
        String three = "= " + total + "\n";
        billReciept = billReciept + one + two + three;
        
        }
        else{
             
            String name = getItemName(itemNumber);
        double cost = getItemCost(name);
        double total = quantity * cost;
        String one = name + "(" + getItemCost(name) + ")";
        String two = "          " + "*" + quantity;
        String three = "= " + total + "\n";
        billReciept = billReciept + one + two + three;
        }
    }
     
    /**
     *
     * Returns the Discounted amount getDiscount
     */
    private double getDiscount() {

        if (billAmount >= 10 && "Regular".equals(customerType)) {
            return billAmount * 10 / 100;
        }
        return 0;

    }
    
    /**
     *
     * Returns the sales tax getSalesTax
     * 
     */
    
    private double getSalesTax() {
        return billAmount * 8 / 100;

    }
    
    /**
     *
     * Returns the final billing amount getFinalBillAmount
     * 
     */
    public double getFinalBillAmount() {
        double finalBill = billAmount + getSalesTax() - getDiscount();
        return Math.round(finalBill * 100.0) / 100.0;
    }
    
    /**
     *
     * Returns the Final Bill Receipt getFinalBillReciept
     * 
     */
    String getFinalBillReciept() {
        String a = "                           Sales Tax = " + getSalesTax() + "\n";
        String b = "                            discount = -" + getDiscount() + "\n";
        String c = "-------------------------------------------------------\n";
        String d = "                           Total Bill = " + getFinalBillAmount() + "\n";
        String e = "-------------------------------------------------------\n";
        billReciept += a + b + c + d + e;

        return billReciept;

    }
    
    /**
     *
     * Returns Order along with name getOrderWithName
     * 
     */
    String getOrderWithName() {
        return "order - " + order + " by : " + getNameInitials() + "\n";
    }
    
    /**
     *
     * Returns Contact details provided getContactDetails
     * 
     */
    String getContactDetails() {
        return "Address: " + address + "\n"
                + "Contact: " + contactNumber + "\n";

    }
    
    /**
     *
     * Returns Balance getBalance
     * 
     */
    String getBalance(double customerPaid) {
        String result = "";
        int count50 = 0;
        int count10 = 0;
        int count5 = 0;
        int count1 = 0;
        int countHalfD = 0;
        int countQuarters = 0;
        int countDime = 0;
        int countFive = 0;
        int countOne = 0;

        double change = customerPaid - getFinalBillAmount();
        double actualChange = change;

        while (change >= 50) {
            count50++;
            change = change - 50;
        }
        while (change >= 10 && change < 50) {
            count10++;
            change = change - 10;
        }
        while (change >= 5 && change < 10) {
            count5++;
            change = change - 5;
        }
        while (change >= 1 && change < 5) {
            count1++;
            change = change - 1;
        }
        while (change >= .50 && change < 1) {
            countHalfD++;
            change = change - .50;
        }
        while (change >= .25 && change < .50) {
            countQuarters++;
            change = change - .25;
        }
        while (change >= .10 && change < .25) {
            countDime++;
            change = change - .10;
        }
        while (change >= .05 && change < .10) {
            countFive++;
            change = change - .05;
        }
        while (change >= .01 && change < .05) {
            countOne++;
            change = change - .01;
        }

        if (count50 > 0) {
            result = result.concat("$50.00   * " + count50 + " = " + 50.00 * count50 + "\n");
        }
        if (count10 > 0) {
            result = result.concat("$10.00   * " + count10 + " = " + 10.00 * count10 + "\n");
        }
        if (count5 > 0) {
            result = result.concat("$5.00   * " + count5 + " = " + 5.00 * count5 + "\n");
        }
        if (count1 > 0) {
            result = result.concat("$1.00   * " + count1 + " = " + 1.00 * count1 + "\n");
        }
        if (countHalfD > 0) {
            result = result.concat("$.50  * " + countHalfD + " = " + .50 * countHalfD + "\n");
        }
        if (countQuarters > 0) {
            result = result.concat("$.25  * " + countQuarters + " = " + .25 * countQuarters + "\n");
        }
        if (countDime > 0) {
            result = result.concat("$.10   * " + countDime + " = " + .10 * countDime + "\n");
        }
        if (countFive > 0) {
            result = result.concat("$.05   * " + countFive + " = " + .05 * countFive + "\n");
        }
        if (countOne > 0) {
            result = result.concat("$.01   * " + countOne + " = " + .01 * countOne + "\n");
        }
        result = result.concat("--------------------\n   Total Bal = ").concat(String.valueOf(actualChange)).concat("\n--------------------\n");

        return result;

    }
    
    /**
     *
     * Returns String as given toString
     * 
     */
    public String toString() {
        return getOrderWithName() + getContactDetails() + getFinalBillReciept();
    }
    
    /**
     *
     * Returns Receipt and prints it printReceipt
     * 
     */
    public void printReceipt(double cash) {
        System.out.println(toString());
        System.out.println("cash - "+getBalance(cash));
    }
}
