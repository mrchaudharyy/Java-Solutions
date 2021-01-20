package dsa.linkedlist;

public class SinglyLinkedList {

	Node first;
	
	public SinglyLinkedList() {
		first = null;
	}

	public void insertFirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = first; // putting next node as a previous first ( this way node is inserted before )
		first = node; // assigning previous node to this newly created node. Here, linking occurs.
	}
	
	public void insertLast(int data) {
		Node current = first;
		while(current.next != null) {
			current = current.next; // loop until last node i.e NULL and the end ( inside next )
		}
		// here current is initialized with last node which has next as NULL.
		// now we can add new node in current.next
		Node newNode = new Node();
		newNode.data = data;
		current.next = newNode;
	}

	public Node deleteFirst() {
		Node node = first; // getting first and returning back.
		first = first.next; // getting next element of current(first) and assigning to first.
		return node;
	}

	public void displayList() {
		Node node = first; // getting first because we've to display from first to last.
		while (node != null) { // checking until NULL i.e last.
			System.out.print(node.data + " ");
			node = node.next; // assigning next node to current node.
		}
		// exist the loop as soon as we got NULL.
	}

	public boolean isEmpty() {
		return (first == null);
	}

}
