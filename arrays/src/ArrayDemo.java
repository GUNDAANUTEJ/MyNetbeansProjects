/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author S542408
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] numbers = new int[5];
        
        numbers[2]=75 ;
      numbers[4]= 22;
      System.out.println(numbers[2]);
        System.out.println("********");
        
        for(int i=0; i<numbers.length;i++)
      {
          numbers[i] = 2*i ;
          // numbers[i] = (int) Math.sqrt(i);
          //numbers[i]= i*i*i ;
          
      }
        for( int i=0; i<numbers.length ; i++){
            System.out.println(numbers[i]);
        }
        
        System.out.println("*********");
        
  
          for(int num:numbers) {
             System.out.println(num);
               
          }
          
          Dog[] myDogs = new Dog[3];
          Dog d1 = new Dog(2,"puppy",2.0);
          myDogs[0] = d1;
        
        myDogs[1] = new Dog(3, "Jimmy", 4.0);
        
        myDogs[2] = new Dog(4, "Snoopy", 8.0);
        
        for(int i=0; i<myDogs.length; i++){
            System.out.println(myDogs[i].getName());
        }
        
        for(Dog d:myDogs){
            System.out.println(d.getPrice());
        }
        
    }
    
}
          
          
          
          
       
        
    
          
          
 
