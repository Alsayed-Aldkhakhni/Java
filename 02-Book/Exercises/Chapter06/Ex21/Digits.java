/*
 * File name: Digits.java
 *
 * Subject: Print the digits of a number. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [02:45 PM]
 *
 * */

import java.util.Scanner;// import declaration.
class Digits             // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter a number in [1, 99999]: ");
			int num = input.nextInt();

			if(num >= 1 && num <= 99999)
				getDigits(num);
			else
				System.out.println("Follow the instructions.\n");
		}	
	}

	public static int getIntegeral(int x, int y) { return x / y; }
	public static int getRemainder(int x, int y) { return x - y * (x / y); }

	public static void getDigits(int x)
	{
		int pos = 1;
		int copy = x;

		// calcualte the position.
		while(copy > 9)
		{
			copy = getIntegeral(copy, 10);
			pos *= 10;
		}

		int dummy;

		// seperate the digits.
		while(x > 0)
		{
			dummy = (x - getRemainder(x, pos) ) / pos;
			x = x - dummy * pos;
			System.out.print(dummy + "  ");
			pos = getIntegeral(pos, 10);
		}

		System.out.println();
	}
}




