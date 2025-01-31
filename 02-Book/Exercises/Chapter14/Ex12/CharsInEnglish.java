/*
 * File Name: CharsInEnglish.java 
 * 
 * Subject  : Count the occurrences of letters in a string.
 * 
 * Date     : November 3, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : November 3, 2024
 * 
 * */

import java.util.Scanner;   // import declaration.
public class CharsInEnglish // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // read the user's data at the keyboard.
		int[] EnglishChars = new int[26];       // an array to fits the characters.
		
		System.out.print("Enter a sentence: "); // prompt the user to enter a sentence.
		
		// read it and store in 'sentence' variable.
		String sentence = input.nextLine().toLowerCase();

		// examine the letters.
		for(int i = 0; i < sentence.length(); i++)
		{
			if(sentence.charAt(i) >= 97 && sentence.charAt(i) <= 122)
				EnglishChars[sentence.charAt(i) - 97]++;
		}
		
		System.out.println("\nLetter | occurrences: ");
		System.out.println("---------------------");
		
		for(int i = 0; i < 26; i++) // print the content in a table.
			System.out.println("[" + (char)(i+65)+ "|" + (char)(i+97) + "]  | " + EnglishChars[i]);
	}
}
