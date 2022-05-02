/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraries;
import java.util.Scanner;
/**
 *
 * @author GUNDA SAI NAGA ANU TEJA
 */
public class libraryDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        // TODO code application logic here
        Library L1 = new Library("BDowens", 12 , 9.99);
        System.out.println(L1) ;
        
        Scanner scan = new Scanner( new File("LibData.text") );
        while(scan.hasNext()) {
        System.out.println("Enter the lib name: ");
        String name = scan.next() ;
        scan.next();
        System.out.println("Enter number of books: ");
        int totalBooks = scan.nextInt();
        System.out.println("Enter membership fee: ");
        double fee = scan.nextDouble();
        
        Library L2 = new Library(scan.next() , scan.nextInt(), scan.nextDouble()   );
        System.out.println(L2);
        write.println(L2);
        
        }
        scan.close();
        write.close();
    }
    
}
