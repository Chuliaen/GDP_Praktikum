package edu.p06.A16;

public class SLLIntOperation {

    private static boolean equal = false;

    public static void main(String[] args) {
        SLLInt seq = new SLLInt(1, new SLLInt(2, new SLLInt(13, new SLLInt(15))));
        SLLInt seq2 = new SLLInt(1, new SLLInt(2, new SLLInt(13, new SLLInt(15))));
        /*
        System.out.println(getString(seq));
        System.out.println(isSorted(seq));
        System.out.println(getLength(seq));
        System.out.println(getString(insert(-1, seq)));
        System.out.println(isEqualRekursiv(seq, seq2));
        System.out.println(isEqualIterativ(seq, seq2));
        System.out.println(getString(concat(seq, seq2)));
         */

    }


    public static String getString(SLLInt seq) {
        if (seq == null) {
            return "";
        }

        if (seq.next == null) {
            return "" + seq.element;
        }
        return seq.element + " : " + getString(seq.next);
    }

    public static int getLength(SLLInt seq) {
        int count = 0;
        while (seq != null) {
            count++;
            seq = seq.next;
        }

        return count;
    }

    public static boolean isSorted(SLLInt seq) {
        if (seq == null) {
            return false;
        }

        while (seq.next != null) {
            if (seq.element > seq.next.element) {
                return false;
            }
            seq = seq.next;
        }
        return true;
    }

    public static SLLInt insert(int value, SLLInt seq) {
        if (seq == null) {
            return new SLLInt(value);
        }

        SLLInt seq2 = seq;
        SLLInt tmp = null;

        if (seq.element > value) {
            return new SLLInt(value, seq);
        }

        while (seq.element < value) {
            if (seq.next == null) {
                seq.next = new SLLInt(value);
                return seq2;
            }
            tmp = seq;
            seq = seq.next;
        }
        tmp.next = new SLLInt(value, seq);
        return seq2;
    }

    public static boolean isEqualRekursiv(SLLInt seq1, SLLInt seq2) {
        if (seq1 == null && seq2 == null) {
            return true;
        }

        if (seq1.element == seq2.element) {
            if (seq1.next == null && seq2.next == null) {
                equal = true;
                return equal;
            }
            isEqualRekursiv(seq1.next, seq2.next);
        }
        return equal;
    }

    public static boolean isEqualRekursiv2(SLLInt seq1, SLLInt seq2) {
        if (seq1 == null && seq2 == null) {
            return true;
        }
        if (seq1 == null || seq2 == null) {
            return false;
        }
        if (seq1.element != seq2.element) {
            return false;
        }
        return isEqualRekursiv2(seq1.next, seq2.next);
    }

    public static boolean isEqualIterativ(SLLInt seq1, SLLInt seq2) {
        if (seq1 == null && seq2 == null) {
            return true;
        }

        while (seq1 != null && seq2 != null) {
            if (seq1.element == seq2.element) {
                seq1 = seq1.next;
                seq2 = seq2.next;
            } else {
                return false;
            }
        }
        return true;
    }

    public static SLLInt concat(SLLInt seq1, SLLInt seq2) {
        if (seq1 == null) {
            return seq2;
        }
        if (seq2 == null) {
            return seq1;
        }

        SLLInt seq3 = seq1;

        while (seq1.next != null) {
            seq1 = seq1.next;
        }
        seq1.next = seq2;
        return seq3;
    }
}
