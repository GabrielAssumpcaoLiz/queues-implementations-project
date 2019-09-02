package br.univille.estd.queues.node;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import br.univille.estd.queues.EmptyQueueException;

public class NodeQueueTests {
	
	@Test
	public void isEmpty() {
		NodeQueue queue = new NodeQueue();
		assertEquals("A fila deve estar vazia",true,queue.isEmpty());
	}

	@Test
	public void size() {		
		NodeQueue queue = new NodeQueue();
		assertEquals("O tamanho da fila deve ser zero",0,queue.size());
	}	

	@Test
	public void enqueue() {		
		
		NodeQueue queue = new NodeQueue();
		Cat cat = new Cat();
		queue.enqueue(cat);
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeue() {		
		
		NodeQueue queue = new NodeQueue();
		Cat cat = new Cat();
		queue.enqueue(cat);
		queue.enqueue(new Dog());			
		
		assertEquals("Dequeue deve retornar o elemento Cat",cat,(Cat)queue.dequeue());
		assertEquals("Fila deve conter um elemento",1,queue.size());
	}
	
	@Test
	public void dequeueDog() {		
		
		NodeQueue queue = new NodeQueue();
		Cat cat = new Cat();
		queue.enqueue(cat);
		Dog dog = new Dog();
		queue.enqueue(dog);
		queue.enqueue(new Dog());		
		
		assertEquals("Dequeue deve retornar o elemento Dog",dog,(Dog)queue.dequeueDog());
		assertEquals("Fila deve conter um elemento",2,queue.size());
	}
	
	@Test
	public void dequeueCat() {		
		
		NodeQueue queue = new NodeQueue();
		Cat cat = new Cat();
		queue.enqueue(cat);
		Dog dog = new Dog();
		queue.enqueue(dog);				
		
		assertEquals("Dequeue deve retornar o elemento Cat",cat,(Cat)queue.dequeueCat());
		assertEquals("Fila deve conter um elemento",2,queue.size());
	}	
	
	@Test
	public void dequeueThrowsException() {
		NodeQueue queue = new NodeQueue();
		try {
			queue.dequeue();
			fail("Fila deve gerar exceçao EmptyQueueException");
		}catch(EmptyQueueException ignored) {
		}
	}	

}
