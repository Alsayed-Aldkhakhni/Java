/*
 * File name: OddOrEven.java
 *
 * Subject: Check if a number is odd. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [07:11 AM]
 *
 * */

import java.util.Scanner;// import declaration.
class OddOrEven          // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter a number: ");
			int x = input.nextInt();

			System.out.printf("Is %d odd: %b%n%n", x, isOdd(x));
		}
	}

	public static boolean isOdd(int x) { return x % 2 == 0 ? false : true; }
}


