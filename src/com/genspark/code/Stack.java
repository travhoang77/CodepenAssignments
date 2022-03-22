package com.genspark.code;

public class Stack {
    private Node head;

    private class Node {
        Object data;
        Node next;
    }

    public Stack() {
        head = null;
    }

    public Object pop() throws Exception {
        if(head == null) {
            throw new Exception();
        }

        Object data = head.data;
        head = head.next;

        return data;
    }

    public void push(Object data) {
        Node oldHead = head;
        head = new Node();
        head.data = data;
        head.next = oldHead;
    }
}
