package edu.p06.A16;

public class SLLInt { // SLLInt: Single Linked List

    public int element; // aktuelles Element
    public SLLInt next; // Referenz auf den Rest der Liste

    public SLLInt(int e, SLLInt n) {
        element = e;
        next = n;
    }

    public SLLInt(int e) {
        element = e;
        next = null;
    }
}
