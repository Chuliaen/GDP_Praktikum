package edu.p07.A18;

import java.awt.*;

public class Anwendung {

    public static void main(String[] args) {
        Anwendung a = new Anwendung();
        a.anzeigen();
        //a.anzeigenSchnee();
    }

    public void anzeigen() {
        GraphicsPanel panel = new GraphicsPanel("Mein Fenster", 600, 400);
        Graphics g = panel.createGraphics();

        Position p1 = new Position(0, 0);
        Rechteck r = new Rechteck(400, 600, p1, Color.GRAY);
        r.anzeigenCol(g);
        panel.updateGraphics();
        panel.sleep(300);

        Haus h = new Haus();
        h.anzeigen(g);
        panel.updateGraphics();
        panel.sleep(300);

        Schneemann s = new Schneemann();
        s.anzeigen(g);
        panel.updateGraphics();
        panel.sleep(300);

        Baum b = new Baum();
        b.anzeigen(g);
        panel.updateGraphics();
    }

    public void anzeigenSchnee() {
        GraphicsPanel panel = new GraphicsPanel("Mein Fenster", 600, 400);
        Graphics g = panel.createGraphics();

        Position p1 = new Position(0, 0);
        Rechteck r = new Rechteck(400, 600, p1, Color.BLUE);
        r.anzeigenCol(g);
        panel.sleep(300);

        Haus h = new Haus();
        h.anzeigen(g);
        panel.updateGraphics();
        panel.sleep(300);

        Schneemann s = new Schneemann();
        s.anzeigen(g);
        panel.updateGraphics();
        panel.sleep(300);

        Baum b = new Baum();
        b.anzeigen(g);
        panel.updateGraphics();
        panel.sleep(300);

        Schnee schnee = new Schnee(1000, 800, 400, 5, g);
        panel.updateGraphics();
    }
}
