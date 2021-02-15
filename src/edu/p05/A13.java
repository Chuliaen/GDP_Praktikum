package edu.p05;

import edu.unibw.etti.array.ArrayVisualizer;

import java.util.Arrays;

public class A13 {

    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        ArrayVisualizer.add(a);
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    public static int[] selectionSort(int[] a) {
        int count;
        int tmp;
        int tmp2;

        int vergleiche = 0;
        int vertauschungen = 0;

        for (int i = 0; i < a.length; i++) {
            tmp = a[i];
            tmp2 = a[i];
            count = i;

            for (int j = i + 1; j < a.length; j++) {
                vergleiche++;
                if (tmp > a[j]) {
                    tmp = a[j];
                    count = j;
                    vertauschungen++;

                    ArrayVisualizer.update();
                    ArrayVisualizer.setSleep(100);
                }
            }

            a[i] = tmp;
            a[count] = tmp2;

            ArrayVisualizer.update();
            ArrayVisualizer.setSleep(100);
        }
        System.out.println("Vergleiche: " + vergleiche);
        System.out.println("Vertauschungen: " + vertauschungen);
        return a;
    }

    public static void direkteAuswahl(int[] x) {
        int vergleiche = 0;
        int vertausche = 0;

        for (int sortiert = 0; sortiert < x.length; sortiert++) {
            int min_index = sortiert;

            for (int unsortiert = sortiert + 1; unsortiert < x.length; unsortiert++) {
                vergleiche++;
                if (x[unsortiert] < x[min_index]) {
                    min_index = unsortiert;
                }
            }

            if (min_index != sortiert) {
                int hilf = x[sortiert];
                x[sortiert] = x[min_index];
                x[min_index] = hilf;
                vertausche++;
                ArrayVisualizer.update();
                ArrayVisualizer.setSleep(100);
            }
        }
    }
}
