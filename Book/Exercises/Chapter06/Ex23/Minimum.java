/*
 * File name: Minimum.java
 *
 * Subject: Find the minimum number of 3. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [02:50 PM]
 *
 * */

import java.util.Scanner;// import declaration.
public class Minimum     // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter 3 numbers seperated by spaces: ");
			int x = input.nextInt();
			int y = input.nextInt();
			int z = input.nextInt();

			System.out.printf("The smallest is: %d%n%n", minimum3(x, y, z));
		}
	}

	public static int minimum3(int x, int y, int z) { return Math.min(x, Math.min(y, z)); }
}


