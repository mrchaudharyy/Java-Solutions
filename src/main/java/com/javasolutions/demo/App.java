package com.javasolutions.demo;

public class App {
    Node first;

    public App() {
        first = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node();
        newNode.data = data;
        current.next = newNode;
    }

    public int findMiddle() {
        Node slow = first;
        Node fast = first;

        while (fast != null & fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public boolean hasLoop() {
        Node slow = first;
        Node fast = first;

        if (first == null) {
            return false;
        }

        while (true) {
            slow = slow.next;

            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }

            if (slow == null && fast == null) {
                return false;
            }
            if (slow == fast) {
                return true;
            }
        }

    }
}
