package com.nativeworks.datastructures.bst;


/**

 Tree Data structure
 ----------------------
  A Tree is a widely used non-linear data structure that represents a hierarchical
  relationship between elements.

 Key Terminology
 ----------------------

 1. Node : A single element in a tree.
 2. Root: The topmost node in a tree.
 3. Parent: A node that has child nodes.
 4. Child: A node that descends from another node
 5. Leaf: A node with no children.
 6. Edge: The connection between one node and another.
 7. Subtree: A tree formed by a node and its descendants.
 8. Depth: Number of edges from the root to a node.
 9. Height: Number of edges on the longest path from a node to a leaf.
 10. Level: The distance from the root

 Properties of a Tree
 ----------------------

 1. There is one and only one path between any two nodes.
 2. A tree with n nodes has exactly n-1 edges.
 3. It is acyclic -- no cycles
 4. It's a recursive structure: every child subtree is itself a tree.


 Types of Trees
 ----------------------

 1. Binary Tree: Each node has at most two children.
 2. Binary Search Tree: Binary tree with left child < node < right child.
 3. Balanced Tree: Tree where height is minimized for efficient operations.
 4. AVL Tree or Red-Black Tree: Self-balancing tree.
 5. Trie: Tree used for efficient retrieval of strings.
 6. Heap: Complete binary tree used for priority queues.

 Tree Traversal
 ----------------------

 1. In-order : Left - Root - Right
 2. Pre-order : Root - Left - Right
 3. Post-order : Left - Right - Root
 4. Level-order : Breadth first


 Binary Tree diagram
 ----------------------
 A
 / \
 B   C
 / \
 D   E


 Binary Search Tree
 ----------------------
 50
 /  \
 30    70
 / \    / \
 20  40  60  80


 */


public class BinaryTree {

    Node root;
    public BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node("A");
        tree.root.left = new Node("B");
        tree.root.right = new Node("C");
        tree.root.left.left = new Node("D");
        tree.root.left.right = new Node("E");
    }
}
