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
public class Node<T> {
    
    T data;
    Node left;
    Node right;
    Node(T x){
        data = x;
        left = null;
        right = null;
    }
}
