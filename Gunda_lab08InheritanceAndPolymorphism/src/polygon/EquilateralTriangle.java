/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class EquilateralTriangle extends RegularPolygon{
     public EquilateralTriangle(double length) {
        super(length, "Equilateral Triangle", 3);
    }
    
    public EquilateralTriangle(double length, String name) {
        super(length, name, 3);
    }
    public double getHeight(){
         return (Math.sqrt(3)/2)*getLength();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n      Height: %.2fcms",getHeight());
    }
    
}
