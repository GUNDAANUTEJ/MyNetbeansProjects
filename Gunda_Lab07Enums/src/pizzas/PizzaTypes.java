/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *Class: 44542-02 Object Oriented Programming
 * @author Gunda Sai Naga Anu Teja
 * Description: Making sure everything works
 * Due: 03/24/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */
public enum PizzaTypes {
    HANDTOSSED_PIZZA(10.50,13.50,16.50),PAN_PIZZA(9.50,12.50,15.50);
    
    /**
     * Private variables
     */
    private final double smallPizzaPrice;
    private final double mediumPizzaPrice;
    private final double largePizzaPrice;

    /**
     * constructor with all the attributes
     * @param smallPizzaPrice
     * @param mediumPizzaPrice
     * @param largePizzaPrice 
     */
    private PizzaTypes(double smallPizzaPrice, double mediumPizzaPrice, double largePizzaPrice) {
        this.smallPizzaPrice = smallPizzaPrice;
        this.mediumPizzaPrice = mediumPizzaPrice;
        this.largePizzaPrice = largePizzaPrice;
    }

    /**
     * gets the pizza type
     * @return 
     */
    public static PizzaTypes getHANDTOSSED_PIZZA() {
        return HANDTOSSED_PIZZA;
    }

    /**
     * gets pan pizza
     * @return 
     */
    public static PizzaTypes getPAN_PIZZA() {
        return PAN_PIZZA;
    }

    /**
     * gets the price of small pizza
     * @return 
     */
    public double getSmallPizzaPrice() {
        return smallPizzaPrice;
    }

    /**
     * gets price of medium pizza
     * @return 
     */
    public double getMediumPizzaPrice() {
        return mediumPizzaPrice;
    }

    /**
     * gets price of large pizza
     * @return 
     */
    public double getLargePizzaPrice() {
        return largePizzaPrice;
    }

}
