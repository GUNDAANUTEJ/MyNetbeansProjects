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
public class Problem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String regexp1 = "^[A-Z][a-z]{0,7}$";
        String string1 = "Hitej";
        String string2 = "thwaryuui";
        Pattern ptrn1 = Pattern.compile(regexp1);
        Matcher mtchr1 = ptrn1.matcher(string1);
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }  
        Pattern ptrn2 = Pattern.compile(regexp1);
        Matcher mtchr2 = ptrn2.matcher(string2);
        if(mtchr1.find())
        {
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }   
    }   
}
