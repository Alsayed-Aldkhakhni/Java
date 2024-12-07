/*
 * File Name: SearchInString.java 
 * 
 * Subject  : Search for a character in a string.
 * 
 * Date     : November 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : November 1, 2024
 * 
 * */

import java.util.Scanner;  // import declaration.
public class SearchInString// class  declaration.
{
	public static void main(String[] args)
	{
		// read the user's input at the keyboard.
		Scanner input = new Scanner(System.in);
		
		// read the sentence.
		System.out.print("Enter a sentence : ");
		String sentence = input.nextLine();
		
		// read the char to search for.
		System.out.print("Enter target char: ");
		char cTarget = input.next().charAt(0);
		
	   // the 1st occurrence of cTarget.
		int next = sentence.indexOf(cTarget); 
		
        // how many times we have cTarget in sentence.
		int occurrences = 0;
		
		// iterate through the sentence searching for cTarget.
		while(next != -1)
		{
			occurrences++;
			next = sentence.indexOf(cTarget, next+1);
		}
		
		// print the final result.
		System.out.printf("\"" + cTarget +"\" exists \"%d\" time(s) in \"%s\"", occurrences, sentence);
	}
}


