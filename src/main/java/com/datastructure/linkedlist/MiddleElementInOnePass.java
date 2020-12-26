package com.datastructure.linkedlist;

import java.util.Objects;

public class MiddleElementInOnePass {

	private static Node head;

	public static int findMiddleElement(Node head) {

		if (Objects.isNull(head)) {
			return 0;
		} else {
			Node p1 = head;
			Node p2 = head;
			while (p1.getNext() != null) {
				p1 = p1.getNext();
				p2 = p2.getNext();
				if (p1.getNext() != null) {
					p1 = p1.getNext();
				}
			}
			return p2.getData();
		}
	}

	public static void main(String[] args) {
		LinkedListOpertaions operation = new LinkedListOpertaions();
		Node node1 = new Node(1, null);
		head = operation.insertFirst(null, node1);
		Node node2 = new Node(2, null);
		head = operation.insertLast(head, node2);
		Node node3 = new Node(3, null);
		head = operation.insertFirst(head, node3);
		Node node4 = new Node(4, null);
		head = operation.insertLast(head, node4);
		Node node5 = new Node(5, null);
		head = operation.insertFirst(head, node5);
		operation.display(head);
		System.out.println(findMiddleElement(head));
	}

}
