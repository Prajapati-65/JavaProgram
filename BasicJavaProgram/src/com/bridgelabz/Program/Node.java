package com.bridgelabz.Program;

/**
 * @author OmPrajapati
 *
 * @param <Genric Type>
 */
public class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
		next = null;
	}
}
