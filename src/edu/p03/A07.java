package edu.p03;

public class A07 {

    public static void main(String[] args) {
        int n = fac(5);
        System.out.println(n);
    }

    public static int fac(int n) {
        int fac = n;

        if (n == 0) {
            return 1;

        } else if (n < 0) {
            return -1;
        }

        for (int i = n - 1; i > 0; i--) {
            if (fac > Integer.MAX_VALUE / i) {
                return -1;
            }

            fac = fac * i;
        }
        return fac;
    }

}
