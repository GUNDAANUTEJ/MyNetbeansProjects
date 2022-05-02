/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;

/**
 *
 * @author GUNDA SAI ANAGA ANU TEJA
 */


/**
 * Route Calculator.
 * And also calculated membership values and total prices.
 */

public class RouteCalculator {
    
    /**
     *  private instance variables
     *  Route number routNo.
     */
    private int routeNo;
    /**
     * Number of passengers.
     */
    private int numpassengers;
    /**
     * is is used for member or not.
     */
    private boolean isMember;
    /**
     *is First time user or not.
     */
    private boolean isFirstTimeUser;
    /**
     * have Coupon or not.
     */
    private boolean haveCoupon;
    /**
     *  Coupon value given 5.
     */
    private static final double Coupon=5.00;
    /**
     * SalesTax value given 7.50.
     */
    private final double salesTax=7.50;
    
    /**
     * Constructor for an RouteCalculator
     * @param routeNo
     * @param numpassengers
     * @param isMember
     * @param isFirstTimeUser
     * @param haveCoupon
     */
    
     /**
     *  constructor
     */
    public RouteCalculator(int routeNo, int numpassengers, boolean isMember, boolean isFirstTimeUser, boolean haveCoupon)
    {
        this.routeNo = routeNo;
        this.numpassengers = numpassengers;
        this.isMember = isMember;
        this.isFirstTimeUser = isFirstTimeUser;
        this.haveCoupon = haveCoupon;
    }
    
    /**
     * Gets the Route Number
     * @return routeNo
     */
    public int getRouteNo() {
        return routeNo;
    }

    /**
     * Getter Number of Passengers
     * @return number of passengers
     */

    public int getNumpassengers() {
        return numpassengers;
    }
    
    /**
     * Getter whether its a member or not
     * @return isMember
     */
    public boolean isIsMember() {
        return isMember;
    }
    
    /**
     * Getter Whether its first time User or not
     * @return isFirstTimeUser
     */
    public boolean isIsFirstTimeUser() {
        return isFirstTimeUser;
    }
    
    /**
     * Getter Have Coupon
     * @return haveCoupon
     */
    public boolean isHaveCoupon() {
        return haveCoupon;
    }
    
    /**
     * Getter Coupon Value
     * @return Coupon
     */
    public double getCoupon() {
        return Coupon;
    }
    
    /**
     * Getter Sales Tax Value
     * @return salesTax
     */
    public double getSalesTax() {
        return salesTax;
    }
    
    /**
      * Setter route number
      * @param routeNo
      */
    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }

    /**
      * Setter Number of Passengers
      * @param numpassengers
      */
    public void setNumpassengers(int numpassengers) {
        this.numpassengers = numpassengers;
    }
    
    /**
      * Setter isMember or not
      * @param isMember
      */
    public void setIsMember(boolean isMember) {
        this.isMember = isMember;
    }
    
    /**
      * Setter First time user or not
      * @param isFirstTimeUser
      */
    public void setIsFirstTimeUser(boolean isFirstTimeUser) {
        this.isFirstTimeUser = isFirstTimeUser;
    }
    
    /**
      * Setter whether coupon or not
      * @param haveCoupon
      */
    public void setHaveCoupon(boolean haveCoupon) {
        this.haveCoupon = haveCoupon;
    }
    
    /**
      * Gives all the values provided
      * @return toString String type
      */
    public String toString()
    {
        return "routeNo: "+routeNo+","+" numpassengers: "+numpassengers+","+" isMember: "+isMember+","+" isFirstTimeUser: "+isFirstTimeUser+","+" haveCoupon: "+haveCoupon;
    }
    
    /**
      * Calculating Route price
      * @return route Price 
      */
    private double calcRoutePrice()
    {
      if(routeNo == 1)
      {
          if(numpassengers == 1)
          {
              return 35.0;
          }
          else if(numpassengers == 2)
          {
              return 60.0;
          }
          else if(numpassengers > 2)
          {
              return numpassengers*26.50;
          }
          else
          {
             return 0.2;
          }
      }
      
      else if(routeNo == 2)
      {
          if(numpassengers == 1)
          {
              return 32.89;
          }
          else if(numpassengers == 2)
          {
              return 53.12;
          }
          else if(numpassengers > 2)
          {
              return numpassengers*24.20;
          }
          else
          {
             return 0.2;
          }
      }
      
      else if(routeNo == 3)
      {
          if(numpassengers == 1)
          {
              return 38.0;
          }
          else if(numpassengers == 2)
          {
              return 63.78;
          }
          else if(numpassengers > 2)
          {
              return numpassengers*28.78;
          }
          else
          {
             return 0.2;
          }
      }
      else
      {
        return 0.1;
      }
    }
    
    /**
      * Calculating Membership Discount
      * @return calculating route Membership discount
      */
    private double calcMembershipDiscount()
    {
      if(isMember==true){
        if(numpassengers==1)
        {
            return (5.0/100)*this.calcRoutePrice();
        }
        else if(numpassengers==2)
        {
            return (6.2/100)*this.calcRoutePrice();
        }
        else if(numpassengers>2)
        {
            return (8.0/100)*this.calcRoutePrice();
        }
        else
        {
            return 0.0;
        }
        
        }
     else
        {
            return 0.0;
        }
        
    }
    
    
    /**
      * Calculating First time discount value
      * @return first time discount value  
      */
    private double calcFirstTimeUserDiscount()
    {
      if(isFirstTimeUser){
        if(numpassengers==1)
        {
            return (10/100)*this.calcRoutePrice();
        }
        else if(numpassengers==2)
        {
            return (7/100)*this.calcRoutePrice();
        }
        else if(numpassengers>2)
        {
            return (4/100)*this.calcRoutePrice();
        }
        else
        {
            return 0.0;
        }
        }
      else
        {
            return 0.0;
        }
        
    }
    
    /**
      * Calculating  Coupon discount
      * @return Coupon discount value  
      */
    private double calcCouponDiscount()
    {
        if(haveCoupon==true)
        {
            return this.calcRoutePrice()-5;
        }
        else
        {
            return 0.0;
        }
        
    }
    
    /**
      * Calculating Total price
      * @return Total Price value  
      */
    private double totalPrice()
    {
        return this.calcCouponDiscount()-this.calcMembershipDiscount();
    }
    
    /**
      * Calculating pice along with sales tax
      * @return sales tax value  
      */
    private double totalPriceWithSalesTax()
    {
        return this.totalPrice()+((salesTax/100)*this.totalPrice());
    }
    
    /**
      * Printing receipt
      * @return Receipt value
      */
    public String printReceipt()
    {
        return "Receipt"+"\n"+"Travel Charges for "+numpassengers+" passengers on route "+routeNo+": $"+this.calcRoutePrice()+"\n"+"Membership Discount: $"+this.calcMembershipDiscount()+"\n"+"First Time user discount: $"+this.calcFirstTimeUserDiscount()+"\n"+"Coupon Discount: $"+this.calcCouponDiscount()+"\n"+"Charges After applying Discount: $"+this.totalPrice()+"\n"+"Total Price with Tax: $"+this.totalPriceWithSalesTax();
    }
    
    }

            
    
    

