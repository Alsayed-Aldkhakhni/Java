/*
 * File name: Pyramids.java
 *
 * Subject: Print triangles using nested loops.
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [12:39 PM]
 *
 * */


public class Pyramids // class declaration.
{
	public static void main(String[] args)
	{
		// the triangles.
		int pyr1 = 1, pyr2 = 10,
		    pyr3 = 10, pyr4 = 1;

		// spaces amoung the triangles.
		int space1 = 15, space2 = 5,
		    space3 = 15;

		// lines.
		for(int i = 0; i < 10; i++)
		{
			// 1st pyramid.
			for(int j = 0; j < pyr1; j++)
				System.out.print('*');

			// 1st space.
			for(int k = 0; k < space1; k++)
				System.out.print(' ');

			// 2nd pyramid.
			for(int j = 0; j < pyr2; j++)
				System.out.print('*');

			// 2nd space.
			for(int k = 0; k < 2*space2-1; k++)
				System.out.print(' ');

			// 3rd pyramid.
			for(int j = 0; j < pyr3; j++)
				System.out.print('*');

			// 3rd space.
			for(int k = 0; k < space3; k++)
				System.out.print(' ');

			// 4th pyramid.
			for(int j = 0; j < pyr4; j++)
				System.out.print('*');

			// change the spaces & number of asterisks.
			space1--; space2++; space3--;
			pyr1++;	pyr2--;	pyr3--; pyr4++;
			
			System.out.println();
		}
	}
}







