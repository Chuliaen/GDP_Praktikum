package edu.p07.A18;

import java.awt.*;

public class Schneemann {

    public void anzeigen(Graphics g) {

        Position p1 = new Position(450, 275);
        Kreis k = new Kreis(85, 85, p1, Color.WHITE);
        k.anzeigenCol(g);

        p1 = new Position(455, 220);
        k = new Kreis(75, 75, p1, Color.WHITE);
        k.anzeigenCol(g);

        p1 = new Position(463, 170);
        k = new Kreis(60, 60, p1, Color.WHITE);
        k.anzeigenCol(g);

        p1 = new Position(457, 150);
        Rechteck r = new Rechteck(25, 75, p1, Color.BLACK);
        r.anzeigenCol(g);

        p1 = new Position(470, 110);
        r = new Rechteck(50, 50, p1, Color.BLACK);
        r.anzeigenCol(g);
    }
}
