package com.nativeworks.datastructures;

/**
 * A stack is a linear data structure that follows LIFO principle. Last element added
 * to the stack is first removed.
 * Operations in Stack :
 * push(element) → Adds an element to the top of the stack.
 * pop() → Removes and returns the top element of the stack.
 * peek() → Returns the top element without removing it.
 * isEmpty() → Checks if the stack is empty.
 * size() → Returns the number of elements in the stack.
 */
public class DSStack {
    private int[] arr;
    private int top;
    private int capacity;

    public DSStack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1; // initialize top to -1
    }

    // Push operation
    public void push(int value) {
        if (top == (capacity - 1)) {
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = value;
    }

    // Pop operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--]; // returns top element and then decreased the top value by 1
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top]; // just return top element
    }

    // check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}

class DSStackSolution{
    public static void main(String[] args) {
        DSStack stack = new DSStack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack size before:: " + stack.size());
        System.out.println("Top Element:: " + stack.peek());
        System.out.println("Popped Element:: " + stack.pop());
        System.out.println("Stack size after:: " + stack.size());
    }
}
