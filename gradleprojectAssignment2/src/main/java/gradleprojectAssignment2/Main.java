/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleprojectAssignment2;

/**
 *
 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Problem1  
        Problem1 rootNode = new Problem1(8);
        rootNode.leftn = new Problem1(3);
        rootNode.rightn = new Problem1(10);
        rootNode.leftn.leftn = new Problem1(1);
        rootNode.leftn.rightn = new Problem1(6);
        rootNode.leftn.rightn.leftn = new Problem1(4);
        rootNode.leftn.rightn.rightn = new Problem1(7);
        rootNode.rightn.rightn = new Problem1(14);
        rootNode.rightn.rightn.leftn = new Problem1(13);
        System.out.println("Output for Problem1: ");
        System.out.println("Maximum width of given BST is: " +Problem1.computeWidth(rootNode));
        System.out.println("");
        
        //ProblemTwo
        Problem2 minNode = new Problem2(8);
        minNode.leftn = new Problem2(3);
        minNode.rightn = new Problem2(10);
        minNode.leftn.leftn = new Problem2(1);
        minNode.leftn.rightn = new Problem2(6);
        minNode.leftn.rightn.leftn = new Problem2(4);
        minNode.leftn.rightn.rightn = new Problem2(7);
        minNode.rightn.rightn = new Problem2(14);
        minNode.rightn.rightn.leftn = new Problem2(13);
        System.out.println("Output for Problem2: ");
        System.out.println("Minimum Element of given BST is: " +Problem2.min(minNode));
        System.out.println("");

        //ProblemThree
        Problem3 BinaryNode = new Problem3(8);
        BinaryNode.leftn = new Problem3(3);
        BinaryNode.rightn = new Problem3(10);
        BinaryNode.leftn.leftn = new Problem3(1);
        BinaryNode.leftn.rightn = new Problem3(6);
        BinaryNode.leftn.rightn.leftn = new Problem3(4);
        BinaryNode.leftn.rightn.rightn = new Problem3(7);
        BinaryNode.rightn.rightn = new Problem3(14);
        BinaryNode.rightn.rightn.leftn = new Problem3(13);
        System.out.println("Output for Problem3 is: ");
        System.out.println("Sum of all Elements in given BST: " +Problem3.sum(BinaryNode));
    }
    
}

