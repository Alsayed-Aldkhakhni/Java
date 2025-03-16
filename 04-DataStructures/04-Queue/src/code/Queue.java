/*
 * File name: Queue.java
 * 
 * Subject  : A generic class that emulates a queue of nodes.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Queue<T> // class declaration;
{
	// instance variable, holds the queue's nodes.
	private LinkedList<T> data;
	
	// build the queue.
	public Queue(String listName) { data = new LinkedList<T>(listName); }

	// insert a new node at the end of the queue.
	public void enqueue(T node) { data.insertAtEnd(node); }
	
	// remove the 1st node in the queue.
	public T    dequeue() { return data.removeHead(); }
	
	// predicate method, checks if the queue's empty.
	public boolean isEmpty() { return data.isEmpty(); }
	
	// print the queue.
	public void print() { data.print(); }
}

