/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pizzas.Sides.Cheese;

/**
 * Class: 44542-02 Object Oriented Programming
 *
 * @author Gunda Sai Naga Anu Teja 
 * Description: Making sure everything works
 * Due: 03/24/21 I pledge that I have completed the programming assignment
 * independently. I have not copied the code from a student or any source. I
 * have not given my code to any other student and will not share this code with
 * anyone under my circumstances.
 */
public class OrdersDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        // TODO code application logic here
        Scanner scan = new Scanner(new File("input.txt"));
        System.out.println("*****************************************************");
        System.out.println("*********************** Pizza Hut ******************");
        System.out.println("*****************************************************");
        while (scan.hasNext()) 
        {
            OrdersSummary orderSum = new OrdersSummary();
            String date = scan.nextLine();
            Days.getOrderDayOfWeek(date);
            String pizzaName = scan.nextLine();
            
            PizzaTypes pizzaEnum = PizzaTypes.valueOf(pizzaName.toUpperCase().replaceAll(" ", "_"));
            String size = scan.next();
            int quty = scan.nextInt();
            scan.nextLine();
            String sauceName = scan.nextLine();
            Sauces sauceenum = Sauces.valueOf(sauceName.toUpperCase().replaceAll(" ", "_"));
            String sidesName="";
            do
            {
             sidesName = sidesName+scan.next()+" ";
            }while(!(scan.hasNext("-")));
                
            scan.next();
            scan.skip("\\s*");
            Sides sidesEnum = Sides.valueOf(sidesName.trim().toUpperCase().replaceAll(" ", "_"));
            String sideSize = scan.nextLine();
            String cheese = scan.nextLine();
            Cheese cheeseEnum = Cheese.valueOf(cheese.toUpperCase().replaceAll(" ", "_"));
            String drinks = scan.nextLine();
            Drinks drinksEnum = Drinks.valueOf(drinks.toUpperCase().replaceAll(" ", "_"));
            String dessert = scan.nextLine();
            Desserts dessertEnum = Desserts.valueOf(dessert.trim().toUpperCase().replaceAll(" ", "_"));
            Order order = new Order(pizzaEnum, size.toUpperCase(), quty, sauceenum, sidesEnum, sideSize, drinksEnum, cheeseEnum, dessertEnum);
            orderSum.addAOrder(order);
            System.out.println(orderSum.printReceipt(date));
            
        }
        scan.close();

    }
    
}
