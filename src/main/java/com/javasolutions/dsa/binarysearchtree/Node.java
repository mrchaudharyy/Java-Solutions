package com.javasolutions.dsa.binarysearchtree;

public class Node {

    Node leftChild;
    Node rightChild;
    int data;

    public Node(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (leftChild == null) {
                leftChild = new Node(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new Node(value);
            } else {
                rightChild.insert(value);
            }
        }
    }
        // BST
    public boolean contains(int value) {
        if (value == data) {
            return true;
        } else if (value < data) {
            if (leftChild == null) {
                return false;
            } else {
                return leftChild.contains(value);
            }
        } else {
            if (rightChild == null) {
                return false;
            } else {
                return rightChild.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (leftChild != null) {
            leftChild.printInOrder();
        }
        System.out.println(data);
        if (rightChild != null) {
            rightChild.printInOrder();
        }
    }

}
