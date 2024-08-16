/*
 * File name: Factorial.java
 *
 * Subject: Calcuate the factorial of numbers [1, 20].
 *
 * Date: April 06, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [12:15 PM]
 *
 * */

public class Factorial // class declaration.
{
	public static void main(String[] args)
	{
		long fact = 1;
		
		// print table's headers.
		System.out.printf("%-10s%-20s%n", "Number", "Factorial");

		// calcuates the factorial of each number.
		for(int i = 1; i <= 20; i++)
		{
			// the factorial of each individual.
			for(int j = 1; j <= i; j++)
				fact *= j;

			// print the number and its factorial.
			System.out.printf("%-10d%,-25d%n", i, fact);
			
			// reset the factorial.
			fact = 1;
		}
	}
}




