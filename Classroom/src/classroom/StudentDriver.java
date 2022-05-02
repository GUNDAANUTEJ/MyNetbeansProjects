/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom;

import java.util.ArrayList;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class StudentDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<StudentClass> myStudent = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        
        StudentClass s1 = new StudentClass(1,"Manideep",90.9);
        StudentClass s2 = new StudentClass(2,"Ram",90.8);
        StudentClass s3 = new StudentClass(3,"krish",90.7);
        StudentClass s4 = new StudentClass(4,"munna",90.6);
        StudentClass s5 = new StudentClass(5,"bagi", 90.5);
        
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);
        myStudent.add(s4);
        myStudent.add(s5);
        
        double total = 0;
        double leastNumber = myStudent.get(0).getGpa();
        double highestNumber = myStudent.get(0).getGpa();
        
        for(int i=0; i<myStudent.size(); i++){
            total += myStudent.get(i).getGpa();
            if(myStudent.get(i).getName().substring(0,1).equals("S")){
                names.add(myStudent.get(i).getName());
            }
            if(myStudent.get(i).getGpa()>highestNumber) {
                highestNumber = myStudent.get(i).getGpa();
            }
             if(myStudent.get(i).getGpa()>leastNumber) {
                leastNumber = myStudent.get(i).getGpa();
            }
        }
        System.out.println("average: "+total/myStudent.size());
        System.out.println("Maximum number: "+highestNumber);
        System.out.println("Maximum number: "+leastNumber);
        System.out.println("Names Start with letter S:"+names);
    }
}
