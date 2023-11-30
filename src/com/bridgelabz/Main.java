package com.bridgelabz;

public class Main {
    public static void main(String[] args) {
        // Ability to create a BST by adding 56 and then adding 30 & 70
        BinarySearchTree<Integer> UC1 = new BinarySearchTree<>();
        UC1.insert(56);
        UC1.insert(30);
        UC1.insert(70);
        UC1.inorderTraversal();

        //Ability to create the binary search tree
        BinarySearchTree<Integer> UC2 = new BinarySearchTree<>();
        UC2.insert(56);
        UC2.insert(30);
        UC2.insert(70);
        UC2.insert(22);
        UC2.insert(40);
        UC2.insert(60);
        UC2.insert(95);
        UC2.insert(11);
        UC2.insert(65);
        UC2.insert(3);
        UC2.insert(16);
        UC2.insert(63);
        UC2.insert(67);
        UC2.inorderTraversal();
        System.out.println("size is: " + UC2.size());


    }
}