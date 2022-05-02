/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cats;

/**
 *
 * @author S542408
 */
public class CatDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cat c1= new Cat("Kit",2);
        Cat c2= new Cat("Kit",2);
        Cat c3 = new Cat("Kitten", 3);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c2.equals(c3));
        
        System.out.println(c1==c2);
        System.out.println(c1==c3);
        System.out.println(c2==c3);
    }
    
}
