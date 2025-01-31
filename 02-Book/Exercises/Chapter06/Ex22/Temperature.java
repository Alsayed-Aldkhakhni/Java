/*
 * File name: Temperature.java
 *
 * Subject: Convert Temperature from/ to fahrenheit.
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [03:05 PM]
 *
 * */

import java.util.Scanner; // import declaration.
public class Temperature  // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter the temprature: ");
			double temp = input.nextDouble();

			if(temp >= 0)
			{
				System.out.print("Convert to fahrenheit or celsius?(f, c): ");
				char ans = input.next().charAt(0);

				switch(ans)
				{
					case 'f': /* ignore sensitivity.*/
					case 'F':
					System.out.printf("%.2f To fahrenheit is: %.2f", temp, toFahrenheit(temp));
					break;

					case 'c':
					case 'C':
					System.out.printf("%.2f To celsius is: %.2f", temp, toCelsius(temp));
					break;

					default:
					System.out.print("Invalid option, try again.");
				}
				
				System.out.println("\n");
			}
			else
				System.out.println("Invalid temprature.");
		}
	}

	// used methods.
	public static double toCelsius(double fahrenheit) { return 5.0 / 9.0 * (fahrenheit - 32); }
	public static double toFahrenheit(double celsius) { return  9.0 / 5.0 * celsius + 32; }
}




