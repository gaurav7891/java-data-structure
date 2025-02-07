package com.nativeworks.datastructures;

/**
 * Queue  is a linear Data structure that follows FIFO principle.
 * Element inserted first will be removed first
 * <p>
 * Operations in Queue:
 * 1. Enqueue - Adds an element to the rear
 * 2. Dequeue - Removes and returns the element from the front of the queue
 * 3. Peek - Returns the front element without removing
 * 4. isEmpty - Checks if the queue is empty
 */
public class DSQueue {
    private int[] arr;
    private int front, rear, capacity;

    public DSQueue(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // 1. Enqueue - Adds an element to the rear
    public void enqueue(int value) {
        if (rear == (capacity - 1)) {
            System.out.println("Queue is overflow");
            return;
        }
        arr[++rear] = value;
    }

    // 2. Dequeue - Removes and returns the element from the front of the queue
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is underflow");
            return -1;
        }
        return arr[front++];
    }

    // 3. Peek - Returns the front element without removing
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is underflow");
            return -1;
        }
        return arr[front];
    }

    // 4. isEmpty - Checks if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    public int size() {
        return rear - front + 1;
    }
}

class DSQueueSolution {
    public static void main(String[] args) {
        DSQueue queue = new DSQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element:: " + queue.peek());
        System.out.println("Dequeued element:: " + queue.dequeue());
        System.out.println("Queue size:: " + queue.size());
    }
}