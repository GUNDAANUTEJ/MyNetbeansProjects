/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gadject;

/**
 *
 * @author S542408
 */
public class Gadject {
private int id;
private String name;
private double price;


        
        public Gadject(int id, String name, double price) {
        this.id = id;
        this.name = name ;
        this.price = price ;
        }
        
public Gadject(String name, double price) {
        this.id = id;
        this.price = price;
        
        }
        
public int setId() {
    return id;
} 

Pubic Gadject(){ 

this.id = -99 ;
        this.name = "not yet invented";
        this.price = -99.99 ;
        
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Gadject g1= new Gadject(12, "ram", 500.60);
     
        Gadject g2 = new Gadject(14,"Samaung nexus",600.4) ;
        System.out.println(g2);
        
        Gadject g3 = new Gadject("Nokia", 12);
        System.out.println(g3);
        
        
        Gadject g4 = new Gadject();
        System.out.println(g4);
    }
    
}
