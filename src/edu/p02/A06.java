package edu.p02;

import edu.p01.A03;
import edu.unibw.etti.SimpleGraphicPanel;

import java.util.concurrent.TimeUnit;

public class A06 {

    public static void main(String[] args) {
        maleBlumenBaum(5, 200, 50, 250, 50, 0.4);
    }

    public static boolean maleBlumenBaum(int depth, double ax, double ay, double bx, double by, double r) {

        boolean a = A03.maleBlume(SimpleGraphicPanel.getRandomColor(), ax, ay, bx, by);

        double sx = ax + (ay - by);
        double sy = ay + (bx - ax);
        double tx = ax + (ay - by) + r * (bx - ax) + Math.sqrt(r * (1.0 - r)) * (ay - by);
        double ty = ay + (bx - ax) + r * (by - ay) + Math.sqrt(r * (1.0 - r)) * (bx - ax);
        double ux = bx + (ay - by);
        double uy = by + (bx - ax);

        if (depth != 0) {
            boolean b = maleBlumenBaum(depth - 1, sx, sy, tx, ty, r);
            boolean c = maleBlumenBaum(depth - 1, tx, ty, ux, uy, r);
            return b && c;

        }
        return false;
    }

}
