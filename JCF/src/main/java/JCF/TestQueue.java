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
* Test the all the classes that implements Queue interface
 
 * 
 */
public class TestQueue 
{
    /**
    * Test PriorityQueue
    */
    public void testPriorityQueue()
    {  
        // Creating PriorityQueue
        Queue<String> queue = new PriorityQueue<>();
        // Adding object in PriorityQueue
        queue.add("X");
        queue.add("Y");
        queue.add("Z");
       
        
        //Display the PriorityQueue
       System.out.println(queue);
        
       // Removal of an element
       queue.remove("X");
       
        //Display the PriorityQueue
       System.out.println(queue);
       
       // Checking emptiness
       if (queue.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the PriorityQueue
       System.out.println(queue.size());
    }
    
    
     /**
    * Test ArrayDeque
    */
    public void testArrayDeque()
    {  
        // Creating ArrayDeque
        Queue<String> queue = new ArrayDeque<>();
        // Adding object in ArrayDeque
        queue.add("X");
        queue.add("Y");
        queue.add("Z");
        
        //Display the ArrayDeque
       System.out.println(queue);
        
       // Removal of an element
       queue.remove("X");
       
        //Display the ArrayDeque
       System.out.println(queue);
       
       // Checking emptiness
       if (queue.isEmpty())
       {
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
       
       // Compute the size of the ArrayDeque
       System.out.println(queue.size());
    }
    
}
