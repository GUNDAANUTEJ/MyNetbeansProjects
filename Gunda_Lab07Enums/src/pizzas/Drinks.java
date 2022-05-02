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
public enum Drinks {
    FOUNTAIN_SODA_20_OZ(2.99), RED_BULL(4.29), IZZE_SPARKLING_JUICE(2.79), FRESH_BREWED_ICED_TEA(2.99), WATER(0.00);
    private final double drinkPrice;

    /**
     * constructor with parameters
     * @param drinkPrice 
     */
    private Drinks(double drinkPrice) {
        this.drinkPrice = drinkPrice;
    }

    /**
     * gets price of drink
     * @return 
     */
    public double getDrinkPrice() {
        return drinkPrice;
    }

}
