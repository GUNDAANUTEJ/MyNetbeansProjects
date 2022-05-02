/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF;

/**
 *
 * @author S542408
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        TestCustomStack<Integer> stack = new TestCustomStack();
        stack.push(2);
        System.out.println(stack.isEmpty());
        stack.push(3);
        stack.pop();
        System.out.println(stack.size());
        stack.display();
    }
    
}
