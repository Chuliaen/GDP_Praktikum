package edu.p07.A18;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class Schnee {

    public Schnee(int anzahl, double xMax, double yMax, double groesse, Graphics g) {
        double randomX;
        double randomY;
        Kreis k;
        Position p1;

        for (int i = anzahl; i > 0; i--) {
            randomX = ThreadLocalRandom.current().nextDouble(0, xMax);
            randomY = ThreadLocalRandom.current().nextDouble(0, yMax);

            p1 = new Position(randomX, randomY);
            k = new Kreis((int) groesse, (int) groesse, p1, Color.white);
            k.anzeigenCol(g);
        }
    }

}
