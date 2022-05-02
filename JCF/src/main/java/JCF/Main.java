/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF;

/**
 *
 * @author XY
 */
public class Main 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
     BinarySearchTree<Integer> objBst = new  BinarySearchTree<>{};
    objBst.add(10);
    objBst.add(18);
    objBst.add(15);
    objBst.BFT();
    
    }
        
//        TestLinkedList objTestLinkedList = new TestLinkedList();
//        objTestLinkedList.exerciseOne();
//        // Test List
//        /*
//        TestList list = new TestList();
//        list.testArrayList();
//        list.testLinkedList();
//        */
//        
//        // Test Set
//        /*
//        TestSet set = new TestSet();
//        set.testHashSet();
//        set.testTreeSet();
//        */
//        
//        //Test Queue
//        /*
//        TestQueue queue = new TestQueue();
//        queue.testPriorityQueue();
//        queue.testArrayDeque();
//        */
//        
//        // Test Map
//        /*
//        TestMap map = new TestMap();
//        map.testHashMap();
//        map.testTreeMap();
//        */
//    }
    

