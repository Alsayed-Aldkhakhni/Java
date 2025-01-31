/*
 * File name: Carpooling.java
 *
 * Subject: Calculate the daily driving cost.
 *
 * Date: August 7, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 7, 2024 --> [5:20 PM]
 *
 * */

import java.util.Scanner; // import declaration.
public class Carpooling   // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// read the required data.
		System.out.print("Enter the total miles you drove:    ");
		double tMiles = input.nextDouble();

		System.out.print("Enter the average miles per gallon: ");
		double avgPrGallon = input.nextDouble();

		System.out.print("Enter cost per gallon: ");
		double costPrGallon = input.nextDouble();

		System.out.print("Enter parking fees:    ");
		double parkingFees = input.nextDouble();

		System.out.print("Enter the total tolls per day: ");
		double tollsPrDay = input.nextDouble();

		System.out.print("Enter the number of people:    ");
		int carpoolers = input.nextInt();

		// calculate the total cost.
		double totalCost = (tMiles / avgPrGallon * costPrGallon) + parkingFees + tollsPrDay;
		System.out.printf("The total cost:     $%,.2f%nPrice for each one: $%,.2f%n", totalCost, totalCost/carpoolers);
	}
}



