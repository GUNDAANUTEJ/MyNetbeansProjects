/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polygon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: 44542-02 Object Oriented Programming
 * @author @author Gunda Sai Naga Anu Teja
 * Description: Making sure everything works
 * Due: 03/31/21
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any other student and will not share this code with anyone under my circumstances.
 */


public class ShapesDriver {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here

        File file = new File("shapes.txt");
        Scanner scan = new Scanner(file);
        System.out.println("*****************************************");
        ArrayList<Polygon> polygonList = new ArrayList<>();
        while (scan.hasNextLine()) {

            String[] line = scan.nextLine().split(" ");
            Polygon polygon = null;
            switch (line[0].toLowerCase()) {
                case "square":
                    polygon = new Square(Double.parseDouble(line[1]));
                    break;
                case "cube":
                    polygon = new Cube(Double.parseDouble(line[1]));
                    break;
                case "tetrahedron":
                    polygon = new Tetrahedron(Double.parseDouble(line[1]));
                    break;
                case "triangle":
                    polygon = new EquilateralTriangle(Double.parseDouble(line[1]), "Equilateral Triangle");
                    break;
                default:
                    if (line.length == 2) {
                        polygon = new Polygon(line[1], Integer.parseInt(line[0]));
                    } else {
                        polygon = new RegularPolygon(Double.parseDouble(line[2]), line[0], Integer.parseInt(line[1]));
                    }
            }

            polygonList.add(polygon);
        }

        for (Polygon polygon : polygonList) {
            System.out.println(polygon.toString() + "\n");
            System.out.println("*****************************************");
        }
        double maxArea = Double.MIN_VALUE;
        double minArea = Double.MAX_VALUE;
        String maxPolygon = "";
        String minPolygon = "";
        double maxPerimeter = Double.MIN_VALUE;
        double minPerimeter = Double.MAX_VALUE;
        String maxPolygon1 = "";
        String minPolygon2 = "";

        for (Polygon polygon : polygonList) {
            if (polygon.getArea() > maxArea) {
                maxArea = polygon.getArea();
                maxPolygon = polygon.getName();
            }
            if (polygon.getArea() < minArea) {
                minArea = polygon.getArea();
                minPolygon = polygon.getName();
            }

        }

        for (Polygon polygon : polygonList) {
            if (polygon.getPerimeter() > maxPerimeter) {
                maxPerimeter = polygon.getPerimeter();
                maxPolygon1 = polygon.getName();
            } else if (polygon.getPerimeter() < minPerimeter) {
                minPerimeter = polygon.getPerimeter();
                minPolygon2 = polygon.getName();
            }

        }
        System.out.println(String.format("The polygon with largest area is %s with area of %.2fcm\u00b2\n"
                + "The polygon with smallest area is %s with area of %.2fcm\u00b2\n"
                + "The polygon with largest perimeter is %s with perimeter of %.2fcms\n"
                + "The polygon with smallest perimeter is %s with perimeter of %.2fcms\n"
                + "*****************************************",
                maxPolygon, maxArea, minPolygon, minArea, maxPolygon1, maxPerimeter, minPolygon2, minPerimeter));
        System.out.println("Surface area to Volume ratio of given solids are:");

        for (Polygon polygon : polygonList) {
            if (polygon.getName().equalsIgnoreCase("cube")) {
                Cube cube = (Cube) polygon;
                System.out.printf("Cube:\n"
                        + "        Surface area: %.2fcm\u00b2\n"
                        + "        Volume: %.2fcm\u00b3\n", cube.getArea(), cube.getVolume());

            }
            if (polygon.getName().equalsIgnoreCase("tetrahedron")) {
                Tetrahedron tetrahedron = (Tetrahedron) polygon;
                System.out.printf("tetrahedron:\n"
                        + "        Surface area: %.2fcm\u00b2\n"
                        + "        Volume: %.2fcm\u00b3\n" + "******************************************\n", tetrahedron.getArea(), tetrahedron.getVolume());

            }
        }
        System.out.println("Where did you use late binding polymorphism in this project?\n"
                + "getArea(),getPerimeter(), getInternalAngle(), toString(),getHeight()\n******************************************");

        System.out.println("Where did you use polymorphic substitution in this project?\n"
                + "Polygon polygon = null;\n"
                + "polygon = new Square(Double.parseDouble(line[1]))\n"
                + "polygon = new Cube(Double.parseDouble(line[1]))\n"
                + "polygon = new Tetrahedron(Double.parseDouble(line[1]))\n"
                + "polygon = new EquilateralTriangle(Double.parseDouble(line[1]), \"Equilateral Triangle\")\n******************************************");

    }

}
