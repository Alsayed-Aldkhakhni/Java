/*
 * File Name: ComparePortion.java
 *
 * Subject  : Program to compare a region of two strings.
 *
 * Date     : October 29, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 29, 2024
 *
 * */

import java.util.Scanner;  // import declaration.
public class ComparePortion// class decalration.
{
	public static void main(String[] args)
	{
		try
		{
			// to read the user's input at the keyboard.
			Scanner input = new Scanner(System.in); 		
			
			// read the 1st string.
			System.out.print("Enter 1st string: ");
			String str1 = input.nextLine();

			// read the 2nd one.
			System.out.print("Enter 2nd string: ");
			String str2 = input.nextLine();

			// the index from which we gonna start comparing in the 1st string.
			System.out.print("Enter the index we will start comparing from in string 1: ");
			int startingIndex1 = input.nextInt();
		
			// the index from which we gonna start comparing in the 2nd string.
			System.out.print("Enter the index we will start comparing from in string 2: ");
			int startingIndex2 = input.nextInt();
		
			// how many characters to compare?
			System.out.print("Enter # of chars in the 2nd string to be compared: ");
			int numberOfChars = input.nextInt();

			// simple validation.
			if(startingIndex1 < 0 || startingIndex2 < 0 || numberOfChars < 0)
				throw new IllegalArgumentException("Invalid indexes or number of characters.");

			// check the matching portion.	
			boolean isMatching = str1.regionMatches(true, startingIndex1, str2, startingIndex2, numberOfChars);

			// print the result.
			System.out.println("Region" + (isMatching == true ? " matches" : " doesn't match"));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage()); // print the error message.
		}
	}
}



