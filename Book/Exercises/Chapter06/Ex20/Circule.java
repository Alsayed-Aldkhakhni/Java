/*
 * File name: Circule.java
 *
 * Subject: Print the circule's area. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [07:40 AM]
 *
 * */

import java.util.Scanner;// import declaration.
class Circule            // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the circule's radius: ");
		double r = input.nextDouble();
		
		System.out.printf("The area: %,.3f%n", calcArea(r));
	}


	public static double calcArea(double radius) { return Math.PI * radius * radius; }
}


