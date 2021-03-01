package edu.p07.A18;

public class Position {

    private double x;
    private double y;
    public final int X_MAX = 600;
    public final int Y_MAX = 400;

    public Position(double nx, double ny) {
        if (x > X_MAX || y > Y_MAX || y < 0 || x < 0) {
            return;
        } else {
            this.x = nx;
            this.y = ny;
        }
    }

    public void setXY(double x, double y) {
        if (x > X_MAX || y > Y_MAX || y < 0 || x < 0) {
            return;
        } else {
            this.x = x;
            this.y = y;
        }
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        if (x > X_MAX || x < 0) {
            return;
        } else {
            this.x = x;
        }
    }

    public void setY(double y) {
        if (y > Y_MAX || y < 0) {
            return;
        } else {
            this.y = y;
        }
    }
}
