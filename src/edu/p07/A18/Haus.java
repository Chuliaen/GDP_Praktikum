package edu.p07.A18;

import java.awt.*;

public class Haus {

    public void anzeigen(Graphics g) {
        Position p1 = new Position(50, 250);
        Rechteck r = new Rechteck(100, 100, p1, Color.YELLOW);
        r.anzeigenCol(g);
        r.anzeigen(g);


        p1 = new Position(75, 310);
        r = new Rechteck(40, 20, p1, Color.BLUE);
        r.anzeigenCol(g);
        r.anzeigen(g);

        p1 = new Position(110, 275);
        r = new Rechteck(40, 15, p1, Color.BLUE);
        r.anzeigenCol(g);
        r.anzeigen(g);

        p1 = new Position(130, 275);
        r = new Rechteck(40, 15, p1, Color.BLUE);
        r.anzeigenCol(g);
        r.anzeigen(g);

        int[] x = {100, 150, 50};
        int[] y = {150, 250, 250};
        Dreieck d = new Dreieck(Color.RED);
        d.anzeigenCol(g, x, y);
        d.anzeigen(g, x, y);
    }

}
