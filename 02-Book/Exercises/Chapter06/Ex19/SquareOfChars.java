/*
 * File name: SquareOfChars.java
 *
 * Subject: Print a square of a given character. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [07:25 AM]
 *
 * */

import java.util.Scanner;// import declaration.
class SquareOfChars      // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter the side length: ");
			int x = input.nextInt();

			System.out.print("Enter the filling char: ");
			char fill = input.next().charAt(0);

			drawSquare(x, fill);
		}
	}


	public static void drawSquare(int x, char fill)
	{
		System.out.println();

		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < x; j++)
				System.out.print(fill + " ");

			System.out.println();
		}
		
		System.out.println();
	}
}


