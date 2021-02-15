package edu.p05;

import java.util.Arrays;

public class A15 {

    public static void main(String[] args) {
        double[] x = {1.0, 3.0, 4.5, 2.3, 7.1, 1.2, 1.5, 3.0};
        quickSort(x, 0, x.length - 1);
        System.out.println(Arrays.toString(x));
    }

    public static void quickSort(double[] a, int i, int j) {
        if (a == null || j <= i) {
            return;
        }
        double pivot = a[i];
        int vonLinks = i;
        int vonRechts = j;
        while (vonLinks <= vonRechts) {
            while (a[vonLinks] > pivot) {
                vonLinks++;
                if (vonLinks > j) {
                    break;
                }
            }
            while (a[vonRechts] <= pivot) {
                vonRechts--;
                if (vonRechts < i) {
                    break;
                }
            }
            if (vonLinks < vonRechts) {
                double tmp = a[vonLinks];
                a[vonLinks] = a[vonRechts];
                a[vonRechts] = tmp;
            }
        }
        if (vonRechts < i) {
// quickSort(a, i, i);
            quickSort(a, i + 1, j);
        } else {
            quickSort(a, i, vonRechts);
            quickSort(a, vonLinks, j);
        }
    }

}
