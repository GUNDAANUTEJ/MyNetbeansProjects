/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gunda_Regular;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S542408
 */
public class Problem04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regexp4 = "The|A|An.*[.;]";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input sentence that starts with (The, A, An) and ends with full stop(.) and semicolon(;): ");
        String string1 = scanner.nextLine();
        System.out.print("Enter input sentence that will not start with (The, A, An) and will not ends with full stop(.) and semicolon(;): ");
        String string2 = scanner.nextLine();
        Pattern ptrn1 = Pattern.compile(regexp4);
        Matcher mtchr1 = ptrn1.matcher(string1);
        System.out.print("Final Output that starts with (The, A, An) and ends with full stop(.) and semicolon(;): ");
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }  
        Pattern ptrn2 = Pattern.compile(regexp4);
        Matcher mtchr2 = ptrn2.matcher(string2);
        System.out.print("Final Output that will not start with (The, A, An) and will not ends with full stop(.) and semicolon(;): ");
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
