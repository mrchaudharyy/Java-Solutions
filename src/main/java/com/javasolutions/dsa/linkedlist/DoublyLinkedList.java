package com.javasolutions.dsa.linkedlist;

public class DoublyLinkedList {

	Node first;

	Node last;

	public DoublyLinkedList() {
		first = null;
		last = null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data; // creating independent new Node
		if (isEmpty()) {
			last = newNode; // assigning last to this new node if list is empty
		} else {
			first.previous = newNode; // if list is not empty, then put new node previous to first node.
		}
		newNode.next = first; // now set old first node to next of new node. ( this way it is inserted before
								// first )
		this.first = newNode; // now set current first to new node. ( because it is first node now )
	}

	public void insertLast(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if (isEmpty()) {
			first = newNode;
		} else {
			last.next = newNode; // if list is not empty, add new node to the next of current last node.
			newNode.previous = last; // after adding to the next, set last node to the previous of current new node.
		}
		newNode.next = null; // now nothing is after new node, so set it to null
		this.last = newNode; // now set current last node to new node.
	}

	public Node deleteFirst() {
		Node temp = first;
		if (first.next == null) { // check if only one element is there.
			last = null;
		} else {
			first.next.previous = null;
		}

		first = first.next;
		return temp;
	}

	public Node deleteLast() {
		Node temp = last;
		if (first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last = last.previous;
		return temp;
	}

	public boolean insertAfter(int key, int data) {

		Node current = first; // getting first node
		while (current.data != key) { // iterating up to "key"
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		// now current will point to "key" i.e we need to insert after current.

		Node newNode = new Node();
		newNode.data = data;

		if (current == last) { // if current is the last node the add into last.
			current.next = null;
			last = newNode;
		} else {
			newNode.next = current.next; // new node next will be current node next.
			current.next.previous = newNode; // next node previous would be new node.
		}

		newNode.previous = current; // we're inserting after current(key) node then current will be new node
									// previous.
		current.next = newNode; // same way new node will be next of current node.

		return true;
	}

	public boolean deleteKey(int key) {

		Node current = first;

		while (current.data != key) { // iterate until we find key.
			current = current.next;
			if (current == null) {
				return false;
			}
		}

		if (current == first) { // if current is the first node
			first = current.next; // assign first node to next of current node.
		} else {
			current.previous.next = current.next; // else make current's next as the next of previous of current node.
		}

		if (current == last) { // if current is the last node.
			last = current.previous; // make previous node of current as last.
		} else {
			current.next.previous = current.previous; // else make previous of current node as previous of next node of
														// current.
		}

		return true;
	}

	public void displayForward() {
		System.out.print("Display Forward -> " );
		Node node = first; // getting first because we've to display from first to last.
		while (node != null) { // checking until NULL i.e last.
			System.out.print(node.data + " ");
			node = node.next; // assigning next node to current node.
		}
		System.out.println();
	}

	public void displaybackward() {
		System.out.print("Display Backward -> " );
		Node node = last;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.previous;
		}
		System.out.println();
	}

	public boolean isEmpty() {
		return (first == null);
	}
}
