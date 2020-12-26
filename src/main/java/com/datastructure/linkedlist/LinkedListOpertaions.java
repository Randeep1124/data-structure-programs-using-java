package com.datastructure.linkedlist;

import java.util.Objects;

public class LinkedListOpertaions {

	private static Node head;

	private Node insertFirst(Node head, Node node) {

		if (Objects.isNull(node)) {
			return head;
		}

		if (Objects.isNull(head)) {
			return node;
		}
		node.setNext(head);
		head = node;
		return head;

	}

	private Node insertLast(Node head, Node node) {

		if (Objects.isNull(node)) {
			return head;
		}

		if (Objects.isNull(head)) {
			head.setData(node.getData());
			head.setNext(node.getNext());
			return head;
		}

		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(node);
		return head;
	}

	private void display(Node head) {
		Node current = head;
		if (getSize(head) == 1) {
			System.out.println(current);
		}
		while (current != null) {
			System.out.print(current.getData() + " --> ");
			current = current.getNext();
		}
		System.out.print("null");
		System.out.println();
	}

	private Node deleteFirst(Node head) {

		if (Objects.isNull(head)) {
			return head;
		} else {
			Node current = head;
			current = current.getNext();
			head = current;
		}
		return head;
	}

	private Node deleteLast(Node head) {

		if (Objects.isNull(head)) {
			return head;
		} else {
			Node current = head;
			Node prev = null;
			while (current.getNext() != null) {
				prev = current;
				current = current.getNext();
			}
			prev.setNext(null);
		}
		return head;
	}

	private Node deleteNode(Node head, int data) {
		if (Objects.isNull(head)) {
			return head;
		} else {
			Node current = head;
			Node prev = null;
			while (current.getNext() != null && current.getData() != data) {
				prev = current;
				current = current.getNext();
			}
			if (current.getData() == data) {
				prev.setNext(current.getNext());
			}

		}
		return head;
	}

	private int getSize(Node head) {
		int size = 0;
		Node current = head;
		if (Objects.isNull(current)) {
			return size;
		} else if (current.getNext() == null) {
			return ++size;
		} else {
			while (current != null) {
				current = current.getNext();
				size++;
			}
		}
		return size;
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
		System.out.println("size : " + operation.getSize(head));
		head = operation.deleteFirst(head);
		operation.display(head);
		System.out.println("size : " + operation.getSize(head));
		head = operation.deleteLast(head);
		operation.display(head);
		System.out.println("size : " + operation.getSize(head));
		head = operation.deleteNode(head, 1);
		operation.display(head);
		System.out.println("size : " + operation.getSize(head));
		head = operation.deleteNode(head, 5);
		operation.display(head);
		System.out.println("size : " + operation.getSize(head));
	}

}
