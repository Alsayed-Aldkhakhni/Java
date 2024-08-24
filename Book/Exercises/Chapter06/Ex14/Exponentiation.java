/*
 * File name: Exponentiation.java
 *
 * Subject: Implement Math.pow method.
 *
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [06:40 AM]
 *
 * */

import java.util.Scanner;// import declaration.
class Exponentiation     // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// read the user's input.
		System.out.print("Enter two numbers seperated by a space: ");
		int x = input.nextInt();
		int y = input.nextInt();

		// the result on the screen.
		System.out.printf("%d^%d = %d%n", x, y, power(x, y));
	}

	// our homemade method.
	public static int power(int base, int expon)
	{
		int x = base;

		for(int i = 0; i < expon - 1; i++)
			base *= x;

		return base;
	}
}



