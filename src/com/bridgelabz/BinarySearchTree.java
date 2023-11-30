package com.bridgelabz;

/*
Implementation of Binary Search Tree for generics variables
 */
public class BinarySearchTree<T extends Comparable<T>> {
    Node<T> root;

    public BinarySearchTree(){
        this.root = null;
    }

    /*
    @desc: insertion of new node in the object
    @params: data to be inserted
    @return:
     */
    public void insert(T data){
        this.root = insertNode(data,root);
    }

    /*
    @desc: insertion of new node with given data
    @params: data and the root of the object
    @return: new root of the current subtree
     */
    private Node<T> insertNode(T data,Node<T> root){
        Node<T> newNode = new Node<>(data);
        if(root == null){
            this.root = newNode;
            return newNode;
        }

        if(root.data.compareTo(data) > 0){
            root.left = insertNode(data,root.left);
        }else if(root.data.compareTo(data) < 0){
            root.right = insertNode(data,root.right);
        }
        return root;
    }

    /*
    @desc: inorder traversal to get the tree in sorted order
    @params:
    @return:
     */
    public void inorderTraversal(){
        inorderTraversal(root);
        System.out.println();
    }


    /*
    @desc: inorder traversal to get the tree in sorted order
    @params: root of the node
    @return:
     */
    public void inorderTraversal(Node<T> root){
        if(root == null){
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    /*
    @desc: to find number of nodes in current object
    @params:
    @return: integer value as number of nodes
     */
    public int size(){
        return size(root);
    }

    /*
     @desc: to find number of nodes in current object
     @params: root
     @return: integer value as number of nodes
      */
    private int size(Node<T> root){
        if(root == null){
            return 0;
        }
        int leftSize = size(root.left);
        int rightSize = size(root.right);
        return 1 + leftSize + rightSize;
    }


}
