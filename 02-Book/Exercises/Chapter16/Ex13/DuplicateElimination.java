/*
 * File name: DuplicateElimination.java
 *  
 * Subject  : Read some names and remove the duplication.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 3, 2025
 */

// import(s) declaration.
import java.util.*;

public class DuplicateElimination // class declaration.
{
	public static void main(String[] args)
	{
		try(Scanner input = new Scanner(System.in))
		{
			// hold the names in an ArrayList object.
			List<String> listOfNames = new ArrayList<String>();

			while(true)
			{
				// prompt the user to enter the option.
				System.out.print("Enter i (insert), s (stop): ");
				
				// the option.
				char ans = input.next().charAt(0);

				if(ans == 'i')      // read names.
				{
					System.out.print("Enter the name: ");
					listOfNames.add(input.next());
				}
				else if(ans == 's') // no more names.
				{
					break;
				}
				else                // invalid option supported.
				{
					System.out.println(ans + " Invalid option.");
					continue;
				}
				
				System.out.println();// a new line to separate the iterations.
			}

			System.out.println();

			// print the names just inserted.
			printCollection(listOfNames, "The list contains:");
			
			// the set allows no duplications.
			Set<String> setOfNames = new HashSet<String>(listOfNames);
			
			// print the processed list.			
			printCollection(setOfNames,  "After removing dups:");
			
			System.out.println();
			
			while(true)
			{
				// prompt the user to search for a name.
				System.out.print("Search for a name, y/n: ");
				char ans = input.next().charAt(0);
				
				if(ans == 'y')        // in case they want.
				{
					System.out.print("\nEnter the name: ");
					String name = input.next();
					System.out.println(name + " Is " + (isHere(setOfNames, name)? "here" : "not here"));
				}
				else if(ans != 'n') { // in case the input is wrong. 
					System.out.println(ans + " Invalid option.");
					continue;
				} else {              // in case they don't.
					break;
				}
				
				System.out.println(); // a new line to separate the iterations.
			}
		}
		catch(Exception ex)
		{
			System.out.println(ex.getStackTrace());
		}
	}
	
	// search for target in set.
	public static boolean isHere(Set<String> set, String target)
	{
		return set.contains(target);
	}
	
	// print the collection passed.
	public static void printCollection(Collection<String> collection, String msg)
	{
		System.out.println("===========================================================");
		System.out.println(msg + "\n" + collection);
		System.out.println("===========================================================");
	}
}
