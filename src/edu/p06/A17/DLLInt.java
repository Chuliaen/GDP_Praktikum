package edu.p06.A17;

public class DLLInt { // DLLInt: Double Linked List

    public DLLInt prev; // Referenz auf das vorherige Element
    public int element; // aktuelles Element
    public DLLInt next; // Referenz auf den Rest der Liste

    public DLLInt(DLLInt p, int e, DLLInt n) {
        prev = p;
        element = e;
        next = n;
    }
}
