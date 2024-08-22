/*
 * File name: RoundNumbers.java
 *
 * Subject: Round floating-point numbers to 10ths and 100ths.
 *
 * Date: August 22, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 22, 2024 at [06:58 AM]
 *
 * */


import java.util.Scanner; // import declaration.
public class RoundNumbers // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double number = 0;

		while(number != -1)
		{
			System.out.print("Enter a number[-1 to stop]: ");
			number = input.nextDouble();

			if(number == -1)
				continue;

			System.out.printf("%n%-10s%-20s%-20s%-25s%-20s%n", "number", "Nearst integer", "Rounded to tenths",
				          "Rounded to hundredths", "Rounded to thousandths");
			
			System.out.printf("%-10.2f%-20d%-20d%-25d%-20s%n%n", number, roundToInteger(number), roundToTenths(number),
					   roundToHundredths(number), roundToThousandths(number));
		}
	}

	 public static int roundToInteger(double number)
	 {
		return (int)(Math.floor(number + 0.5));
	 }

	 public static int roundToTenths(double number)
	 {
		return (int)(Math.floor(number * 10 + 0.5) / 10);
	 }

	 public static int roundToHundredths(double number)
	 {
		return (int)(Math.floor(number * 100 + 0.5) / 100);
	 }

	 public static int roundToThousandths(double number)
	 {
		return (int)(Math.floor(number * 10 + 0.5) / 1000);
	 }

}

