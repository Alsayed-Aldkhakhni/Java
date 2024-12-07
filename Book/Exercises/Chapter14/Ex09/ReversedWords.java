/*
 * File Name: ReversedWords.java
 *
 * Subject  : A program that converts the English sentences into Latin.
 *
 * Date     : October 31, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 31, 2024
 *
 * */

import java.util.Scanner; // import declaration.
public class ReversedWords// class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // read the user's input at the keyboard.
		System.out.print("Enter a sentence: "); // prompt the user to enter an input.
		String sentence = input.nextLine();     // read the input in sentence variable.

		String[] tokens = sentence.split(" ");  // split it into words.
		
		for(int i = tokens.length - 1; i >= 0; i--) // print them in a reversed order.
			System.out.print(tokens[i] + " ");
	}
}

