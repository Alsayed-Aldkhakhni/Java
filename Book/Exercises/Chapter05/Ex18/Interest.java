/*
 * File name: Interest.java
 *
 * Subject: Modified Compound-Interest Program to use integeral variables instead of doubles.
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [02:50 PM]
 *
 * */


public class Interest // class declaration.
{
	public static void main(String[] args)
	{
		int amount; 
		int principal = 1000;
		int fractionalPart = 0;

		// table's header.
		System.out.printf("%s%20s %n", "Year", "Amount on deposit");
	
		for (int year = 1; year <= 10; ++year)
		{
			amount = (int)(principal * Math.pow(1.0 + (double)5/100, year) * 100);

			// divide the pennies into -------_----------_
			// 				  |          |
			// 				  v          |
			fractionalPart = amount % 100; // dollars.   V
			amount = (amount - fractionalPart) / 100; // cents.

			System.out.printf("%-7d$%,d%s%d%n", year, amount, ".", fractionalPart);
		}

	}
}












