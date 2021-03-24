package edu.probe;

import java.util.stream.IntStream;

public class Parameter {

    public static void main(String[] args) {
        System.out.println(iterative(3));
        IntStream stream = IntStream.range(0,99);
        stream.forEach(Parameter::iterative);
    }

    // ????????????????????
    public static int iterative(int n) {
        while (n != 91) {
            if (n <= 100) n = n + 11;
            if (n > 100) n = n - 10;
        }
        return n;
    }


}
