package com.datastructure.greatlearning;

class Node {
	int value;
	Node left;
	Node right;

	Node(int value) {
		this.value = value;
	}

}

class TreeTraversal {
	Node root;

	void preOrderTraversal(Node n) {

		if (n != null) {

			System.out.print(n.value + " ");
			preOrderTraversal(n.left);
			preOrderTraversal(n.right);
		}

	}

	void postOrderTraversal(Node n) {

		if (n != null) {

			postOrderTraversal(n.left);
			postOrderTraversal(n.right);
			System.out.print(n.value + " ");
		}

	}

	void InOrderTraversal(Node n) {

		if (n != null) {

			InOrderTraversal(n.left);
			System.out.print(n.value + " ");
			InOrderTraversal(n.right);
		}

	}

}

public class BinaryTreeImplementation {

	public static void main(String[] args) {
		TreeTraversal t = new TreeTraversal();
		t.root = new Node(4);
		t.root.left = new Node(8);
		t.root.right = new Node(5);
		t.root.left.left = new Node(3);
		t.root.left.right = new Node(10);
		t.root.right.left = new Node(13);
		t.root.right.right = new Node(7);
		t.preOrderTraversal(t.root); // 4 8 3 10 5 13 7
		System.out.println();
		t.postOrderTraversal(t.root);// 3 10 8 13 7 5 4
		System.out.println();
		t.InOrderTraversal(t.root); // 3 8 10 4 13 5 7

	}
	
	
	/**    
	 * 
	 *    		4
	 * 		8		5	   
	 *    3  10    13  7
	 *    
	 *    **/

}
