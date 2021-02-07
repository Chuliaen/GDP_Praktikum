package edu.p03;

import edu.unibw.etti.SimpleGraphicPanel;

import java.awt.*;

public class A09 {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(maleDreieckRekursiv(10.0, 10.0, 150.0, 150.0));
        System.out.println(maleDreieckRekursiv(170.0, 10.0, 150.0, 75.0));
        System.out.println(maleDreieckRekursiv(330.0, 10.0, 150.0, 37.5));
        System.out.println(maleDreieckRekursiv(490.0, 10.0, 150.0, 18.75));
        System.out.println(maleDreieckRekursiv(650.0, 10.0, 150.0, 9.375));
    }

    public static int maleDreieckRekursiv(double ax, double ay, double s, double t) {
        double bx = ax + s;
        double by = ay;
        double cx = (ax + bx) / 2.0;
        double cy = ay + Math.sqrt(3.0) * (bx - ax) / 2.0;
        double px = (ax + cx) / 2.0;
        double py = (ay + cy) / 2.0;
        double qx = (bx + cx) / 2.0;
        double qy = (by + cy) / 2.0;
        double rx = (ax + bx) / 2.0;
        double ry = (ay + by) / 2.0;

        if (s <= t) {
            if (SimpleGraphicPanel.drawTriangle(Color.BLACK, true, ax, ay, bx, by, cx, cy)) {
                return 1;
            }
            return 0;
        }

        return maleDreieckRekursiv(ax, ay, s / 2.0, t) +
                maleDreieckRekursiv(rx, ry, s / 2.0, t) +
                maleDreieckRekursiv(px, py, s / 2.0, t);
    }

}
