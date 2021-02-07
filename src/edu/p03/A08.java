package edu.p03;

public class A08 {

    public static void main(String[] args) {
        int n = ggT(25, 5);
        System.out.println(n);
    }

    public static int ggT(int a, int b) {
        if (a <= 0 || b <= 0) {
            return -1;
        }

        while (b != 0) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

}
