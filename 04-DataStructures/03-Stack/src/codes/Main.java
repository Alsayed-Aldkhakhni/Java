/*
 * File name: Main.java
 * 
 * Subject  : Test our homemade Stack class. 
 *  
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */


package codes;
import java.util.Scanner;

public class Main // class declaration.
{
	public static void main(String[] args)
	{
		// try-with-resources to avoid memory leaks.
		try (Scanner input = new Scanner(System.in))
		{
			// stack of persons.
			Stack<Person> persons = new Stack<Person>("Stack of persons");
			
			char ans = 'y';

			do {
				// read the SSN.
				System.out.print("Enter SSN [5 digits]: ");
				String SSN = input.next();

				// read the 1st name.
				System.out.print("Enter first name: ");
				String firstName = input.next();

				// read the 2nd name.
				System.out.print("Enter last name : ");
				String lastName  = input.next();

				// read the age.
				System.out.print("Enter the age   : ");
				int age = input.nextInt();

				// add new node to the list.
				persons.push(new Person(SSN, firstName, lastName, age));

				// ask the user for more data to insert.
				System.out.print("\nOne more[y, n]: ");
				ans = input.next().charAt(0);
				System.out.println();

			} while(ans == 'y');

			// print the nodes on the stack.
			while(true)
				System.out.println(persons.pop());
		}
		catch(EmptyListException | IllegalArgumentException ex)
		{
			ex.printStackTrace();
		}
	}
}

