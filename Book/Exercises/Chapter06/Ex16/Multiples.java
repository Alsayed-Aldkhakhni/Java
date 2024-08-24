/*
 * File name: Multiples.java
 *
 * Subject: Determine whether two numbers are multiples.
 *
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [06:50 AM]
 *
 * */

import java.util.Scanner; // import declaration.
public class Multiples    // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 10; i++)
		{
			System.out.print("Enter a pair of numbers: ");
			int x = input.nextInt();
			int y = input.nextInt();

			System.out.printf("Is %d a multiple of %d: %b%n%n", y, x, isMultiple(x, y));
		}
	}


	public static boolean isMultiple(int x, int y) { return y % x == 0 ? true : false; }
}
