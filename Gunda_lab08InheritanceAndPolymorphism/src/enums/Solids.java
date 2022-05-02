/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author Gunda Sai Naga Anu Teja
 */
public enum Solids {
    TETRAHEDRON(4),
    CUBE(6),
    BOX(6);
    int noFaces;

    private Solids(int noFaces) {
        this.noFaces = noFaces;
    }

    public int getNoFaces() {
        return noFaces;
    }
   

    public static Solids getTETRAHEDRON() {
        return TETRAHEDRON;
    }

    public static Solids getCUBE() {
        return CUBE;
    }

    public static Solids getBOX() {
        return BOX;
    }

}
