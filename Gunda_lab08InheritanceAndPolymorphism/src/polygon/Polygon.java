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
public class Polygon {

    String name;
    int noSides;

    public Polygon(String name, int noSides) {
        this.name = name;
        this.noSides = noSides;
    }

    public double getArea() {
        return 0.0;
    }

    public double getInternalAngle() {
        return 0.0;
    }

    public int getNoSides() {
        return noSides;
    }

    public String getName() {
        String s1 = name.substring(0, 1).toUpperCase();
        return s1 + name.substring(1);
    }

    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public String toString() {
        return String.format("Polygon: %s\n"
                + "      Number of sides: %d", getName(), getNoSides());
    }

}
