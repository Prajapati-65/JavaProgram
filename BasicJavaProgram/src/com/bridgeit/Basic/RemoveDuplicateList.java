package com.bridgeit.Basic;

public class RemoveDuplicateList {

	Node head = null;
	Node current;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	public void insert(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}

	public void removeAllDuplicates() {
		Node node = new Node(0);
		node.next = head;
		Node prev = node;
		current = head;

		while (current != null) {
			while (current.next != null && prev.next.data == current.next.data)
				current = current.next;

			if (prev.next == current)
				prev = prev.next;
			else
				prev.next = current.next;

			current = current.next;
		}

		head = node.next;
	}

	public void display() {
		Node node = head;
		if (head == null)
			System.out.print(" List is empty");
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
	}

	public static void main(String[] args) {
		RemoveDuplicateList removeDuplicatelist = new RemoveDuplicateList();
		removeDuplicatelist.insert(53);
		removeDuplicatelist.insert(53);
		removeDuplicatelist.insert(49);
		removeDuplicatelist.insert(49);
		removeDuplicatelist.insert(35);
		removeDuplicatelist.insert(28);
		removeDuplicatelist.insert(28);
		removeDuplicatelist.insert(23);
		System.out.println("Before removal of duplicates");
		removeDuplicatelist.display();

		removeDuplicatelist.removeAllDuplicates();
		System.out.println();
		System.out.println("\nAfter removal of duplicates");
		removeDuplicatelist.display();
	}
}
