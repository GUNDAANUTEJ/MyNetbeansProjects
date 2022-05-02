/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclassroom;

import java.util.ArrayList;



/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class ArrayClassRoom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
Student s1 = new Student(1,"manideep", 3.00);
        Student s2 = new Student(2, "ram", 3.80);
        Student s3 = new Student(3, "kiran", 4.00);
        Student s4 = new Student(4, "shyam", 3.20);
        Student s5 = new Student(5, "siva", 2.80);
         
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        ArrayList<Student> myStudents = new ArrayList<Student>();


        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);
        myStudents.add(s4);
        myStudents.add(s5);


    
double max = 0.00;
        double min = myStudents.get(0).getGpa();
        double sum = 0;
        for (int i = 0; i < myStudents.size(); i++) {​​​​​​​
            if (myStudents.get(i).getGpa() > max) {​​​​​​​
                max = myStudents.get(i).getGpa();
            }​​​​​​​
        }​​​​​​​


        for (int i = 1; i < myStudents.size(); i++) {​​​​​​​
            min = Math.min(min, myStudents.get(i).getGpa());
        }​​​​​​​


        for (int i = 0; i < myStudents.size(); i++) {​​​​​​​
            sum = sum + myStudents.get(i).getGpa();
        }​​​​​​​
        double average =Math.round(sum / myStudents.size());


        System.out.println("max is:" + max);
        System.out.println("min is:" + min);
        System.out.println("Average is:" + average);


        for (int i = 0; i < myStudents.size(); i++)
        {​​​​​​​
            if(myStudents.get(i).getName().startsWith("s"))
            {​​​​​​​
                System.out.println(myStudents.get(i).getName());
            }​​​​​​​
           
        }​​​​​​​
    }
}






    
        
    
    

