package com.genspark.code;

public class Queue {

    private Node front, rear;
    private int currentSize;

    private class Node {
        Object data;
        Node next;
    }

    public Queue()
    {
        front = null;
        rear = null;
        currentSize = 0;
    }

    public boolean isEmpty()
    {
        return (currentSize == 0);
    }

    public Object dequeue()
    {
        Object data = front.data;
        front = front.next;
        if (isEmpty())
        {
            rear = null;
        }
        currentSize--;
        return data;
    }

    public void enqueue(Object data)
    {
        Node oldRear = rear;
        rear = new Node();
        rear.data = data;
        rear.next = null;
        if (isEmpty())
        {
            front = rear;
        }
        else
        {
            oldRear.next = rear;
        }
        currentSize++;
    }
}
