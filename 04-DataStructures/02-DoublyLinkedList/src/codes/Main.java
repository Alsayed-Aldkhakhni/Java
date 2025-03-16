/*
 * File name: Main.java
 * 
 * Subject  : Test our homemade LinkedList class.
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
		try (Scanner input = new Scanner(System.in)) // try-with-resources to avoid memory leaks.
		{
			// list of persons.
			DoublyLinkedList<Person> persons = new DoublyLinkedList<Person>("List of persons");
			
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
				persons.insertAtEnd(new Person(SSN, firstName, lastName, age));

				// ask the user for more data to insert.
				System.out.print("\nOne more[y, n]: ");
				ans = input.next().charAt(0);
				System.out.println();

			} while(ans == 'y');

			persons.printInOrder();     // print the nodes as they are inserted.
			persons.printReverseOrder();// print from back to front.
			
			// remove the list's content.
			while(true)
				System.out.println(persons.removeHead());
		}
		catch(EmptyListException | IllegalArgumentException ex)
		{
			ex.printStackTrace();
		}
	}
}
