/*
 * File name: Diamond.java
 *
 * Subject: Print a diamond of asterisks.
 *
 * Date: April 10, 2024
 *
 * Author: Alsayed_Ali_Aldkahkhni
 *
 * Last modification: August 17, 2024 at [10:40 AM]
 *
 * */


import java.util.Scanner; // import declaration, to read the user's data at the keyboard.
public class Diamond      // class declaration.
{
	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the # of lines to draw the diamond on: ");
		int linesNum = input.nextInt();
		
		if(linesNum >= 4)
		{
			int spaces = linesNum + 1; // space before the asterisks.
			int mid = linesNum / 2;    // the line that divide the diamond into 2 triangles.

			// draw the upper half of the diamond.
			for(int i = 0; i <= mid; i++)
			{
				// print the leading spaces.
				spaces--;
				for(int j = 0; j < spaces; j++)
					System.out.print(' ');

				// print the asterisks.
				for(int k = 0; k < 2*i + 1; k++) 
					System.out.print('*');

				System.out.println();
			}
			
			// the number of lines of the lower diamond.
			int copy = mid;

			// draw the lower half of the diamond.
			for(int l = 0; l < mid; l++)
			{
				for(int m = spaces; m >= 0; m--)
					System.out.print(' ');

				for(int n = 2*copy - 1; n > 0; n--)
					System.out.print('*');

				spaces++;
				copy--;
				System.out.println();
			}
		}
		else
			System.out.println( linesNum + " won't print a diamond.");
	}
}











