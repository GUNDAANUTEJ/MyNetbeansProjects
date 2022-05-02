/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JCF;


/**
 *
 * @author s542408
 */
public class BinarySearchTree<T extends Comparable<T>> {
    
    private Node<T> root;
    
    BinarySearchTree()
    {
        root = null;
    }
    
    private void addRecursive(Node<T> objNode, T value)
    {
       if (objNode.data.compareTo(value) > 0)
       {
           if(objNode.left != null)
           {
            addRecursive(objNode.left, value);
           }
           else
           {
               objNode.left = new Node<>(value);
           }
       }
       else
       {
            if(objNode.right != null)
           {
            addRecursive(objNode.right, value);
           }
           else
           {
               objNode.right = new Node<>(value);
           }
       }  
    }
    public void add(T value)
    {
        if (root==null)
        {
            root = new Node<>(value);
            
        }
        else
        {
            addRecursive(root, value);
        }
    }
    
    public void display()
    {
        displayRecursive(root);
    }
    private void displayRecursive(Node<T> objNode)
    {
        if (objNode.left != null)
        {
            displayRecursive(objNode.left);
        }
        
        System.out.println(objNode.data);
        
        if (objNode.right != null)
        {
            displayRecursive(objNode.right);
        }
    }
    public void BFT()
    {
        Deque<Node<T>> objQueue = new ArrayDeque<>();
        if(root != null)
        {
            objQueue.add(root);
            BFTRecursive(objQueue);
        }
    }
    private void BFTRecursive(Deque<Node<T>> objQueue)
    {
        if(objQueue.isEmpty()) {}
        else
        {
            Node<T> objNode = objQueue.element();
            System.out.println(objNode.data);
            if(objNode.left !=null)
            {
                objQueue.add(objNode.left);
                
            }
            if(objNode.right !=null)
            {
                objQueue.add(objNode.right);
            }
            objQueue.remove();
            BftRecursive(objQueue);
            
        }
    }
}
