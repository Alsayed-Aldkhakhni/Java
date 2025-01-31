/*
 * File Name: CompareStrings.java
 *
 * Subject  : Program to compare two strings together.
 *
 * Date     : October 29, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 29, 2024
 *
 * */

import java.util.Scanner;  // import declaration.
public class CompareStrings// class decalration.
{
	public static void main(String[] args)
	{
		// to read the user's input at the keyboard.
		Scanner input = new Scanner(System.in); 		
		
		// read the 1st string.
		System.out.print("Enter 1st string: ");
		String str1 = input.nextLine();

		// read the 2nd one.
		System.out.print("Enter 2nd string: ");
		String str2 = input.nextLine();

		// comparing those 2 strings.
		if(str1.compareTo(str2) < 0)
			System.out.printf("\"%s\" comes before \"%s\" alphapetically %n", str1, str2);
		else if(str1.compareTo(str2) > 0)
			System.out.printf("\"%s\" comes after \"%s\" alphapetically %n", str1, str2);
		else
			System.out.printf("\"%s\" and \"%s\" are identical%n", str1, str2);

	}
}



