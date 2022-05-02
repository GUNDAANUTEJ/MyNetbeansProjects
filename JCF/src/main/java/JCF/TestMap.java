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
* Test the all the classes that implements Map interface
 
 * 
 */
public class TestMap 
{
    /**
    * Test HashMap
    */
    public void testHashMap()
    {  
        // Creating HashMap
        Map<Integer, String> map = new HashMap<>();
        // Adding object in HashMap
        map.put(1, "X");
        map.put(2, "Y");
        map.put(3, "Z");
        
        //Display the HashMap
       System.out.println(map);
    
       // Removal of an element
       map.remove(1, "X");
       
        //Display the HashMap
       System.out.println(map);
       
       // Checking emptiness
       if (map.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the HashMap
       System.out.println(map.size());
    }
    
    
     /**
    * Test TreeMap
    */
    public void testTreeMap()
    {  
       // Creating TreeMap
        Map<Integer, String> map = new HashMap<>();
        // Adding object in TreeMap
        map.put(1, "X");
        map.put(2, "Y");
        map.put(3, "Z");
        
        //Display the TreeMap
       System.out.println(map);
        
       // Removal of an element
       map.remove(1, "X");
       
        //Display the TreeMap
       System.out.println(map);
       
       // Checking emptiness
       if (map.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the TreeMap
       System.out.println(map.size());
    }
    
}
