/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultmethods;

/**
 *
 * @author S542408
 */
public class DefaultDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Myclass class01 = new Myclass();
        
        System.out.println(class01.foo(3));
        System.out.println(class01.goo("Goodbye"));

        
    }
    
}
