/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package objects;
import java.util.Random;
/**
 *
 * @author GUNDA SAI NAGA ANU TEJA  
 */
public class StringsAndNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("******** String Class ********");
            String string1 = "  Welcome    ";
            String string2 = " to ";
            String string3 = "  the first    ";
            String string4 = "Lab Activity ";
            String string5 = " in the   ";
            String string6 = " OPP Course ";
    
           String string7  = "lab interesting activities are activities lab Interesting Lab Activities Are Interesting Lab activities Lab Interesting";
           String string8  = "Object-Oriented-Programming 44542";
           
         
    
           String concatenate =  string1.concat(string2).concat(string3).concat(string4).concat(string5).concat(string6) ;
    
    System.out.println(concatenate);
    System.out.println("The length of the concatenated string is: "+concatenate.length());
    System.out.println(string1.trim()+" "+string2.trim()+" "+string3.trim()+" "+string4.trim()+" "+string5.trim()+" "+string6.trim()+"!");
    System.out.println("Length of the above string is: "+(string1.trim()+" "+string2.trim()+" "+string3.trim()+" "+string4.trim()+" "+string5.trim()+" "+string6.trim()+"!").length());
     System.out.println("Retrieved: "+(string1.trim()+" "+string2.trim()+" "+string3.trim()+" "+string4.trim()+" "+string5.trim()+" "+string6.trim()+"!").substring(21,33));
    
  String x=((string1.trim()+" "+string2.trim()+" "+string3.trim()+" "+string4.trim()+" "+string5.trim()+" "+string6.trim()+"!").substring(21,33).toUpperCase());
    
      
      int y = x.indexOf("I");
      System.out.println("Index of first I in 'LAB ACTIVITY' is at: "+y);
      
      //2
    
     System.out.println("First occurrence of Interesting is at: "+ string7.indexOf("Interesting"));
      System.out.println("Object-Oriented-Programming 44542"); 
      String a = string8.replaceAll("-","_") ;
           String b = a.replaceAll(" ","-");
           System.out.println(b);
           
           String String1="Computer" ;
           String String2="Science" ; 
           String m = String2.toUpperCase();   
           String combine = String1.substring(0,4)+m.substring(0,3)+String1.length()+String2.length();
           System.out.println("The ID is: "+combine);
           
           System.out.println(" Applied Computer Science provides us with good knowledge about coding and practical approach in programming which will be useful for the future purpose");
    
         System.out.println("                                                                    ");
           //MATH CLASS
          System.out.println("******** Math Class ********");
           int value1 = 9;
           int value2= 13;
           
           System.out.println("sqrt (value12 +value22): "+Math.sqrt( Math.pow(value1, 2)+Math.pow(value2, 2))) ;
           System.out.println("exp (9): "+Math.exp(value1));
           System.out.println("sec (9): "+1/Math.cos(value1) );
           int myNumber = 27 ;
           System.out.println("Cube root of 27.00: "+Math.cbrt(myNumber));
           System.out.println("Logarithm value is: "+Math.log(27));
           System.out.println("tan 60° - tan 45° / (1 + tan 60° tan 45°) = "+((Math.tan(60)-Math.tan(45))/(1+(Math.tan(60)*Math.tan(45)))));
           System.out.println("Theoretical value of tan (90) is: "+Math.tan(90)  );
           System.out.println("Cubic root of modulus value of tan (90) is: "+Math.cbrt(Math.abs(Math.tan(90))) );
           System.out.println("Cosecant of 30 is: "+1/Math.sin(30));
           System.out.println("secant of 30 is: "+1/Math.cos(30));
           System.out.println("Minimum value in Cosec (30) and Sec (30) is: "+Math.min(1/(Math.sin(30)),1/(Math.cos(30))));
           System.out.println("Maximum value in Cosec (30) and Sec (30) is: "+Math.max(1/(Math.sin(30)),1/(Math.cos(30))));
           int myNumber1 = 45;
           int myNumber2 = 27;
           System.out.println("Rounded Value of cos 45: "+Math.round(Math.cos(45)));
           System.out.println("Rounded Value of cos 27: "+Math.round(Math.cos(27)));
           System.out.println("Rounded Value of tan 45: "+Math.round(Math.tan(45)));
           System.out.println("Rounded Value of tan 27: "+Math.round(Math.tan(27)));
           System.out.println("The value of given equation is: "+(Math.abs(8*(Math.cos(myNumber2))))*(Math.pow((Math.pow(7, 4)+8*(6)*(7)*5), 0.25 )/(Math.pow(Math.pow(5, 2)-Math.pow(3, 2), 0.125))    ));
              
   
           System.out.println("                                                            ");
           System.out.println("******** Random Class ********");
           
           System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
             
          
                Random rnd = new Random();
                
               
           int n1 = rnd.nextInt(200);
           System.out.println("First random integer value is: "+n1+" Square of "+n1+" is: "+Math.pow(n1, 2));
           int n2 = rnd.nextInt(200);
           System.out.println("Second random integer value is: "+n2+" Square of "+n2+" is: "+Math.pow(n2, 2));
           int n3 = rnd.nextInt(200);
           System.out.println("Third random integer value is: "+n3+" Square of "+n3+" is: "+Math.pow(n3, 2));
           int n4 = rnd.nextInt(200);
           System.out.println("Fourth random integer value is: "+n4+" Square of "+n4+" is: "+Math.pow(n4, 2));
           
           
             
            System.out.println("3 pseudo-random integer values without seed value and bounds");
            int n5 = rnd.nextInt(); 
            System.out.println("Fifth random integer value is: "+n5);
             int n6 = rnd.nextInt();
             System.out.println("Sixth random integer value is: "+n6);
             int n7 = rnd.nextInt();
             System.out.println("Seventh random integer value is: "+n7);
             
             System.out.println("NO");
             
             System.out.println("4 pseudo-random integer values between 0 (inclusive) and 200 (exclusive)");
             
             Random rnd1 = new Random(30);
             
             int n8 = rnd1.nextInt(200);
             
             System.out.println("First random integer value is: "+n8+" Square of "+n8+" is: "+Math.pow(n8,2));
              
             int n9 = rnd1.nextInt(200);
             
             System.out.println("Second random integer value is: "+n9+" Square of "+n9+" is: "+Math.pow(n9,2));
             
             int n10 = rnd1.nextInt(200);
             
             System.out.println("Third random integer value is: "+n10+" Square of "+n10+" is: "+Math.pow(n10,2));
             
             int n11 = rnd1.nextInt(200);
             
             System.out.println("Fourth random integer value is: "+n11+" Square of "+n11+" is: "+Math.pow(n11,2));
             
             System.out.println("3 pseudo-random values with seed value and without bounds ");
             
             int n12 = rnd1.nextInt();
             
             System.out.println("Fifth random integer value is: "+n12);
             
             int n13 = rnd1.nextInt();
             
             System.out.println("Sixth random integer value is: "+n13);
             
             int n14 = rnd1.nextInt();
             
             System.out.println("Seventh random integer value is: "+n14);
             
             System.out.println("YES");
             
             System.out.println("In b, when there is no seed value, the pseudo random values are repeating each time we run the program . Where as in d , when we gave seed value , the values are constant ");
             
             
             
             
             
             
             
             
    
            
  } }           
  
    
    
    
   
   

