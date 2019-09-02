package br.univille.estd.queues.array;

import br.univille.estd.queues.Queue;

public class ArrayQueue<E> implements Queue<E> {

	protected int f = 0;
	protected int r = 0;
	public static final int CAPACITY = 1000;
	protected int capacity;
	protected E Q[];
	public ArrayQueue() {
		this(CAPACITY);
	}
	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		Q = (E[])new Object[this.capacity];
	}

	@Override
	public long size() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		
		return false;
	}

	@Override
	public void enqueue(E e) {
		
		
	}

	@Override
	public E dequeue() {
		
		return null;
	}

	@Override
	public E front() {
		
		return null;
	}

}
