/*
 * File name: SortWords.java
 *  
 * Subject  : Sort the words of a statement.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 4, 2025
 */


import java.util.*;    // import(s) declarations.
public class SortWords // class declaration.
{
	public static void main(String[] args)
	{
		try(Scanner input = new Scanner(System.in))
		{
			System.out.print("Enter a phrase: "); // prompt the user to enter a phrase.
			String str = input.nextLine();        // read it.
			String[] strs = str.split(" ");       // divide it into tokens.

			Set<String> set =                     // sort those tokens.
					new TreeSet<String>(Arrays.asList(strs));
			
			System.out.println();                 // just a blank line.
			System.out.println(set);              // display them.
		}
		catch(Exception ex) {                     // if any unexpected action happened.
			ex.printStackTrace();                 // print the error caused the exception.
		}
	}
}

