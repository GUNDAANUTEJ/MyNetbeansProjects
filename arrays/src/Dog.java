/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ajay
 */
public class Dog {
    private int age;
    private String name;
    private double price;

    public Dog(int age, String name, double price) {
        this.age = age;
        this.name = name;
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", name=" + name + ", price=" + price + '}';
    }
    
    
}