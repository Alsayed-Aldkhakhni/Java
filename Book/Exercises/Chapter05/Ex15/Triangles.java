/*
 * File name: Triangle.java
 *
 * Subject: Print a triangels of asterisk.
 * 
 * Date: April 06, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [12:30 PM]
 *
 *  */


public class Triangles // class declaration.
{
	public static void main(String[] args)
	{
		System.out.println("a)");

		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j <= i; j++)
				System.out.print('*');

			System.out.println();
		}

		
		System.out.print("#####################################\n");
		System.out.println("b)");

		for(int i = 10; i > 0; i--)
		{
			for(int j = i; j > 0; j--)
				System.out.print('*');

			System.out.println();
		}

		System.out.print("#####################################\n");
		System.out.println("c)");
	       	int spaces = 0;
        
		for(int i = 10; i > 0; i--)
		{
			for(int k = spaces; k > 0; k--)
			       	System.out.print(' ');

			for(int j = i; j > 0; j--)
				System.out.print('*');

			System.out.println();
			spaces++;
		}
	
		System.out.print("#####################################\n");
		System.out.println("d)");

		for(int i = 0; i < 10; i++)
		{
			for(int k = 10-i; k > 0; k--)
			       	System.out.print(' ');

			for(int j = 0; j <= i; j++)
				System.out.print('*');

			System.out.println();
		}
		
		System.out.print("#####################################\n");
	}
}








