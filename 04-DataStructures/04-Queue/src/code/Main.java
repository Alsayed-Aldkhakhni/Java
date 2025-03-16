/*
 * File name: Main.java
 * 
 * Subject  : Test our homemade class Queue.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Main // class declaration.
{
	public static void main(String[] args)
	{
		// a queue of waiting customers.
		String[] waitingQueue =
			{ "Hoda", "Moamen", "Olaa", "Alaa", "Khalid", "Tamer",
			  "Saad", "Hashim", "John", "Jane" };

		// create a queue to hold those names.
		Queue<String> queue = new Queue<String>("Queue of customers");

		// insert those names into the queue.
		for(String customerName : waitingQueue)
			queue.enqueue(customerName);

		try
		{
			// Serve those customers.
			while(true)
				System.out.println("next customer -> " + queue.dequeue());
		}
		catch(EmptyListException ex)
		{
			ex.printStackTrace();
		}
	}
}

