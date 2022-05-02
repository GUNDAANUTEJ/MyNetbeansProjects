/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelexpenses;
import java.util.Scanner;
/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class RouteDriver {

    /**
     * @param args the command line arguments
     */
    
    /**
 * Given a driver class of the RouteCalculator.
 */

    public static void main(String[] args) {
        
        // TODO code application logic here
        
          
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter User Details:");
        
        System.out.println("Select the routes from 1, 2 and 3: ");
        
        int rn = scan.nextInt();
        
        System.out.println("How many number of passengers: ");
        
        int np = scan.nextInt();
        
        System.out.println("Are you a member: ");
        
        boolean me = scan.nextBoolean();
        
        System.out.println("Are you a first time user: ");
        
        boolean ft = scan.nextBoolean();
        
        System.out.println("Do you have coupon: ");
        
        boolean cp = scan.nextBoolean();
        /**
         * Creates a new Object rc for the Route Calculator Class.
         */
        RouteCalculator rc = new RouteCalculator(rn,np,me,ft,cp);
        
        System.out.println("*******************************");
        
        
        if((rn == 1 || rn==2 || rn ==3)&&(np != 0))
        {
            if(me==true && ft==true)
            {
               
                System.out.println("User cannot be a member and first time user at a time.");
                System.out.println("Please try again.");
                
            }
            else
            {
                System.out.println("User Route details:");
                System.out.println(rc.toString());
                System.out.println("*******************************");
                System.out.println(rc.printReceipt());
            }
        }
        else
        {
            if(rn != 1 && rn!=2 && rn !=3)
            {
                System.out.println("Route number should be 1 or 2 or 3");
                if((np == 0))
                {
                    System.out.println("Passenger number can't be zero.");
                    if(me==true && ft==true)
                    {
                        System.out.println("User cannot be a member and first time user at a time.");
                        System.out.println("Please try again.");
                    }
                    else
                    {
                        System.out.println("Please try again.");
                    }
                
                }
                else
                {
                    System.out.println("Please try again.");
                }
                
                
            }
            else
            {
                if((np == 0))
                {
                    System.out.println("Passenger number can't be zero.");
                    if(me==true && ft==true)
                    {
                        System.out.println("User cannot be a member and first time user at a time.");
                        System.out.println("Please try again.");
                    }
                    else
                    {
                        System.out.println("Please try again.");
                    }
                
                }
                else
                {
                    System.out.println("Please try again.");
                }
            }
        }
        
    }
  
        
    }
    

