/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzas;

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
public class Order {

    /**
     * private variables
     */
    private PizzaTypes pizzasName;
    private String pizzasSize;
    private int quantity;
    private Sauces sauce;
    private Sides side;
    private String sideSize;
    private Drinks drink;
    private Sides.Cheese cheese;
    private Desserts dessert;
    private Double cost;

    /**
     * Constructor with all variables
     * @param pizzasName
     * @param pizzasSize
     * @param quantity
     * @param sauce
     * @param side
     * @param sideSize
     * @param drink
     * @param cheese
     * @param dessert 
     */
    public Order(PizzaTypes pizzasName, String pizzasSize, int quantity, Sauces sauce, Sides side, String sideSize, Drinks drink, Sides.Cheese cheese, Desserts dessert) {
        this.pizzasName = pizzasName;
        this.pizzasSize = pizzasSize;
        this.quantity = quantity;
        this.sauce = sauce;
        this.side = side;
        this.sideSize = sideSize;
        this.drink = drink;
        this.cheese = cheese;
        this.dessert = dessert;
    }

    /**
     * gets pizza name
     * @return 
     */
    public PizzaTypes getPizzasName() {
        return pizzasName;
    }

    /**
     * gets size of pizza
     * @return 
     */
    public String getPizzasSize() {
        return pizzasSize;
    }

    /**
     * gets quantity
     * @return 
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * gets Sauces 
     * @return 
     */
    public Sauces getSauce() {
        return sauce;
    }

    /**
     * gets sides
     * @return 
     */
    public Sides getSide() {
        return side;
    }

    /**
     * gets sides size
     * @return 
     */
    public String getSideSize() {
        return sideSize;
    }

    /**
     * gets drinks
     * @return 
     */
    public Drinks getDrink() {
        return drink;
    }

    /**
     * gets cheese
     * @return 
     */
    public Sides.Cheese getCheese() {
        return cheese;
    }

    /**
     * gets desserts
     * @return 
     */
    public Desserts getDessert() {
        return dessert;
    }

    /**
     * gets cost
     * @return 
     */
    public Double getCost() {
        return cost;
    }

    /**
     * gets desert cost
     * @return 
     */
    public double calcDessertCost() {
        return dessert.getDessertPrice();
    }

    /**
     * gets sauce cost
     * @return 
     */
    public double calcSauceCost() {
        return sauce.getPriceOfSauce();
    }

    /**
     * gets cheese cost
     * @return 
     */
    public double calcCheeseCost() {
        return cheese.getCheesePrice();
    }

    /**
     * gets drink cost
     * @return 
     */
    public double calcDrinkCost() {
        return drink.getDrinkPrice();
    }

    /**
     * gets sides cost
     * @return 
     */
    public double calcSideCost() {
        if (sideSize.equalsIgnoreCase("small")) {
            return side.getSmallSidesPrice();
        } else if (sideSize.equalsIgnoreCase("family")) {
            return side.getFamilySidesPrice();
        } else if (sideSize.equalsIgnoreCase("party")) {
            return side.getPartySidesPrice();
        } else {
            return 0.00;
        }
    }

    /**
     * gets pizza cost based on its size
     * @return 
     */
    public double calcPizzasCost() {
        if (pizzasSize.equalsIgnoreCase("small")) {
            return pizzasName.getSmallPizzaPrice();
        } else if (pizzasSize.equalsIgnoreCase("medium")) {
            return pizzasName.getMediumPizzaPrice();
        } else if (pizzasSize.equalsIgnoreCase("large")) {
            return pizzasName.getLargePizzaPrice();
        } else {
            return 0.00;
        }
    }

    /**
     * gets 50 discount
     * @param orderDate
     * @return 
     */
    public double calcDiscount(String orderDate) {
        if (Days.isDiscountDay(orderDate)) {
            if (pizzasName.name().equals("HANDTOSSED_PIZZA")) {
                int s = 100 - 50;

                return quantity * ((s * calcPizzasCost()) / 100);
            } else {

                return 0.00;
            }
        } else {

            return 0.00;
        }
    }

    /**
     * gets total cost
     * @param orderDate
     * @return 
     */
    public double getTotalCost(String orderDate) {
        cost = (calcDessertCost() + calcSauceCost() + calcCheeseCost() + calcDrinkCost() + calcSideCost() + quantity * calcPizzasCost());
        return cost;
    }

    /**
     * returns all the variables with toString method
     * @param orderDate
     * @return 
     */
    public String toString(String orderDate) {
        return "PIZZA TYPE: " + pizzasName.toString().replaceAll("_", " ") + "\n" + "PIZZA SIZE: " + 
                pizzasSize + "\n" + "QUANTITY: " + quantity + "\n" + 
                "SAUCE: " + sauce.toString().replaceAll("_", " ") + "\n" + "SIDES: " + side.toString().replaceAll("_", " ") + " (" + 
                sideSize + ")" + "\n" + "CHEESE: " + cheese.toString().replaceAll("_", " ") + "\n" + "DRINKS: " +
                drink.toString().replaceAll("_", " ") + "\n" + "DESSERTS: " + dessert.toString().replaceAll("_", " ") + "\n" + "COST: " + 
                Math.round(getTotalCost(orderDate) * 100.0) / 100.0;
    }

}
