package edu.p04;

public class A11 {
    /*
    a) Arrays.copyOf()
     */

    public static void main(String[] args) {
        double[] doubleA = {0.0, 1.0, 5.0, 3.0, 4.0};
        System.out.println(getMaximum(doubleA));

        int[] intA = {1, 2, 3, 4, 5, 6};
        System.out.println(getEvenAverage(intA));

        char[] charA = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(revert(charA));

        long[] longA = {10, 11, 12, 14, 19, 22};
        System.out.println(isSorted(longA));
    }

    public static double getMaximum(double[] a) {
        if (a == null) {
            return Double.NaN;
        }
        if (a.length == 0) {
            return Double.NaN;
        }

        double n = a[0];
        for (double v : a) {
            if (v > n) {
                n = v;
            }
        }
        return n;
    }

    public static double getEvenAverage(int[] a) {
        if (a == null) {
            return Double.NaN;
        }

        int tmp = 0;
        double sum = 0;
        for (int j : a) {
            if (j % 2 == 0) {
                sum = sum + j;
                tmp++;
            }
        }
        return tmp == 0 ? 0 : sum / tmp;
    }

    public static char[] revert(char[] a) {
        char[] r = new char[a.length];
        int tmp = 0;

        for (int i = a.length; i > 0; i--) {
            r[i - 1] = a[tmp];
            tmp++;
        }
        return r;
    }

    public static boolean isSorted(long[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
