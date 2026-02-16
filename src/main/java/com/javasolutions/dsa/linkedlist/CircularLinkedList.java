package com.javasolutions.dsa.linkedlist;

public class CircularLinkedList {

	Node first;
	Node last;

	public CircularLinkedList() {
		first = null;
		last = null;
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		if (isEmpty()) {
			last = node; // if list is empty make newly created node as the last node
		}
		node.next = first; // putting next node as a new node
		first = node; // assigning previous node to this newly created node. Here, linking occurs.
	}

	public void insertLast(int data) {
		Node node = new Node();
		node.data = data;

		if (isEmpty()) {
			first = node;
		} else {
			last.next = node; // if not empty then assign newly created node to next of last node.
			last = node; // make this newly created node as the last node of the list.
		}
	}

	public Node deleteFirst() {
		Node node = first;
		if (first.next == null) { // check if only 1 element is there
			last = null;
		}
		first = first.next; // assigning first element as the next element of old first.
		return node;
	}

	public void deleteLast() {
		Node node = first; // get first element
		if (first == last) { // check if only 1 element is there
			first = null; // if only 1 element is there then make it NULL.
			last = null;
		} else {
			while (node.next != last) { // iterate till second last element of the list
				node = node.next;
			}
			last = node; // assigning second last element to the last node.
			last.next = null; // assigning last.next as null.
		}
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public void displayList() {
		Node node = first; // getting first because we've to display from first to last.
		while (node != null) { // checking until NULL i.e last.
			System.out.print(node.data + " ");
			node = node.next; // assigning next node to current node.
		}
		// exist the loop as soon as we got NULL.
	}

}
