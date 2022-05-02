/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author S542408
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        ArrayList<Student> stuList = new ArrayList<>();
        
        Scanner scan = new Scanner(new File("studentData.txt"));
        while(scan.hasNext()) {
            Student s= new Student(scan.nextInt(),scan.next(),scan.next(),scan.nextDouble());
            stuList.add(s);
            
        }
        for(Student s:stuList) {
            System.out.println(s);
        }
        printList(stuList);
        System.out.println("****************");
        System.out.println("Sorted based on last name");
        Collections.sort(stuList);
        printList(stuList);
        System.out.println("*****************");
        System.out.println("overriding the natural order sorting");
        Collections.sort(stuList, new Comparator<Student>() {
        @Override
        public int compare(Student s1, Student s2) {
        if (s1.getlName().compareTo(s2.getlName()) == 0) {
	   return s1.getfName().compareTo(s2.getfName());
        } else {
        return s1.getlName().compareTo(s2.getlName());
        }
    }
    } );
        printList(stuList);
   }
        private static void printList(List<Student> stuList){
        
        for(Student s:stuList) {
            System.out.println(s);
        }
            }
            
        }
    
    

