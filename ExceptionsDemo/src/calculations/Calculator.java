/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculations;

/**
 *
 * @author S542408
 */
public class Calculator {
    
    private int numA;
    private int numB;

    public Calculator(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }
    
    public int add() {
    return Math.abs(numA+numB) ;
    }
    
    public int sub() {
        return numA-numB ;
    }
    
    public int mul() {
        if(numA==0 || numB==0) {
            throw new ArithmeticException("multiplication can not be done with zero");
        }
        return numA*numB ;
    }
    
    public int div() {
        if(numB == 0){
            throw new ArithmeticException("Denominator should not be zero");
        }
        return numA/numB ;
        }
    }
        

