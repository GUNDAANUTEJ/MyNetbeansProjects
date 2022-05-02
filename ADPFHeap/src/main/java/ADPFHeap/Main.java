/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADPFHeap;

/**
 *
 * @author S542408
 */
public class Main {
    
    public static void main(String[] args)
    {
            Heap objMinHeap = new Heap(5);
            objMinHeap.insert(5);
            objMinHeap.insert(3);
            objMinHeap.insert(2);
            objMinHeap.insert(1);
            int x = objMinHeap.delete();
            objMinHeap.display();
            
                 
    }
    
}
