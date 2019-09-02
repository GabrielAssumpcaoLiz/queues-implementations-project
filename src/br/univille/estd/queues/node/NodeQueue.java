package br.univille.estd.queues.node;

import br.univille.estd.queues.EmptyQueueException;

public class NodeQueue {
	
	protected int sizec; 
	protected Node<Cat> headc;
	protected Node<Cat> tailc;
	protected Node<Cat> topc;
	
	protected int sized; 
	protected Node<Dog> headd;
	protected Node<Dog> taild;
	protected Node<Dog> topd;
	
	int senha;
	
	public NodeQueue() {
		
	}
	
	public boolean isEmpty() {
		
		return (headc == null && headd == null);
	}
	
	public void enqueue(Raca element) {
		if(element instanceof Cat) {
		
			Node<Cat> cat = new Node<Cat>((Cat)element, null);
			cat.setSenha(senha);
			if(sizec == 0) {
				headc  = cat;
			}else {
				tailc.setNext(cat);				
			}			
			tailc = cat;
			sizec++;
		}else {
			Node<Dog> dog = new Node<Dog>((Dog)element, null);
			dog.setSenha(senha);
			if(sized == 0) {
				headd  = dog;
			}else {
				taild.setNext(dog);				
			}			
			taild = dog;
			sized++;			
		}
				
		senha++;		
		}
	
	public Raca dequeue() {
		
		if (isEmpty()) {
			throw new EmptyQueueException("Fila Vazia");
		} 	
		
		Raca temp = null;
		
		if (headd.getElement().getId() < headc.getElement().getId()){			
			temp = headd.getElement();
			headd = headd.getNext();
			sized--;
			if(isEmpty()) {
				taild = null;
			}			
		}else {
			temp = headc.getElement();
			headc = headc.getNext();
			sizec--;
			if(isEmpty()) {
				tailc = null;
			}			
		}				
		
		return temp; 
	}
	
	public Cat dequeueCat() {
		if (isEmpty()) {
			throw new EmptyQueueException("Fila Vazia");
		} 
		Cat cat = headc.getElement();
		headc = headc.getNext();
		sizec = sizec--;
		if(isEmpty()) {
			tailc = null;
		}
		return cat;
	}
	
	public Dog dequeueDog() {
		if (isEmpty()) {
			throw new EmptyQueueException("Fila Vazia");
		} 	
		Dog dog = headd.getElement();
		headd = headd.getNext();
		sized--;
		if(isEmpty()) {
			taild = null;
		}
		return dog;
	}

	public int size() {
		return sizec + sized;		
	}	
}
