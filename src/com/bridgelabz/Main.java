package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        // Ability to create a BST by adding 56 and then adding 30 & 70
        BinarySearchTree<Integer> UC1 = new BinarySearchTree<>();
        UC1.insert(56);
        UC1.insert(30);
        UC1.insert(70);
        UC1.inorderTraversal();
    }
}