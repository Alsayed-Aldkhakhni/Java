/*
 * File name: RoundToNearst.java
 *
 * Subject: Round the numbers to the nearst integers.
 *
 * Date: August 22, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 22, 2024 at [07:38 AM]
 *
 * */

import java.util.Scanner; // import declaration.
public class RoundToNearst// class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double originalNum = 0; 
		
		while(originalNum != -1)
		{
			System.out.print("Enter a number[-1 to stop]: ");
			originalNum = input.nextDouble();

			if(originalNum == -1)
			       	continue;

			int rounded = (int)(Math.floor(originalNum + 0.5));
			System.out.printf("%n%-15s%s%n", "Oringinal", "Rounded");
			System.out.printf("%-15.2f%d%n%n", originalNum, rounded);
		}
	}
}


