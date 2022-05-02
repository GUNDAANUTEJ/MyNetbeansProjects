/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleprojectAssignment2;

/**
 *
 
 */
public class Problem1 {
    private int i;
    Problem1 leftn;
    Problem1 rightn;

    public int getData() {
        return i;
    }

    public Problem1(int i) {
        this.i = i;
        leftn = null;
        rightn = null;
    }

    public Problem1 getLeftN() {
        return leftn;
    }

    public Problem1 getRightN() {
        return rightn;
    }

    public void setData(int data) {
        this.i = data;
    }

    public void setLeft(Problem1 leftn) {
        this.leftn = leftn;
    }

    public void setRightN(Problem1 rightn) {
        this.rightn = rightn;
    }


    static int maxDepthRec(Problem1 rootNode) {
        if (rootNode == null) {
            return 0;
        }
        //Computing depth of each subtree
        
        int leftDepth = maxDepthRec(rootNode.leftn);
        int rightDepth = maxDepthRec(rootNode.rightn);
        return (leftDepth > rightDepth) ? leftDepth + 1 : rightDepth + 1;
    }

    static int computeWidth(Problem1 rootNode) {
        int max = 0;
        int hght = maxDepthRec(rootNode);
        for (int j = 0; j <= hght; j++) {
            int tmp = width(rootNode, j);
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }

    static int width(Problem1 rootNode, int depth) {
        if (rootNode == null) {
            return 0;
        } else {
            if (depth == 0) {
                return 1;
            } else {
                return width(rootNode.leftn, depth - 1) + width(rootNode.rightn, depth - 1);
            }
        }
    }

}

