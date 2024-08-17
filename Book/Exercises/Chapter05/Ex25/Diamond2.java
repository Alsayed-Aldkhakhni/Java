/*
 * File name: Diamond2.java
 *
 * Subject: Print a diamond of asterisks on odd lines within [1, 19].
 *
 * Date: April 10, 2024
 *
 * Author: Alsayed_Ali_Aldkahkhni
 *
 * Last modification: August 17, 2024 at [11:00 AM]
 *
 * */

import java.util.Scanner; // import declaration, to read data at the keyboard.
public class Diamond2     // class  declaration.
{
	public static void main(String[] args)
	{
		// instantiate an object of type 'Scanner' to read the user's data at the keybaord.
	 	Scanner input = new Scanner(System.in);
		
		// prompt the user to enter an odd number in the provided range.
		System.out.print("Enter an odd number within range [1, 19]: ");
		
		// read the user's input.
		int linesNum = input.nextInt();

		// validate the input.
		if((linesNum >= 1 && linesNum <= 19) && (linesNum % 2 == 1))
		{
			int spaces = linesNum + 1;
			int mid = linesNum / 2;

			System.out.println();

			// print the upper half of the diamond.
			for(int i = 0; i <= mid; i++)
			{
				spaces--;
				for(int j = 0; j < spaces; j++) 
					System.out.print(' ');

				for(int k = 0; k < 2*i + 1; k++) 
					System.out.print('*');

				System.out.println();
			}

			int copy = mid;
			
			// print the lower half of the diamond.
			for(int l = 0; l < mid; l++)
			{
				for(int m = spaces; m >= 0; m--)
					System.out.print(' ');

				for(int n = 2*copy - 1; n > 0; n--)
					System.out.print('*');
				
				System.out.println();
				spaces++;
				copy--;
			}

		}
		else // if the user's input is not valid.
			System.out.printf("%d, is invalid input.!!%n", linesNum);
	}
}












