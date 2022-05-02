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
public class Square extends RegularPolygon{
    
    public Square(double length) {
        super(length, "Square", 4);
    }
    
    public Square(double length, String name) {
        super(length, name, 4);
    }
  
}
