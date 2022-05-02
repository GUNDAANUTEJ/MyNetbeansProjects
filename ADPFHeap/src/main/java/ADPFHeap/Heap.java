/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADPFHeap;
import java.lang.*;
/**
 *
 * @author S542408
 */
public class Heap {
    
    private int[] A;
    private int size;
    private int maxSize;
    
    public Heap(int maxSize)
    {
        A = new int[maxSize];
        size = 0;
        this.maxSize = maxSize;
    }
    public void display()
    {
        for(int i=1; i<=size; i++)
        {
            System.out.print(A[i]+" ");
        }
        
    }
    
    public boolean isEmpty()
    {
        return (size < 1);
    }
    public int indexOfLeft(int indexOfParent)
    {
       return (2*indexOfParent <= size? 2*indexOfParent: indexOfParent);
    }
    
    public int indexOfRight(int indexOfParent)
    {
        return (2*indexOfParent + 1 <= size? 2*indexOfParent + 1: indexOfParent);
    }
    
    public int indexOfParent(int indexOfChild)
    {
        return indexOfChild == 1 ? 1 : indexOfChild/2;
    }
    
   
    
    public void insert(int value)
    {
        size += 1;
        if (size < maxSize)
        {
            A[size] = value;
        }
        else
        {
            System.out.println("Heap is full");
        }
        
        if(size !=1)
        {        
            heapifyUp();  
        }
    }
    
    public void heapifyUp()
    {
        int tempSize = size;
        while(tempSize != 1)
        {
            int parentIndex = indexOfParent(tempSize);
            if (A[tempSize] < A[parentIndex])
            {
                swap(parentIndex, tempSize);
                tempSize = parentIndex;
            }
            else
            {
                break;
            }
        }
    }
    
    public int delete()
    {
        if (isEmpty())
        {
            System.out.println("Heap is empty");
            System.exit(0);
            return 0;
        }
        else
        {
            int temp = A[1];
            A[1] = A[size];
            size = size - 1;
            heapifyDown();
            return temp;
        }
    }
    
    public void heapifyDown()
    {
        int tempIndex = 1;
        while(true)
        {
            int leftIndex = indexOfLeft(tempIndex);
            int rightIndex = indexOfRight(tempIndex);
            if (tempIndex == leftIndex && tempIndex == rightIndex)
            {
                break;
            }
            else if (tempIndex == leftIndex && tempIndex != rightIndex)
            {
                if (A[tempIndex] > A[rightIndex])
                {
                    swap(tempIndex, rightIndex);
                    tempIndex = rightIndex;
                }
                else
                {
                    break;
                }
            }
            else if (tempIndex == rightIndex && tempIndex != leftIndex)
            {
                   if (A[tempIndex] > A[leftIndex])
                   {
                    swap(tempIndex, leftIndex);
                    tempIndex = leftIndex;
                    }
                    else
                    {
                        break;
                    } 
            }
            else
            {
                int minIndex = (A[leftIndex]<A[rightIndex]?leftIndex:rightIndex);
                if (A[tempIndex] > A[minIndex])
                {
                    swap(tempIndex, minIndex);
                    tempIndex = minIndex;
                }
                else
                {
                    break;
                }
            }
        }
    
    }
    
    public void swap(int firstIndex, int secondIndex)
    {
        int temp = A[firstIndex];
        A[firstIndex] = A[secondIndex];
        A[secondIndex] = temp;
    }
    
}
