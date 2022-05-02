/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF;
import java.util.*;
/**
 *
 * @author S542408  
 */
public class TestLinkedList {
    
    public void display(LinkedList objList)
    {
        Iterator<Integer> objIterator = objList.iterator(); 
        System.out.print("List");
        while(objIterator.hasNext())
        {
            
            System.out.print("->" + objIterator.next());
        }
        System.out.println(" -> Null");
    }
    public void exerciseOne()
    {
        LinkedList<Integer> objLinkedList = new  LinkedList<>();
        display(objLinkedList);
        
        objLinkedList.addFirst(3);
        display(objLinkedList);
        
        objLinkedList.addFirst(2);
        display(objLinkedList);
        
        objLinkedList.addLast(6);
        display(objLinkedList);
        
        objLinkedList.addLast(8);
        display(objLinkedList);
        
        objLinkedList.addFirst(15);
        display(objLinkedList);
        
        objLinkedList.add(3, 17);
        display(objLinkedList);
        
        objLinkedList.add(5, 25);
        display(objLinkedList);
        
        objLinkedList.add(objLinkedList.indexOf(2) + 1, 34);
        display(objLinkedList);
        
        objLinkedList.set(4, 100);
        display(objLinkedList);
    
    }
    
}
