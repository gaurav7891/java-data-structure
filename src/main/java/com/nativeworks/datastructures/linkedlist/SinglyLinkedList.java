package com.nativeworks.datastructures.linkedlist;

/**
 * A linked list is a linear data structure in which elements are connected using
 * pointers. Linked list do not have fixed size and elements can be inserted or
 * removed dynamically
 * <p>
 * 1. Singly Linked list - Each node points to the next node.
 * 2. Doubly linked list - Each node has pointers to both the next and previous nodes.
 * 3. Circular linked list - The last node connects back to the first node.
 */

// Define a node
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {

    private Node head;

    /**
     * Create a new node,
     * check if the newNode is first element in linked list
     * if yes then make newNode as head node.
     * otherwise traverse the linkedList to find the last element whose next element is null
     * link the newNode to last element
     *
     * @param data to insert as new node
     */
    public void insert(int data) {
        // create a node
        Node newNode = new Node(data);

        /*
         * check if head is null,
         * it means this is the first node
         * and assign his node as head node
         */
        if (head == null) {
            head = newNode;
        } else {
            // create a temp node to traverse the linked list and check the last element
            // And link the newNode to last element
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    /**
     * @param key to be deleted
     */
    public void delete(int key) {
        // we have to keep the reference of the previous node as once the element deleted we need to link the previous node
        // to next node
        Node temp = head, prev = null;

        // if the data to be deleted is the first node itself then make temp.next as the head node
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        // otherwise iterate the linked list
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        // if the element is not found
        if (temp == null) return;
        prev.next = temp.next;


    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}

class SinglyLinkedListSolution{
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Linked list");
        list.display();

        System.out.println("\n\nLinked list after 30 deleted");
        // delete
        list.delete(30);
        list.display();
    }
}
