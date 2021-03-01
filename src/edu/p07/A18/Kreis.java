package edu.p07.A18;

import java.awt.*;

public class Kreis {

    private int height;
    private int width;
    private Position pos;
    private Color col;

    public Kreis(int height, int width, Position pos, Color col) {
        this.height = height;
        this.width = width;
        this.pos = pos;
        this.col = col;
    }

    public void anzeigenCol(Graphics g) {
        g.setColor(col);
        g.fillOval((int) pos.getX(), (int) pos.getY(), width, height);
    }

    public void anzeigen(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawOval((int) pos.getX(), (int) pos.getY(), width, height);
    }
}
