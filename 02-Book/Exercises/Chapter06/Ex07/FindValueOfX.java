/*
 * File name: FindValueOfX.java
 *
 * Subject: Evaluate values returned by class Math functions.
 *
 * Date: August 22, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 22, 2024 at [06:35 AM]
 *
 * */


public class FindValueOfX
{
	public static void main(String[] args)
	{
		double x1 = Math.abs(7.5);  // 7.5
		double x2 = Math.floor(7.5);// 7.0
		double x3 = Math.abs(0.0);  // 0.0
		double x4 = Math.ceil(0.0); // 0.0
		double x5 = Math.abs(-6.4); // 6.4
		double x6 = Math.ceil(-6.4);// -6.0
		double x7 = Math.ceil(-Math.abs(-8 + Math.floor(-5.5))); // -14

		System.out.printf("Math.abs(7.5)   = %.2f%n", x1);
		System.out.printf("Math.floor(7.5) = %.2f%n", x2);
		System.out.printf("Math.abs(0.0)   = %.2f%n", x3);
		System.out.printf("Math.ceil(0.0)  = %.2f%n", x4);
		System.out.printf("Math.abs(-6.4)  = %.2f%n", x5);
		System.out.printf("Math.ceil(-6.4) = %.2f%n", x6);
		System.out.printf("Math.ceil(-Math.abs(-8 + Math.floor(-5.5))) = %.2f%n", x7);
	}
}

