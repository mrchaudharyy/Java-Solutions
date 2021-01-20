package dsa.binarysearchtree;

public class App{

	public static void main(String[] args) {
		BST tree = new BST();
		
		tree.insert(50, 1);
		tree.insert(40, 2);
		tree.insert(60, 3);
		tree.insert(30, 4);
		tree.insert(70, 5);
		
		//System.out.println(tree.findMix());
		//System.out.println(tree.findMax());
		
		tree.printBST();
		
		tree.deleteNode(60);
		
		tree.printBST();

	}

}

