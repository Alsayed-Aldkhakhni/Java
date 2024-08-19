/*
 * File name: Methods.java
 *
 * Subject: Test the Math class methods.
 *
 * Date: August 19, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 19, 2024 at [04:00 PM]
 *
 * */




public class Methods // class declaration.
{
	public static void main(String[] args)
	{
		double x = 4.1234;
		double y = 5.5678;

		System.out.println("=====================================");
		System.out.printf("The variables' values: %nx = %.2f%ny = %.2f%n", x, y);
		System.out.println("=====================================");

		System.out.println();
		
		System.out.println("abs method.");
		System.out.printf("abs(%.2f) = %.2f%n",  x, Math.abs(x));
		System.out.printf("abs(%.2f) = %.2f%n", -y, Math.abs(-y));
		
		System.out.println();

		System.out.println("ceil method.");
		System.out.printf("ceil(%.2f) = %.2f%n", x, Math.ceil(x));
		System.out.printf("ceil(%.2f) = %.2f%n", y, Math.ceil(y));
		
		System.out.println();
		
		System.out.println("floor method.");
		System.out.printf("floor(%.2f) = %.2f%n", x, Math.floor(x));
		System.out.printf("floor(%.2f) = %.2f%n", y, Math.floor(y));
		
		System.out.println();

		System.out.println("min method.");
		System.out.printf("min(%.2f, %.2f) = %.2f%n", x, y, Math.min(x, y));
		
		System.out.println();

		System.out.println("max method.");
		System.out.printf("max(%.2f, %.2f) = %.2f%n", x, y, Math.max(x, y));

		System.out.println();

		System.out.println("sqrt method.");
		System.out.printf("sqrt(%.2f) = %.2f%n", y, Math.sqrt(y));

		System.out.println();

		System.out.println("powr method.");
		System.out.printf("powr(%.2f, %.2f) = %,.2f%n", x, y, Math.pow(x, y));
	
		System.out.println();

		System.out.println("exp method.");
		System.out.printf("exp(%.2f) = %,.2f%n", x, Math.exp(x));
		
		System.out.println();

		System.out.println("log method.");
		System.out.printf("log(%.2f) = %.2f%n", y, Math.log(y));
	}
}










