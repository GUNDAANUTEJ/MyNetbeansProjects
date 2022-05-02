/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF;
import java.util.*;
/**
 *
 * @author XY
 */
 /**
 * Test the all the classes that implements List interface
*/
public class TestList 
{
    /**
    * Test ArrayList
    */
    public void testArrayList()
    {  
        // Creating arraylist
        List<String> list = new ArrayList<>();
        // Adding object in arraylist
        list.add("X");
        list.add("Y");
        list.add("Z");
        
        //Display the ArrayList
       System.out.println(list);
        
       // Removal of an element
       list.remove("X");
       
        //Display the ArrayList
       System.out.println(list);
       
       // Checking emptiness
       if (list.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the ArrayList
       System.out.println(list.size());
    }
    
    /**
     * Test LinkedList
    */
     public void testLinkedList()
    {  
        // Creating arraylist
        List<String> list = new LinkedList<>();
        // Adding object in arraylist
        list.add("X");
        list.add("Y");
        list.add("Z");
        
        //Display the ArrayList
       System.out.println(list);
        
       // Removal of an element
       list.remove("X");
       
        //Display the ArrayList
       System.out.println(list);
       
       // Checking emptiness
       if (list.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the ArrayList
       System.out.println(list.size());
    }
}
