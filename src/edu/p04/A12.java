package edu.p04;

public class A12 {

    public static void main(String[] args) {
        int l = 5;
        int m = 4;
        int n = 3;

        double[][] a = {{2.0, -1.0, 0.0, 3.0, -4.0},
                {3.0, -2.0, 2.0, 1.0, 0.0},
                {-1.0, 3.0, -1.0, -2.0, -4.0},
                {3.0, 3.0, -4.0, 2.0, -2.0}};

        double[][] b = {{2.0, 2.0, 3.0},
                {-2.0, -1.0, 2.0},
                {3.0, 4.0, 1.0},
                {-3.0, 4.0, 0.0},
                {1.0, -3.0, 4.0}};

        if (isMatrix(a, a.length, a[0].length)) {
            printMatrix(a);
        }
        System.out.println();
        printMatrix(multMatrices(a, b));
    }

    public static boolean isMatrix(double[][] a, int l, int m) {
        if (l <= 0 || m <= 0 || a == null || a.length != l) {
            return false;
        }

        for (int i = 0; i < l; i++) {
            if (a[i].length != m || a[i] == null) {
                return false;
            }
        }
        return true;
    }

    public static void printMatrix(double[][] c) {
        for (double[] doubles : c) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(doubles[j] + "| \t");
            }
            System.out.println();
        }
    }

    public static double[][] multMatrices(double[][] a, double[][] b) {
        if (!isMatrix(a, a.length, a[0].length) || !isMatrix(b, b.length, b[0].length) || a[0].length != b.length) {
            return null;
        }

        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
