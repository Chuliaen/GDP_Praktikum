package edu.p01;

public class A02 {

    public static double cx(double ax, double ay, double bx, double by) {
        return bx + ay - by;
    }

    public static double cy(double ax, double ay, double bx, double by) {
        return by + bx - ax;
    }

    public static double dx(double ax, double ay, double bx, double by) {
        return ax + ay - by;
    }

    public static double dy(double ax, double ay, double bx, double by) {
        return ay + bx - ax;
    }

    public static double mx(double ax, double ay, double bx, double by) {
        return ax + (bx - ax) / 2.0 + (ay - by) / 2.0;
    }

    public static double my(double ax, double ay, double bx, double by) {
        return ay + (by - ay) / 2.0 + (bx - ax) / 2.0;
    }

    public static double gx(double ex, double ey, double fx, double fy) {
        return ex + (fx - ex) * 0.5 + s(ex, ey, fx, fy) / (2 * t(ex, ey, fx, fy)) * (fy - ey);
    }

    public static double gy(double ex, double ey, double fx, double fy) {
        return ey + (fy - ey) * 0.5 + s(ex, ey, fx, fy) / (2 * t(ex, ey, fx, fy)) * (ex - fx);
    }

    public static double hx(double ex, double ey, double fx, double fy) {
        return ex + (fx - ex) * 0.5 - s(ex, ey, fx, fy) / (2 * t(ex, ey, fx, fy)) * (fy - ey);
    }

    public static double hy(double ex, double ey, double fx, double fy) {
        return ey + (fy - ey) * 0.5 - s(ex, ey, fx, fy) / (2 * t(ex, ey, fx, fy)) * (ex - fx);
    }

    public static double t(double ex, double ey, double fx, double fy) {
        double a = (fy - ey) * (fy - ey);
        double b = (fx - ex) * (fx - ex);
        double c = a + b;
        return Math.sqrt(c);
    }

    public static double s(double ex, double ey, double fx, double fy) {
        return t(ex, ey, fx, fy) / Math.sqrt(3);
    }

}
