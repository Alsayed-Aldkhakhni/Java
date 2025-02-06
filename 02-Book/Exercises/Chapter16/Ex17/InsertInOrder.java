/*
 * File name: InsertInOrder.java
 *  
 * Subject  : Insert some random numbers in order into a list.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 4, 2025
 */


// import(s) declaration.
import java.security.SecureRandom;
import java.util.*;

public class InsertInOrder
{
	public static void main(String[] args)
	{
		// create the objects.
		SecureRandom random = new SecureRandom(); // random numbers generator.
		List<Integer> listOfInts = 
				new LinkedList<Integer>();        // the list to hold the values.
		
		// insert and add the items.
		long sum = 0;
		for(int i = 0; i < 25; i++)
		{
			int num = random.nextInt(0, 101);
			sum += num;
			listOfInts.add(num);
		}
		
		// sort the items.
		Collections.sort(listOfInts);
		
		// display them in a table.
		int count = 1;
		for(Integer i : listOfInts)
		{
			System.out.printf("%02d%s", i, (count % 5 == 0? "\n" : " "));
			count++;
		}
		
		// print the average of those numbers.
		System.out.println();
		System.out.println("Average: " + (sum / 25.0));
	}
}


