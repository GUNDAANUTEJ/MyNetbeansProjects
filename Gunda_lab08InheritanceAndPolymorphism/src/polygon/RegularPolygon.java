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
public class RegularPolygon extends Polygon {

    double length;

    public RegularPolygon(double length, String name, int noSides) {
        super(name, noSides);
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {

        return .25 * noSides * length * length * (1 / Math.tan((Math.PI / noSides)));
    }

    @Override
    public double getPerimeter() {
        return length * noSides;
    }

    @Override
    public double getInternalAngle() {
        return (180 / noSides) * (noSides - 2);
    }

    public double getInCircleRadius() {
        return length / 2 * (1 / Math.tan(Math.PI / noSides));
    }

    public double getCircumCircleRadius() {
        return (length / 2) * (1 / Math.sin(Math.PI / noSides));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\n      Length of side: %.1fcms\n"
                + "      Internal angle: %.2f\u00b0\n"
                + "      Circumcircle radius: %.2fcms\n"
                + "      Incircle radius: %.2fcms\n"
                + "      Area: %.2fcm\u00b2\n"
                + "      Perimeter: %.2fcms", getLength(), getInternalAngle(), getCircumCircleRadius(), getInCircleRadius(), getArea(), getPerimeter());

    }

}
