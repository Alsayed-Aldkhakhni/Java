/*
 * File name: RightTriangle.java
 *
 * Subject: Calculate the hypotenuse of a right triangle.
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [09:25 PM]
 *
 * */


import java.util.Scanner;  // import declaration.
public class RightTriangle // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter the adjacent and opposite: ");
			double oppos = input.nextDouble();
			double adjas = input.nextDouble();

			// a simple validation.
			if(oppos <= 0 || adjas <= 0)
			{
				System.out.println("Invalid value entered.\n");
				continue;
			}
			else
				System.out.printf("The hypotenuse is: %.2f%n%n", getHypotenuse(oppos, adjas));
		}
	}

	// a^2 + b^2 = c^2.
	public static double getHypotenuse(double opposite, double adjacent)
	{
		return Math.sqrt(Math.pow(opposite, 2) + Math.pow(adjacent, 2));
	}
}





