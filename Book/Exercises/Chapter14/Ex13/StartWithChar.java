/*
 * File Name: StartWithChar.java 
 * 
 * Subject  : Print the words start with 'b' in a sentence.
 * 
 * Date     : November 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : November 1, 2024
 * 
 * */

import java.util.Scanner; // import declaration.
public class StartWithChar// class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);// read the user's input at the keyboard.
		
		System.out.print("Enter a sentence: ");// prompt the user to enter a sentence.
		String sentence = input.nextLine();    // read the data.
		String[] tokens = sentence.split(" "); // broke it into words.
		
		for(String token : tokens)             // print the words start with "b" letter.
			if(token.startsWith("b"))
				System.out.print(token + "  ");
	}
}
