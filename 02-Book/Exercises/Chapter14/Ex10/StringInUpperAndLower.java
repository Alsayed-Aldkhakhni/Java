/*
 * File Name: StringInUpperAndLower.java
 *
 * Subject  : A program that prints a string in lower and upper cases.
 *
 * Date     : October 31, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 31, 2024
 *
 * */

import java.util.Scanner;         // import declaration.
public class StringInUpperAndLower// class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // read the user's input at the keyboard.
		
		System.out.print("Enter a sentence: "); // prompt the user to input a sentence.
		String sentence = input.nextLine();
		
		// print it, sentence, in both forms.
		System.out.println("In lower case: " + sentence.toLowerCase());
		System.out.println("In upper case: " + sentence.toUpperCase());
	}
}

