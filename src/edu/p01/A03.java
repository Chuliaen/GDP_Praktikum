package edu.p01;

import edu.unibw.etti.SimpleGraphicPanel;

import java.awt.Color;

import static edu.p01.A02.*;


public class A03 {

    public static void main(String[] args) {
        double mx = mx(100, 0, 180, 40);
        double my = my(100, 0, 180, 40);

        //System.out.println("True?:" + maleRaute(Color.RED, 100, 0, mx, my));
        System.out.println("True?:" + maleBlume(SimpleGraphicPanel.getRandomColor(), 100, 0, 180, 40));
    }

    public static boolean maleRaute(Color c, double ex, double ey, double fx, double fy) {

        return SimpleGraphicPanel.drawQuadrilateral(
                c,
                true,
                ex,
                ey,
                gx(ex, ey, fx, fy),
                gy(ex, ey, fx, fy),
                fx,
                fy,
                hx(ex, ey, fx, fy),
                hy(ex, ey, fx, fy)
        );
    }

    public static boolean maleBlume(Color c, double ax, double ay, double bx, double by) {
        double fx = mx(ax, ay, bx, by);
        double fy = my(ax, ay, bx, by);
        maleRaute(c, ax, ay, fx, fy);
        maleRaute(c, bx, by, fx, fy);
        maleRaute(c, cx(ax, ay, bx, by), cy(ax, ay, bx, by), fx, fy);
        maleRaute(c, dx(ax, ay, bx, by), dy(ax, ay, bx, by), fx, fy);

        return false;
    }

}
