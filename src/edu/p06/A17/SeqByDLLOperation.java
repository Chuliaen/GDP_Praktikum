package edu.p06.A17;

public class SeqByDLLOperation {

    public static String getString(SeqByDLL seq, boolean inverted) {
        if (seq == null || seq.head == null || seq.tail == null) {
            return "";
        }

        String s = "";

        if (!inverted) {
            DLLInt liste = seq.head;
            do {
                s += liste.element;
                if (liste.next != null) {
                    s += " : ";
                }
                liste = liste.next;
            } while (liste != null);
        } else {
            DLLInt liste = seq.tail;
            do {
                s += liste.element;
                if (liste.next != null) {
                    s += " : ";
                }
            } while (liste != null);
        }
        return s;
    }

    public static SeqByDLL insert(int value, SeqByDLL seq) {
        if (seq == null || seq.tail == null || seq.head == null) {
            return null;
        }

        DLLInt s1 = seq.head;
        DLLInt neu = new DLLInt(null, value, null);

        if (neu.element < s1.element) {
            neu.next = s1;
            s1.prev = neu;
            seq.head = neu;
            return seq;
        }

        while (s1.next != null) {
            if (s1.next.element > value) {
                neu.next = s1.next;
                s1.next.prev = neu;
                neu.prev = s1;
                s1.next = neu;
                return seq;
            }
            s1 = s1.next;
        }
        s1.next = neu;
        neu.prev = s1;
        seq.tail = neu;
        return seq;
    }

}
