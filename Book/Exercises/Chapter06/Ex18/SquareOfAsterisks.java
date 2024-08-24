/*
 * File name: SquareOfAsterisks.java
 *
 * Subject: Print a solid square of asterisks.
 *
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [06:15 AM]
 *
 * */

import java.util.Scanner; // import declaration.
public class Multiples    // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter the side length: ");
			int x = input.nextInt();

			squareOfAsterisks(x);
		}
	}


	public static void squareOfAsterisks(int x)
	{
		System.out.println();

		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < x; j++)
				System.out.print("* ");

			System.out.println();
		}
		
		System.out.println("\n");
	}
}


