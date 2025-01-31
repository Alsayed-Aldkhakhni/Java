/*
 * File name: DistanceBetweenPoints.java
 *
 * Subject: Calculate the distance between two points.
 * 
 * Date: August 26, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 26, 2024 at [10:45 AM]
 *
 * */

import java.util.Scanner;          // import declaration, to read the user's data.
public class DistanceBetweenPoints // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		char ans = 'y';
	
		while(ans == 'y')
		{
			// read 1st point.
			System.out.print("Enter point1's coordinates[x y]: ");
			double x1 = input.nextDouble();
			double y1 = input.nextDouble();

			// read 2nd point
			System.out.print("Enter point2's coordinates[x y]: ");
			double x2 = input.nextDouble();
			double y2 = input.nextDouble();

			// invoke distance method and display the result.
			System.out.printf("%nDistance between%nP1(%.2f, %.2f), P2(%.2f, %.2f) = %.2f%n%n",
				                              x1, y1, x2, y2, distance(x1, y1, x2, y2));

			// do another.
			System.out.print("One more?(y, n): ");
			ans = input.next().charAt(0);
		}
	}

	// method that calculates the distance.
	public static double distance(double x1, double y1, double x2, double y2)
	{
		return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
	}
}





