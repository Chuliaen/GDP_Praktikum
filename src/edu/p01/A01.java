package edu.p01;

/*
StrictMath hardwareabhängig
StrictMath mehr funktionen wie zb Hyperbel
Math ruft oft StrictMath auf
 */

public class A01 {

    public static void main(String[] args) {
        double a = 100.0;
        double b = 75.0;

        System.out.println(Math.hypot(a, b));
    }

}