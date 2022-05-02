/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gunda_Regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author S542408
 */
public class Problem05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regexp5 = "\\bjava\\b";
        String string1 = "java is secant @";
        String string2 = "jbcvdoibs";
        Pattern ptrn1 = Pattern.compile(regexp5);
        Matcher mtchr1 = ptrn1.matcher(string1);
        System.out.print("Final Output for given string "+(string1)+" is :");
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }   
        Pattern ptrn2 = Pattern.compile(regexp5);
        Matcher mtchr2 = ptrn1.matcher(string2);
        System.out.print("Final Output for given string "+(string2)+" is : ");
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        String string3 = "i like java java language when java java java java ";
        int count = 0;
        String string4 = "java";
        Pattern ptrn3 = Pattern.compile(string4);
        Matcher mtchr3 = ptrn3.matcher(string3);
        while (mtchr3.find()) {
            count++;
        }
        System.out.println("Given string is: "+string3);
        System.out.println("Count of word java for given string is: " + count);
    }   
}