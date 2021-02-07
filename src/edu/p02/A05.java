package edu.p02;

public class A05 {

    private static int count;

    public static void main(String[] args) {
        count = 0;
        System.out.println(zaehleZifferInZahl(232342, 2));
    }

    public static int zaehleZifferInZahl(int ziffer, int zahl) {
        if (ziffer > 0) {
            if (ziffer % 10 == zahl) {
                count++;
            }
            return zaehleZifferInZahl(ziffer / 10, zahl);

        } else if (ziffer == 0) {
            return count;
        }

        return -1;
    }

}
