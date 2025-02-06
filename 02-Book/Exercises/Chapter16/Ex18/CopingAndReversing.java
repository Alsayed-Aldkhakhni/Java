/*
 * File name: CopingAndReversing.java
 *  
 * Subject  : Copy list's content to another one in a reversed order.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 3, 2025
 */

// import declaration.
import java.util.*;

public class CopingAndReversing // class declaration.
{
	public static void main(String[] args)
	{
		// the 1st list that contains the characters.
		List<Character> list1 = new LinkedList<Character>();
		
		// Insert [A, J].
		for(int i = 0; i < 10; i++)
			list1.add( (char)(i+65) );
		
		
		// create the 2nd list and a reversed iterator to traverse list1 backward.
		ListIterator<Character> iterator = list1.listIterator(list1.size());
		List<Character> list2 = new LinkedList<Character>();

		// fill the list with the reversed order.
		while(iterator.hasPrevious())
			list2.add(iterator.previous());
		
		// print them.
		System.out.println("List1: " + list1);
		System.out.println("List2: " + list2);
	}
}

