/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;

/**
 *
 * @author S542408
 */
public class Library {
    private String name ;
    private int totalNumberOfBooks ;
    private double membershipFee ;
           
     public Library(String name, int totalNumberOfBooks, double membershipFee  ) {
         this.name = name ;
         this.totalNumberOfBooks = totalNumberOfBooks;
         this.membershipFee = membershipFee ;
     }

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalNumberOfBooks(int totalNumberOfBooks) {
        this.totalNumberOfBooks = totalNumberOfBooks;
    }

    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    public String getName() {
        return name;
    }

    public int getTotalNumberOfBooks() {
        return totalNumberOfBooks;
    }

    public double getMembershipFee() {
        return membershipFee;
    }

    @Override
    public String toString() {
        return "Library{" + "name=" + name + ", totalNumberOfBooks=" + totalNumberOfBooks + ", membershipFee=" + membershipFee + '}';
    }
        
}
