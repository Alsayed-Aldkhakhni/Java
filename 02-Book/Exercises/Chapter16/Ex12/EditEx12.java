/*
 * File name: EditEx12.java
 *  
 * Subject  : Use Arrays.asList() instead of advanced for to fill the list.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 6, 2025
 */

// import(s) declaration.
import java.util.*;

public class EditEx12 // class declaration.
{
	public static void main(String[] args)
	{
		// add colors elements to list1
		String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
		List<String> list1 = new LinkedList<>(Arrays.asList(colors));

		// add colors elements to list2
		String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
		List<String> list2 = new LinkedList<>(Arrays.asList(colors2));

		list1.addAll(list2); // concatenate lists
		list2 = null;        // release resources
		
		printList(list1);    // print list1 elements
		
		toUppercase(list1);  // convert to upper-case string
		printList(list1);    // print list1 elements
		
		System.out.printf(
				"%nDeleting elements 4 to 6...");
		removeItems(list1, 4, 7); // remove items 4-6 from list
		printList(list1);         // print list1 elements
		
		printReversedList(list1); // print list in reverse order
	}
	
	// output List contents
	private static void printList(List<String> list)
	{
		System.out.printf("%nlist:%n");
		System.out.printf("%s ", list);
		System.out.println();
	}
	
	// locate String objects and convert to upper-case
	private static void toUppercase(List<String> list)
	{
		ListIterator<String> iterator = list.listIterator();
		while (iterator.hasNext())
		{
			String color = iterator.next();    // get item
			iterator.set(color.toUpperCase()); // convert to upper case
		}
	}
	
	// obtain sublist and use clear method to delete sublist items
	private static void removeItems(List<String> list, int start, int end)
	{
		list.subList(start, end).clear();      // remove items
	}
	
	// print reversed list
	private static void printReversedList(List<String> list)
	{
		// reversed iterator, starts at the end.
		ListIterator<String> iterator = list.listIterator(list.size());
		System.out.printf("%nReversed List:%n");
		
		
		while (iterator.hasPrevious())         // print list in reverse order
			System.out.printf("%s ", iterator.previous());
	}
}

