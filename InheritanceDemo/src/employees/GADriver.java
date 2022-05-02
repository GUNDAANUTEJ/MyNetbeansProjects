/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employees;

/**
 *
 * @author S542408
 */
public class GADriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GraduateAssistant hga = new HalfGA("ANU","TEJ") ;
        
        GraduateAssistant tga = new ThreeFourthGA("RAM","SAM");
        System.out.println(tga);
         System.out.println(tga.getInitials());
        System.out.println(tga.calcSalary());
        System.out.println(tga.calcSalaryAfterTax());
        
        GraduateAssistant hga1 = new HalfGA("A","B");
        GraduateAssistant hga2 = new HalfGA("C","D");
        
        ArrayList<GraduateAssitant> gaList = new ArrayList<>();
        
    }
    
}
