package br.univille.estd.queues.node;

public class Node<E> {
	
	private E element;
	private Node<E> next;
	private int senha;
	
	public Node() {
		this(null,null);
	}
	
	public Node(E e, Node<E> n) {
		element = e;
		next = n;
	}
	
	public E getElement() {
		return element;
	}
	public void setElement(E element) {
		this.element = element;
	}
	public Node<E> getNext() {
		return next;
	}
	public void setNext(Node<E> next) {
		this.next = next;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	

}
