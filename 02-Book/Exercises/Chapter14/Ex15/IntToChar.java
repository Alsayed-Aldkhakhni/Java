/*
 * File Name: IntToChar.java 
 * 
 * Subject  : Print the corresponding character to values 000 -> 255
 * 
 * Date     : November 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : November 1, 2024
 * 
 * */

public class IntToChar // class declaration.
{
	public static void main(String[] args)
	{
		System.out.print("int value   | character in ASCII\n"); // the header.
		for(int i = 0; i <= 255; i++)
			System.out.printf("%-12d| \'%c\' %n", i, (char)i);  // the content.
	}
}


