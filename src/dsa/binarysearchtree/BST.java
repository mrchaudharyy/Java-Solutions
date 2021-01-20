package dsa.binarysearchtree;

import java.util.Stack;

public class BST {

	Node root;

	public void insert(int key, int value) {
		Node newNode = new Node(key, value); // initializing new node.

		if (root == null) { // if first element is going to enter then it would be root node.
			root = newNode;
		} else { // else child is to be stored.
			Node parent;
			Node current = root; // setting current as root node and start traversing

			while (true) { // loop until end is reached
				parent = current; // assume current as parent at first iteration and start traversing
				if (key < current.key) { // of entered key is smaller then current.key then left is activated
					current = current.leftChild; // make left child as current.
					if (current == null) { // if nothing is there then end is reached and we can insert new node
						parent.leftChild = newNode; // put leftChild as newNode.
						return; // and return
					}
				} else { // similar to previous step
					current = current.rightChild;
					if (current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
			}

		}
	}

	public int findMin() {
		Node current = root; // start traversing from root node.
		Node last = null;

		while (current != null) { // loop until null is found
			last = current; // assign current to last every time. if not null then it'll be overrided by
							// next iteration.
			current = current.leftChild; // make leftChild "current"
		}
		// when null is found that means "last" was the last element
		return last.value;
	}

	public int findMax() { // similar to findMax.
		Node current = root;
		Node last = null;

		while (current != null) {
			last = current;
			current = current.rightChild;
		}

		return last.value;
	}

	public boolean deleteNode(int key) {

		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;

		// searching which node is to be deleted.
		while (current.key != key) {
			parent = current;
			if (key < current.key) {
				isLeftChild = true;
				current = current.leftChild;
			} else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if (current == null) {
				return false;
			}
		}

		Node nodeToBeDeleted = current;

		// if leaf node is there
		if (nodeToBeDeleted.leftChild == null && nodeToBeDeleted.rightChild == null) {
			if (nodeToBeDeleted == root) {
				root = null;
			} else if (isLeftChild) {
				parent.leftChild = null;
			} else {
				parent.rightChild = null;
			}
		}

		// if only one node is there (left)
		else if (nodeToBeDeleted.rightChild == null) {
			if (nodeToBeDeleted == root) {
				root = nodeToBeDeleted.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = nodeToBeDeleted.leftChild;
			} else {
				parent.rightChild = nodeToBeDeleted.leftChild;
			}

		}

		// if only one node is there (right)
		else if (nodeToBeDeleted.leftChild == null) {
			if (nodeToBeDeleted == root) {
				root = nodeToBeDeleted.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = nodeToBeDeleted.rightChild;
			} else {
				parent.rightChild = nodeToBeDeleted.rightChild;
			}
		} else {
			// if 2 nodes are there
			Node successor = getSuccessor(nodeToBeDeleted);

			if (nodeToBeDeleted == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}

			successor.leftChild = nodeToBeDeleted.leftChild;
		}
		return true;
	}

	private Node getSuccessor(Node nodeToBeDeleted) {
		Node successorParent = nodeToBeDeleted;
		Node successor = nodeToBeDeleted;

		Node current = nodeToBeDeleted.rightChild; // go to the right child

		while (current != null) { // start going left down the tree until node has no left child
			successorParent = successor;
			successor = current;
			current = current.leftChild;
		}
		// if successor not a right child
		if (successor != nodeToBeDeleted.rightChild) {
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = nodeToBeDeleted.rightChild;
		}
		return successor;
	}

	public void printBST() {
		Stack<Node> globalStack = new Stack<>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");

		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<>();
			isRowEmpty = true;
			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = (Node) globalStack.pop();
				if (temp != null) {
					System.out.print(temp.key);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			}

			System.out.println();
			nBlanks = nBlanks / 2;

			while (localStack.isEmpty() == false)
				globalStack.push(localStack.pop());
		}
		System.out.println("......................................................");
	}

}
