/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleprojectAssignment2;

/**
 *
 * @author 
 */
public class Problem2 {
    
    

    private int i;
    Problem2 leftn;
    Problem2 rightn;

    public int getI() {
        return i;
    }

    public Problem2(int i) {
        this.i = i;
        leftn = null;
        rightn = null;
    }

    public Problem2 getLeftN() {
        return leftn;
    }

    public Problem2 getRightN() {
        return rightn;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setLeftN(Problem2 leftn) {
        this.leftn = leftn;
    }

    public void setRightN(Problem2 rightn) {
        this.rightn = rightn;
    }

    static int min(Problem2 minNode) {
        Problem2 present = minNode;

        while (present.leftn != null) {
            present = present.leftn;
        }
        return present.i;
    }

}
