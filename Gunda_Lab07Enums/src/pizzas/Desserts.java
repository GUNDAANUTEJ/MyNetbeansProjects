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
public enum Desserts {
    CHOCOLATE_FUDGE_CAKE(11.99),CHEESECAKE_BITES(10.49),DESSERT_NACHOS(14.49),LOADED_ICE_CREAM(4.49),NO_DESSERTS(0.00);
     private final double dessertPrice;

     /**
      * constructor
      * @param dessertPrice 
      */
    private Desserts(double dessertPrice) {
        this.dessertPrice = dessertPrice;
    }

    /**
     * gets the price
     * @return 
     */
    public double getDessertPrice() {
        return dessertPrice;
    }

}
