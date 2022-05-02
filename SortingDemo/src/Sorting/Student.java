/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author S542408
 */
public class Student implements Comparable<Student> {
    private int idNum;
    private String lName;
    private String fName;
    private double gpa;

    public Student(int idNum, String lName, String fName, double gpa) {
        this.idNum = idNum;
        this.lName = lName; 
        this.fName = fName;
        this.gpa = gpa;
    }

    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" + "idNum=" + idNum + ", lName=" + lName + ", fName=" + fName + ", gpa=" + gpa + '}';
    }
    @Override
    public int compareTo(Student otherStudent) {
        return Double.compare(this.gpa, otherStudent.gpa);
        //return Integer.compare(this.idNum, otherStudent.idNum);
        //This is natural order sorting
        //return this.lName.compareTo(otherStudent.getlName()) ;
    }
    
}
