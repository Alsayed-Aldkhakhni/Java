/*
 * File name: Perfects.java
 *
 * Subject: Determine whether a number is perfect.
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [08:15 PM]
 *
 * */

import java.util.Scanner;// import declaration.
public class Perfects    // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of iterations: ");
		int xNums = input.nextInt();	

		System.out.printf("%-10s%-11s%s", "Number", "Perfect", "Factors");
		System.out.println("\n===================================");

		for(int i = 1; i <= xNums; i++)
		{	
			System.out.printf("%-10d%-10s", i, (isPerfect(i) == true ? "X" : " "));
			System.out.print(" Factors: ");
			printFactors(i);
			
			System.out.println();
		}
	}


	public static boolean isPerfect(int x)
	{
		int sum = 0;

		for(int i = 1; i <= x/2; i++)
		{
			if(x % i == 0)
				sum += i;
		}

		return	sum == x ? true : false;
	}

	public static void printFactors(int x)
	{
		for(int i = 1; i <= x/2; i++)
		{
			if(x % i == 0)
				System.out.print(i + "  ");
		}
	}
}





