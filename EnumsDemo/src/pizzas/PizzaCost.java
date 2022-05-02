/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public enum PizzaCost {
    SMALL(5, 0.2), MEDIUM(7.5, 0.5), LARGE(10, 1), XL(12, 1.2);
    
    private final double price;
    private final double discountRate;

    public double getDiscountRate() {
        return discountRate;
    }

    private PizzaCost(double price, double discountRate) {
        this.price = price;
        this.discountRate = discountRate;
    }

    private PizzaCost(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public double priceAfterDiscount() {
        return price-(price*discountRate/100);
       
    }
    
}
