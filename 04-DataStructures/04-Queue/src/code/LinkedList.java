/*
 * File name: LinkedList.java
 * 
 * Subject  : A generic class that emulates linked list of nodes.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class LinkedList<T>   // class declaration.
{
	// instance variables.
	private Node<T> head;    // 1st  node in the list.
	private Node<T> tail;    // last node in the list.
	private String  listName;// list name [List of Persons, List of Students]. 

	// ctor to just initialize the instance variables.
	public LinkedList(String listName)
	{
		this.listName = listName;
		head = tail = null;
	}

	// insert a node in the front of the list.
	public void insertAtFront(T data)
	{
		// check if the list is empty. [this's the 1st node.]
	    if(isEmpty())
	        head = tail = new Node<T>(data); 
	    else
	        head = new Node<T>(data, head);
	}

	// insert a node at the end of the list.
	public void insertAtEnd(T data)
	{
		if(isEmpty()) // checks if the list is empty.
			head = tail = new Node<T>(data); 
		else          // append the node at the end.
			tail = tail.next = new Node<T>(data);  
	}

	// remove the 1st node in the list.
	public T removeHead()
	{
		// if we have no nodes.
		if(isEmpty())
			throw new EmptyListException(getListName() + ", is empty.");

		Node<T> dummy =  head;   // hold the current head.

		if(head == tail)         // in case we have one node.
			head = tail = null;
		else
		{
			head = head.next;    // move the [head] to the next node in the list.
			dummy.next = null;   // disconnect the old node pointed to by the head from the list.
		}

		return dummy.data;       // return the node's data to the caller [if needed].
	}

	// remove the last node in the list.	
	public T removeTail()
	{
		// if we have no nodes.
		if(isEmpty())
			throw new EmptyListException(getListName() + ", is empty.");

		// temporary node to traverse the list.
		Node<T> current = head;

		// traverse the list till the node precedes the tail immediately.
		while(current.next != tail)
			current = current.next;

		tail = current;     // make the tail points to the node next to the last.
		current.next = null;// make it points to nothing.

		return current.data;
	}

	// remove any node in between.
	public T removeItem(T data)
	{	
		Node<T> target = null;     // to save the data of the node to be returned.

		if(data == head.data)      // if it is the head.
			return removeHead();   // call this method to remove the head.
		else if(data == tail.data) // if it is the tail.
			return removeTail();   // call this method to remove the tail.
		else                       // otherwise.
		{
			Node<T> current = head;// take a temporary pointer to the list head.

			// traverse up to the node precedes the target.
			while(current.next != null)
			{
				if(current.next.data == data)       // if we step on the node precedes the target.
				{
					target = current.next;           // save the node to be deleted.
					current.next = current.next.next;// link the current node to the one next to the target.[if any].
					target.next = null;              // disconnect the target node.
					break;                           // no more steps needed.
				}

				current = current.next;              // move the [current] to the next node.
			}
		}

		return target.data;                          // return the node's data. [if needed.].
	}

	// print the nodes of the list.
	public void print()
	{
		// print the list's name.
		System.out.println(getListName());

		// a copy of the list's head to traverse the list without corrupting it.
		Node<T> current = head;

		// traversing through the list.
		while(current != null)
		{
			System.out.printf("%s -> ", current.data); // print the data of the node.
			current = current.next;                    // move to the next node.
		}

		System.out.println("\n");
	}

	// [predicate method] checks if the list has no items.
	public boolean isEmpty() { return head == null; }

	// setter and getter of [listName] instance variable.
	public String getListName() { return listName; }
	public void   setListName(String listName) { this.listName = listName; }
}
