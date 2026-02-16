package com.javasolutions.dsa.linkedlist;

public class App {

	public static void main(String[] args) {
		SinglyLinkedList cll = new SinglyLinkedList();
		cll.insertFirst(1);
		cll.insertFirst(5);
		cll.insertFirst(3);
		cll.insertFirst(4);
		cll.insertFirst(6);

		cll.displayList();
		System.out.println("Middle :: " + cll.findMiddle());

		System.out.println("Inserting Loop");

		 cll.first.next.next.next.next.next = cll.first.next;

		System.out.println("Loop -> " +cll.hasLoop(cll.first));
		
	}

	public static int getNodeLength(Node node) {
		int count = 0;
		while (node != null) {
			count++;
			node = node.next;
		}
		return count;
	}

}
