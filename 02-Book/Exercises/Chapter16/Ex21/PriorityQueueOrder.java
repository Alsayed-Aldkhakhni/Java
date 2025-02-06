/*
 * File name: PriorityQueueOrder.java
 *  
 * Subject  : Reverse the polling order of the PriorityQueue.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 4, 2025
 */

// import(s) declaration.
import java.util.*;
import java.security.SecureRandom;

public class PriorityQueueOrder // class declaration.
{
	public static void main(String[] args)
	{
		// queue of capacity 11 and revered order.
		PriorityQueue<Double> queue =
				new PriorityQueue<Double>(11, Collections.reverseOrder());
		
		// random numbers generator.
		SecureRandom random = new SecureRandom();
				
		// insert 10 elements to queue randomly.
		for(int i = 0; i < 10; i++)
			queue.offer( i + random.nextDouble(0, 5));
		
		// display elements in queue
		System.out.print("Polling from queue:\n");
		
		int count = 1;
		while (queue.size() > 0)
		{
			// poll(): removes the highest priority 
			//         value and returns its value.
			System.out.printf(
					"#%02d: %.1f%n", (count++), queue.poll());
		}
	}
}


