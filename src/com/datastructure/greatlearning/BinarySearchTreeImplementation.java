package com.datastructure.greatlearning;

//class Node { //now taking from other Bt class
//
//	int value;
//	Node left;
//	Node right;
//
//	Node(int value) {
//		this.value = value;
//	}
//}

class Bst {

	Node root;

	void insertValue(int value) {
		root = insertNode(root, value);
	}

	Node insertNode(Node root, int value) {
		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.value) {
			root.left = insertNode(root.left, value);
		} else if (value > root.value) {
			root.right = insertNode(root.right, value);
		}
		return root;

	}

	void preOrderTraversal(Node n) {

		if (null != n) {

			System.out.print(n.value + " ");
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}
	}
	void InOrderTraversal(Node n) {

		if (n != null) {

			InOrderTraversal(n.left);
			System.out.print(n.value + " ");
			InOrderTraversal(n.right);
		}

	}
	void postOrderTraversal(Node n) {

		if (n != null) {

			postOrderTraversal(n.left);
			postOrderTraversal(n.right);
			System.out.print(n.value + " ");
		}

	}

}

public class BinarySearchTreeImplementation {

	public static void main(String[] args) {
		Bst b = new Bst();
//		b.insertValue(13);
//		b.insertValue(32);
//		b.insertValue(43);
//		b.insertValue(3);
//		b.insertValue(7);
//		b.insertValue(5);
//		b.insertValue(0);
		
		b.insertValue(50);
		b.insertValue(30);
		b.insertValue(20);
		b.insertValue(40);
		b.insertValue(70);
		b.insertValue(60);
		b.insertValue(80);
		b.preOrderTraversal(b.root);
		
		System.out.println();
		b.InOrderTraversal(b.root);
		
		System.out.println();
		b.postOrderTraversal(b.root);
	}

}
