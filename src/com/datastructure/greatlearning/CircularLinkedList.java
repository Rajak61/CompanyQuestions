package com.datastructure.greatlearning;

public class CircularLinkedList {

	class Node {

		int data;
		Node next;

		Node(int data) {

			this.data = data;
		}
	}

	Node head = null;
	Node tail = null;

	// https://www.baeldung.com/java-circular-linked-list#:~:text=A%20circular%20linked%20list%20is,null%20element%20at%20the%20end.
	public void insertNode(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			tail.next = newNode;
		}
		tail = newNode;
		tail.next = head;
	}

	void displayElements() {
		Node currentNode = head;
		if (head != null) {
			do {
				System.out.print(currentNode.data + " ");
				currentNode = currentNode.next;
			} while (currentNode != head);
		} else {
			System.out.println("List is empty");
		}
	}

	void deleteNode() {// https://www.youtube.com/watch?v=OWCao3Ul6n4
		if (head == tail) {
			head = tail = null;
		} else {
			head = head.next;
			tail.next = head;
		}

	}

	void deleteReqNode(int value) {// https://www.baeldung.com/java-circular-linked-list#:~:text=A%20circular%20linked%20list%20is,null%20element%20at%20the%20end.

		//need to write 
	}

	public static void main(String[] args) {

		CircularLinkedList l = new CircularLinkedList();
		l.insertNode(2);
		l.insertNode(76);
		l.insertNode(21);

		l.displayElements();
		l.deleteNode();
		System.out.println();
		l.displayElements();

	}

}
