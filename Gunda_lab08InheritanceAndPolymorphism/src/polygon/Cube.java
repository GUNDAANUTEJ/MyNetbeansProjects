/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import enums.Solids;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public class Cube extends Square {

    public Cube(double length) {
        super(length, "Cube");
    }

    @Override
    public double getArea() {
        return super.getArea() * Solids.CUBE.getNoFaces(); //To change body of generated methods, choose Tools | Templates.
    }

    public double getVolume() {
        return Math.pow(getLength(), 3);

    }

    public double getInSphereRadius() {
        return getLength() / 2;
    }

    public double getCircumSphereRadius() {
        return (Math.sqrt(3) / 2) * getLength();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n      Insphere radius: %.2fcms\n"
                + "      Circumsphere radius: %.2fcms\n"
                + "      Volume: %.2fcm" + '\u00b3', getInSphereRadius(), getCircumSphereRadius(), getVolume());

    }

}
