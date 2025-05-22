package com.nativeworks.datastructures.bst;

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public static Node insert(Node node, int value) {
        // if the tree is empty, return a new node
        if (node == null) return new Node(value);

        // if the key is already present in the tree return the node.
        if (node.intData == value) return node;

        // recursively insert node based on value
        if (value < node.intData) {
            node.left = insert(node.left, value);
        } else {
            node.right = insert(node.right, value);
        }
        return node;
    }

    public static void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.intData + " ");
            inorder(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = null;

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 70);
        root = insert(root, 60);
        root = insert(root, 80);

        // Print inorder traversal of the BST
        inorder(root);
    }
}
