package edu.p07.A18;

import java.awt.*;

public class Rechteck {

    private int height;
    private int width;
    private Position pos;
    private Color col;

    public Rechteck(int height, int width, Position pos, Color col) {
        this.height = height;
        this.width = width;
        this.pos = pos;
        this.col = col;
    }

    public void anzeigenCol(Graphics g) {
        g.setColor(col);
        g.fillRect((int) pos.getX(), (int) pos.getY(), width, height);
    }

    public void anzeigen(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect((int) pos.getX(), (int) pos.getY(), width, height);
    }
}
