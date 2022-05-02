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
public class MaxHeap {
    
    private int Arr[];
    private int maxSize;
    private int size;
    int height = 0;

    public MaxHeap(int maxSize) {
        Arr = new int[maxSize];
        this.maxSize = maxSize;
        size = 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Heap is Empty");
        } else {
            System.out.println("Problem-01: ");
            for (int i = 1; i <= size; i++) {
                System.out.print(Arr[i] + " " );
            }
            System.out.println("\n");
        }

    }

    public int indexOfParent(int indexOfChild) {
        return (indexOfChild == 1 ? 1 : indexOfChild / 2);
    }

    public int indexOfLeftChild(int indexOfParent) {
        return (2 * indexOfParent <= size ? 2 * indexOfParent : indexOfParent);
    }

    public int indexOfRightChild(int indexOfParent) {
        return (2 * indexOfParent + 1 <= size ? 2 * indexOfParent + 1 : 
                indexOfParent);
    }

    public boolean isEmpty() {
        return (size < 1);
    }

    public void insert(int value) {
        if (size < maxSize - 1) {
            size++;
            Arr[size] = value;
            heapifyUp();
        } else {
            System.out.println("Heap is full");
        }
    }

    public void heapifyUp() {
        if (size == 1) {
        } else {
            int tempIndex = size;
            while (true) {
                int parentIndex = indexOfParent(tempIndex);
                if (Arr[tempIndex] > Arr[parentIndex]) {
                    swap(parentIndex, tempIndex);
                    tempIndex = parentIndex;
                } else {
                    break;
                }

            }
        }
    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("Heap is empty");
        } else {
            int temp = Arr[1];
            Arr[1] = Arr[size];
            size = size - 1;
            heapifyDown();
        }
    }

    public void heapifyDown() {
        int tempIndex = 1;
        while (true) {
            int leftIndex = indexOfLeftChild(tempIndex);
            int rightIndex = indexOfRightChild(tempIndex);
            if (tempIndex == leftIndex && tempIndex != rightIndex) {
                if (Arr[tempIndex] < Arr[rightIndex]) {
                    swap(tempIndex, rightIndex);
                    tempIndex = rightIndex;
                } else {
                    break;
                }
            } else if (tempIndex != leftIndex && tempIndex == rightIndex) {
                if (Arr[tempIndex] < Arr[leftIndex]) {
                    swap(tempIndex, leftIndex);
                    tempIndex = leftIndex;
                } else {
                    break;
                }
            } else if (tempIndex != leftIndex && tempIndex != rightIndex) {
                int minIndex = (Arr[leftIndex] > Arr[rightIndex] ? leftIndex : rightIndex);
                if (Arr[tempIndex] < Arr[minIndex]) {
                    swap(tempIndex, minIndex);
                    tempIndex = minIndex;
                } else {
                    break;
                }
            } else {
                break;
            }

        }
    }

    public void swap(int firstIndex, int secondIndex) {
        int temp = Arr[firstIndex];
        Arr[firstIndex] = Arr[secondIndex];
        Arr[secondIndex] = temp;
    }

    public int kthLargest(int k) {
        int[] tempArr = new int[size];
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return 0;
        } else if (k == 0 || k > size) {
            System.out.println("No element for the given K value");
            return 0;
        } else {
            for (int i = 0; i < size; i++) {
                tempArr[i] = Arr[i];
            }

            int temp;
            for (int i = 1; i < tempArr.length; i++) {
                for (int j = i + 1; j < tempArr.length; j++) {
                    if (tempArr[i] < tempArr[j]) {
                        temp = tempArr[i];
                        tempArr[i] = tempArr[j];
                        tempArr[j] = temp;
                    }
                }
            }
            
            System.out.println("Problem-02:\nkth Largest is: " + tempArr[k]+"\n");
        }
        return tempArr[k];

    }
    


    public int height() {
        
        if (isEmpty()) {
            System.out.println("Heap is empty");
            return height;
        } else {

            int i = 0;

            while (true) {
                if (Math.pow(2, i) <= size && size <= (Math.pow(2, i + 1) - 1)) {
                    height = i;
                    break;
                } else {
                    i++;
                }
            }

            System.out.println("Problem-03:\nThe Height is: " + height+"\n");
        }

        return height;
        
    }

    public int[] levelSum() {
        int[] sumArr = new int[height + 1];
        if (isEmpty()) {
            System.out.println("Heap is empty");
        } 
        else {
            int j = 1;
            for (int i = 0; i < sumArr.length; i++) {
                while (Math.pow(2, i) <= j && j <= (Math.pow(2, i + 1) - 1)) {
                    sumArr[i] += Arr[j];
                    ++j;
                }
                
            }

            System.out.print("Problem-04:\n Sum of elements at each level is: ");
            for (int i = 0; i < sumArr.length; i++) {

                System.out.print(sumArr[i] + " ");
            }
            System.out.println("");

        }

        return sumArr;
    }

}
