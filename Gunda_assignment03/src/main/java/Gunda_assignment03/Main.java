/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gunda_assignment03;

/**
 *
 * @author S542408
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MaxHeap maxw = new MaxHeap(30);

        maxw.insert(100);
        maxw.insert(77);
        maxw.insert(55);
        maxw.insert(88);
        maxw.insert(3);
        maxw.insert(66);
        maxw.insert(33);
        maxw.insert(99);
        maxw.insert(22);
        maxw.insert(9);

        maxw.display();

        maxw.kthLargest(1);

        maxw.height();
        
        maxw.levelSum();

    }

}
