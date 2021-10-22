package com.codegym;

public class Node {
    private Object data;
    private Node next;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
