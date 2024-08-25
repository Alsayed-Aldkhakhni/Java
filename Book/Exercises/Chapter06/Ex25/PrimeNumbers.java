/*
 * File name: PrimeNumbers.java
 *
 * Subject: Determine whether a number is prime. 
 * 
 * Date: August 25, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 25, 2024 at [06:20 AM]
 *
 * */

import java.util.Scanner;// import declaration, to read the user's data.
class PrimeNumbers       // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of iterations: ");
		int xNum = input.nextInt();

		if(xNum > 0)
		{
			// print the header.
			System.out.printf("%-10s%s%n", "Number", "IsPrime");
			System.out.println("==================");

			// the content.
			// 10,000 i couldn't scroll the screen :).
			for(int i = 0; i < xNum; i++)
				System.out.printf("%-10d%s%n", i, (isPrime(i) == true ? "X" : " "));
		}
		else
			System.out.println("Invalid interval.");
	}

	// the mthod that checks if it is prime.
	public static boolean isPrime(int x)
	{
		if(x <= 1)
			return false;
	
		for(int i = 2; i <= x/2; i++)
			if(x % i == 0)
				return false;

		return true;
	}
}




