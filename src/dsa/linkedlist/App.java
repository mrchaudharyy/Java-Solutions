package dsa.linkedlist;

public class App {

	public static void main(String[] args) {
		CircularLinkedList cll = new CircularLinkedList();
		cll.insertFirst(1);
		
		cll.deleteFirst();
		cll.displayList();
		
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
