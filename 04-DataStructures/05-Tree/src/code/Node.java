/*
 * File name: Node.java
 * 
 * Subject  : Construct the Node which makes up a tree.
 * 
 * Date     : March 15, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Node<T extends Comparable<T>> // class declaration.
{
	// instance variables.
	protected Node<T> left;
	protected T data;
	protected Node<T> right;
	
	// ctor to initialize the node.
	public Node(T data)
	{
		this.data = data;
		left = right = null;
	}
	
	// insert a new node in the tree.
	public void insert(T newNode)
	{
		/* Trees allow no duplication. */
		
		// if the node to be inserted is on the left of the root.
		if(newNode.compareTo(data) < 0)
		{
			if(left == null)
				left = new Node<T>(newNode);
			else
				left.insert(newNode); // recursive step.
			
		} // if the node to be inserted is on the right of the root.
		else if(newNode.compareTo(data) > 0)
		{
			if(right == null)
				right = new Node<T>(newNode);
			else
				right.insert(newNode); // recursive step.
		}
	}
}
