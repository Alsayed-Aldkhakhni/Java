/*
 * File name: Volume.java
 *
 * Subject: Calculate the volume of sphere.
 *
 * Date: August 19, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 19, 2024 at [04:00 PM]
 *
 * */

import java.util.Scanner; // import declaration, to read the user's data at the keyboard.
public class Volume       // class declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius: ");
		double radius = input.nextDouble();

		if(radius < 0)
			System.out.println("Invalid radius.");
		else
			System.out.printf("The volume is: %,.3f%n", sphereVolume(radius));
	}

	public static double sphereVolume(double radius)
	{
		return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3.0);
	}
}






