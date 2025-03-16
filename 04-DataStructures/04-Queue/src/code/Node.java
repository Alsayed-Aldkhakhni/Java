/*
 * File name: Node.java
 * 
 * Subject  : A generic class that emulates Nodes in a linked list.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Node<T> // class declaration.
{
	// instance variables.
	protected T data;       // the instance data.
	protected Node<T> next; // pointer to the next node.
	
	// one ctor to create a node that points to nothing. 
	public Node(T data)
	{
		this.data = data; // set the data.
		this.next = null; // no next.
	}

	// another ctor to create a node that points to a node. 	
	public Node(T data, Node<T> next)
	{
		this(data);       // calls the above ctor.
		this.next = next; // set the next.
	}
}

