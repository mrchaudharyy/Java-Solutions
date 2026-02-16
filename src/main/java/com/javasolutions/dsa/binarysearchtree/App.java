package com.javasolutions.dsa.binarysearchtree;

public class App{

	public static void main(String[] args) {
		Node root = new Node(10);
		root.insert(4);
		root.insert(7);
		root.insert(3);
		root.insert(9);
		root.insert(6);
		root.insert(8);
		root.insert(1);
		System.out.println(root.contains(7));
	}

}

