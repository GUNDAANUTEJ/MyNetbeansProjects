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
public class TestCustomStack<T> {
    
    private Deque<T> deque = new ArrayDeque<>();
    
    public void push(T value)
    {
         deque.add(value);
    }
    public void pop()
    {
        deque.removeLast();
    }
    public int size()
    {
        return deque.size();
    }
    public boolean isEmpty()
    {
        return deque.isEmpty();
    }
    public void display()
    {
        System.out.println(deque);
    }
}
