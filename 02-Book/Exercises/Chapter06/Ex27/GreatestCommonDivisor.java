/*
 * File name: GreatestCommonDivisor.java
 *
 * Subject: Find the GCD of two numbers.
 * 
 * Date: August 25, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 25, 2024 at [06:50 AM]
 *
 * */

import java.util.Scanner;          // import declaration, to read the user's data.
public class GreatestCommonDivisor // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 numbers: ");
		int x = input.nextInt();
		int y = input.nextInt();
		System.out.printf("The GCD of those: %d%n%n", getGCD(x, y));
	}

	public static int getGCD(int x, int y)
	{
		// sample: x = 36, y = 24.
		if(x < y) { int t = x; x = y; y = t; }

		int temp = 0;

		while(y != 0)
		{
			temp = y; // 24, 12
			y = x % y;// 12, 0
			x = temp; // 24, 12
		}

		return temp;
	}
}




