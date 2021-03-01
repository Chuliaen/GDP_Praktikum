package edu.p07.A18;

import java.awt.*;

public class Baum {

    public void anzeigen(Graphics g) {
        Position p1 = new Position(275, 300);
        Rechteck r = new Rechteck(50, 50, p1, Color.orange);
        r.anzeigenCol(g);

        int[] x = {300, 400, 200};
        int[] y = {225, 300, 300};
        Dreieck d = new Dreieck(Color.GREEN);
        d.anzeigenCol(g, x, y);
        d.anzeigen(g, x, y);

        int[] x2 = {300, 375, 225};
        int[] y2 = {170, 250, 250};
        d = new Dreieck(Color.GREEN);
        d.anzeigenCol(g, x2, y2);
        d.anzeigen(g, x2, y2);

        int[] x3 = {300, 350, 250};
        int[] y3 = {100, 200, 200};
        d = new Dreieck(Color.GREEN);
        d.anzeigenCol(g, x3, y3);
        d.anzeigen(g, x3, y3);
    }
}
