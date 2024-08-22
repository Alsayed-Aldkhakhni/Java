/*
 * File name: ParkingCharges.java
 *
 * Subject: Calcuate the charges of a parking garage.
 *
 * Date: August 22, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 22, 2024 at [06:58 AM]
 *
 * */


import java.util.Scanner;   // import declaration.
public class PrakingCharges // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double hours = 1.0;
		double totalCharges = 0.0;

		while(hours > 0)
		{
			System.out.print("Enter the parking hours: ");
			hours = input.nextDouble();

			if(hours <= 0)
				continue;
			else
			{
				double dummy = calcualteCharges(hours);
				System.out.printf("The charges for parking: $%,.2f%n%n", dummy);
				totalCharges += dummy;
			}
		}

		System.out.printf("The total charges for yesterday: $%,.2f%n%n", totalCharges);

	}


	public static double calcualteCharges(double hours)
	{

		if(hours > 0 && hours <= 3)
			return 2.0;
		else if(hours > 19 && hours <= 24)
			return 10.0;
		else
			return 2.0 + (hours - 3) * 0.50;
	}

}


