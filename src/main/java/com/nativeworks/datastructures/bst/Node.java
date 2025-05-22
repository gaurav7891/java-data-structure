package com.nativeworks.datastructures.bst;

public class Node{
    String data;
    int intData;
    Node left, right;

    public Node(String data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public Node(int data){
        this.intData = data;
        this.left = null;
        this.right = null;
    }
}