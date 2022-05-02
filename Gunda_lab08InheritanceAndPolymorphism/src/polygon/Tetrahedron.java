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
public class Tetrahedron extends EquilateralTriangle {

    /**
     *
     * @param length
     */
    public Tetrahedron(double length) {
        super(length);
        super.name = "Tetrahedron";
    }

    /**
     *
     * @return
     */
    @Override
    public double getHeight() {
        return (Math.sqrt(6) / 3) * getLength();
    }

    /**
     *
     * @return
     */
    @Override
    public double getArea() {
        return super.getArea() * Solids.TETRAHEDRON.getNoFaces();
    }

    /**
     *
     * @return
     */
    public double getVolume() {
        return (Math.sqrt(2) / 12) * Math.pow(getLength(), 3);
    }

    /**
     *
     * @return
     */
    public double getInSphereRadius() {
        return getLength() / Math.sqrt(24);
    }

    /**
     *
     * @return
     */
    public double getCircumSphereRadius() {
        return Math.sqrt(6) / 4 * getLength();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n      Insphere radius: %.2fcms\n"
                + "      Circumsphere radius: %.2fcms\n"
                + "      Volume: %.2fcm\u00b3", getInSphereRadius(), getCircumSphereRadius(), getVolume());

    }

}
