package edu.p04;

import java.util.Arrays;

public class A10 {
    public static void main(String[] args) {
        char[] eingabe = new char[]{'K', 'a', 's', 's', 'e'};
        char[] ergebnis = ersetze(eingabe, 'K', 'T');

// Ausgabe der Eingabe
        System.out.println("Eingabe: " + Arrays.toString(eingabe));

// Ausgabe des Ergebnis
        System.out.println("Ergebnis: " + Arrays.toString(ergebnis));
    }

    // Klassenmethode zum Ersetzen von Buchstaben
    public static char[] ersetze(char[] a, char suche, char ersetze) {
        /*char[] b = new char[a.length];

        //char[] b = Arrays.copyOf(a, a.length);

        for (int i = 0; i < b.length; i++) {
            b[i] = a[i];
        }
        */

        for (int i = 0; i < a.length; i++) {

            // Ersetzen der Buchstaben
            if (a[i] == suche) {
                a[i] = ersetze;
            }
            //b[i] = ersetze;
        }
        return a;
        //return b;
    }

    /*
    a) Weil das eingabe Feld übergeben wird und das dann auch bearbeitet wird.
    b) a auf einen anderen Arry koppieren und den bearbeiten
     */
}
