/*
 * File name: Stack.java
 * 
 * Subject  : Simple class that emulates Stack.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package codes;

public class Stack<T> // class declaration.
{
	// object that holds the nodes on the stack.
	private LinkedList<T> data;
	
	// initiate the stack.
	public Stack(String msg) { data = new LinkedList<T>(msg); }
	
	// add an item at the top of the stack.
	public void push(T data) { this.data.insertAtFront(data); }
	
	// remove the top.
	public T pop() { return this.data.removeHead(); }
	
	// print the nodes in stack form.
	public void print()
	{
		while( !isEmpty() )
		{
			System.out.println(this.data.removeHead());
			System.out.println("     |     ");
			System.out.println("     V     ");
			System.out.println("           ");
		}
		
		System.out.println("    NULL     ");
	}
	
	
	// Predicate method [checks if the stack's empty.].
	public boolean isEmpty() { return this.data.isEmpty(); }
}

