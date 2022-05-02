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
public enum Sauces {
    PESTO(0.20),TOMATO(0.15),BECHAMEL(0.25),BBQ(0.35),HUMMUS(0.10),MARINARA(0.13),TAPENADE(0.15),PUMPKIN_PIZZA_SAUCE(0.35),NO_SAUCE(0.00);
    /**
     * private variables
     */
    private final double priceOfSauce;

    /**
     * constructors with attributes
     * @param priceOfSauce 
     */
    private Sauces(double priceOfSauce) {
        this.priceOfSauce = priceOfSauce;
    }

    /**
     * gets sauces obj
     * @return 
     */
    public static Sauces getPESTO() {
        return PESTO;
    }

    /**
     * gets tomato
     * @return 
     */
    public static Sauces getTOMATO() {
        return TOMATO;
    }

    /**
     * gets bechamel
     * @return 
     */
    public static Sauces getBECHAMEL() {
        return BECHAMEL;
    }

    /**
     * gets BBQ
     * @return 
     */
    public static Sauces getBBQ() {
        return BBQ;
    }

    /**
     * gets HUMMUS
     * @return 
     */
    public static Sauces getHUMMUS() {
        return HUMMUS;
    }

    /**
     * marinara
     * @return 
     */
    public static Sauces getMARINARA() {
        return MARINARA;
    }

    /**
     * tapenade
     * @return 
     */
    public static Sauces getTAPENADE() {
        return TAPENADE;
    }

    /**
     * gets
     * @return 
     */
    public static Sauces getPUMPKIN_PIZZA_SAUCE() {
        return PUMPKIN_PIZZA_SAUCE;
    }

    /**
     * no sauce
     * @return 
     */
    public static Sauces getNO_SAUCE() {
        return NO_SAUCE;
    }

    /**
     * gets the price
     * @return 
     */
    public double getPriceOfSauce() {
        return priceOfSauce;
    }
    
}
