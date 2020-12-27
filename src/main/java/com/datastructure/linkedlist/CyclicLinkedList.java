package com.datastructure.linkedlist;

import java.util.Objects;

public class CyclicLinkedList {

	private static Node head;
	private static Node p1;
	private static Node p2;

	private static void findCyclicLinkedList(Node head) {

		boolean cyclic = false;
		if (Objects.isNull(head)) {
			System.out.println("linked List is empty");
		} else {
			p1 = head;
			p2 = head;
			int index = 0;
			while (p1.getNext() != null) {
				p2 = p2.getNext();
				p1 = p1.getNext();
				index++;
				if (p1.getNext() != null)
					p1 = p1.getNext();

				if (p1 == p2) {
					cyclic = true;
					break;
				}

			}

			if (cyclic) {
				System.out.println("linked List is cyclic at : " + index + " data is: " + p2.getData());
			} else {
				System.out.println("linked List is not cyclic");
			}
		}
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
		// head = operation.insertLast(head, node1);
		findCyclicLinkedList(head);
	}

}
