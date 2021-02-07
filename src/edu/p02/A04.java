package edu.p02;

public class A04 {

    public static void main(String[] args) {
        System.out.println(quersumme(1293404));
    }

    public static int quersumme(int zahl) {
        if (zahl < 0) {
            return -1;
        } else if (zahl <= 9) {
            return zahl;
        } else {
            return zahl % 10 + quersumme(zahl / 10);
        }
    }

}
