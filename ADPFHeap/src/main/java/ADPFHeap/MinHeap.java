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
public class MinHeap {
    private int A[];
    private int maxSize;
    private int size;
    
    public MinHeap(int maxSize)
    {
        A = new int[maxSize];
        this.maxSize = maxSize;
        size = 0;
    }
    
    public void display()
    {
        for(int i=1; i<=size; i++)
        {
            System.out.print(A[i]+" ");
        }
        
    }
    public int indexOfParent(int indexOfChild)
    {
        return (indexOfChild==1? 1:indexOfChild/2);
    }
    
    public int indexofLeftChild(int indexOfParent)
    {
        return (2*indexOfParent<=size?2*indexOfParent:indexOfParent);
    }
    
    public int indexofRightChild(int indexOfParent)
    {
        return (2*indexOfParent + 1 <= size ? 2*indexOfParent 
                + 1:indexOfParent);
    }
    
    public boolean isEmpty()
    {
        return (size < 1);
    }
    
    public void insert(int value)
    {
        if (size < maxSize-1)
        {
               size = size + 1;
               A[size] = value;
               heapifyUp();
        }
        else
        {
            System.out.println("Heap is full");
            System.exit(0);
        }
    }
    
    public void heapifyUp()
    {
        if (size == 1){}
        else
        {
            int tempIndex = size;
            while(true)
            {
                int parentIndex = indexOfParent(tempIndex);
                if (A[tempIndex] < A[parentIndex])
                {
                    swap(parentIndex, tempIndex);
                    tempIndex = parentIndex;
                }
                else
                {
                    break;
                }
            
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
        while (true)
        {
            int leftIndex = indexofLeftChild(tempIndex);
            int rightIndex =  indexofRightChild(tempIndex);
            if (tempIndex==leftIndex && tempIndex != rightIndex)
            {
                if(A[tempIndex] > A[rightIndex])
                {
                    swap(tempIndex, rightIndex);
                    tempIndex = rightIndex;
                }
                else
                {
                    break;
                }
            }
            else if (tempIndex!=leftIndex && tempIndex == rightIndex)
            {
                 if(A[tempIndex] > A[leftIndex])
                {
                    swap(tempIndex, leftIndex);
                    tempIndex = leftIndex;
                }
                else
                {
                    break;
                }
            }
            else if (tempIndex != leftIndex && tempIndex != rightIndex)
            {
                int minIndex = (A[leftIndex]<A[rightIndex]?leftIndex:rightIndex);
                 if(A[tempIndex] > A[minIndex])
                {
                    swap(tempIndex, minIndex);
                    tempIndex = minIndex;
                }
                else
                {
                    break;
                }
            }
            else
            {
                break;
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