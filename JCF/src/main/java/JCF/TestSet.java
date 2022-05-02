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
* Test the all the classes that implements Set interface
 
 * 
 */
public class TestSet 
{
    /**
    * Test HashSet
    */
    public void testHashSet()
    {  
        // Creating HashSet
        Set<String> set = new HashSet<>();
        // Adding object in HashSet
        set.add("X");
        set.add("Y");
        set.add("Z");
        
        //Display the HashSet
       System.out.println(set);
        
       // Removal of an element
       set.remove("X");
       
        //Display the HashSet
       System.out.println(set);
       
       // Checking emptiness
       if (set.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the HashSet
       System.out.println(set.size());
    }
    
    
     /**
    * Test TreeSet
    */
    public void testTreeSet()
    {  
        // Creating TreeSet
        Set<String> set = new TreeSet<>();
        // Adding object in TreeSet
        set.add("X");
        set.add("Y");
        set.add("Z");
        
        //Display the TreeSet
       System.out.println(set);
        
       // Removal of an element
       set.remove("X");
       
        //Display the TreeSet
       System.out.println(set);
       
       // Checking emptiness
       if (set.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the TreeSet
       System.out.println(set.size());
    }
    
}
