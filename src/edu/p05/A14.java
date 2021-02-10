package edu.p05;

import edu.unibw.etti.array.ArrayGenerator;
import edu.unibw.etti.array.ArrayVisualizer;

import java.util.Arrays;

public class A14 {

    public static void main(String[] args) {
        bubbleSort(ArrayGenerator.generateDescendingArray(10));
        bubbleSort(ArrayGenerator.generateAscendingArray(10));
    }

    public static void bubbleSort(int[] x) {
        System.out.println(Arrays.toString(x));
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                count1++;
                if (x[i] > x[j]) {
                    count2++;
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(x) + " | " + count1 + " | " + count2);
        // n(n-1)/2
        // --> kann niemals nur 9 Vergleiche werden?!
    }


}
