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
public class Problem3 {

    
    Problem3 leftn;
    Problem3 rightn;
    private int i;

    public int getI() {
        return i;
    }

    public Problem3(int i) {
        this.i = i;
        leftn = null;
        rightn = null;
    }

    public Problem3 getLeftN() {
        return leftn;
    }

    public Problem3 getRightN() {
        return rightn;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setLeftN(Problem3 leftn) {
        this.leftn = leftn;
    }

    public void setRightN(Problem3 rightn) {
        this.rightn = rightn;
    }

    static int sum(Problem3 BinaryNode) {
        int NSum, lSum, rSum;
        lSum = rSum = NSum = 0;
        if (BinaryNode == null) {
            return 0;
        } else {
            if (BinaryNode.leftn != null) {
                lSum = sum(BinaryNode.leftn);
            }
            if (BinaryNode.rightn != null) {
                rSum = sum(BinaryNode.rightn);
            }
            NSum = lSum + rSum + BinaryNode.i;
            return NSum;
        }
    }
}
