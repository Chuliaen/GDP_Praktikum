package edu.p07.A18;

import java.awt.*;

public class Dreieck {

    private Color col;

    public Dreieck(Color col) {
        this.col = col;
    }

    public void anzeigen(Graphics g, int[] x, int[] y) {
        g.setColor(Color.BLACK);
        g.drawPolygon(x, y, 3);
    }

    public void anzeigenCol(Graphics g, int[] x, int[] y) {
        g.setColor(col);
        g.fillPolygon(x, y, 3);
    }
}
