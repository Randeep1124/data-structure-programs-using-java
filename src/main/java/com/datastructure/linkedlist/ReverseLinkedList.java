package com.datastructure.linkedlist;

public class ReverseLinkedList {

	private static Node head;
	private static Node current;
	private static Node prev;
	private static Node next;

	private static Node findReverseLinkedList(Node head) {

		current = head;
		prev = null;
		next = null;

		while (current != null) {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		}
		return prev;
	}

	public static void main(String[] args) {
		LinkedListOpertaions operation = new LinkedListOpertaions();
		Node node1 = new Node(1, null);
		head = operation.insertFirst(null, node1);
		Node node2 = new Node(2, null);
		head = operation.insertLast(head, node2);
		Node node3 = new Node(3, null);
		head = operation.insertLast(head, node3);
		Node node4 = new Node(4, null);
		head = operation.insertLast(head, node4);
		operation.display(head);
		head = findReverseLinkedList(head);
		operation.display(head);

	}

}
