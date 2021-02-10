package edu.p05;

import java.util.Arrays;

public class A13 {

    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
        double[] b = {5.0, 4.0, 3.0, 2.0, 1.0};
        System.out.println(Arrays.toString(selectionSort(b)));
    }

    public static double[] selectionSort(double[] a) {
        int count;
        double tmp;
        double tmp2;

        int vergleiche = 0;
        int vertauschungen = 0;

        for (int i = 0; i < a.length; i++) {
            tmp = a[i];
            tmp2 = a[i];
            count = i;

            for (int j = i; j < a.length; j++) {
                vergleiche++;
                if (tmp > a[j]) {
                    tmp = a[j];
                    count = j;
                    vertauschungen++;
                }
            }

            a[i] = tmp;
            a[count] = tmp2;
        }
        System.out.println("Vergleiche: " + vergleiche);
        System.out.println("Vertauschungen: " + vertauschungen);
        return a;
    }
}
