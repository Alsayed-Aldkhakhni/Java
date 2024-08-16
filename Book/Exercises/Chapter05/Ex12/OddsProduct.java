/*
 * File name: OddsProduct.java
 *
 * Subject: Find the product of odd numbers between [1, 15].
 *
 * Date: April 06, 2024
 * 
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [12:09 PM]
 *
 * */

public class OddsProduct // class declaration.
{
	public static void main(String[] args)
	{
		// hold the product of the numbers.
		int product = 1;

		// calculate the product.
		for(int i = 1; i <= 15; i += 2)
		       	product *= i;

		// print it to the user.
		System.out.printf("Product of the odd number between [1, 15] is: %,d%n", product);
	}
}






