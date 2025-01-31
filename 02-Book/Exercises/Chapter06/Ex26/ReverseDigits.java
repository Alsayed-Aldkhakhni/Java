/*
 * File name: ReverseDigits.java
 *
 * Subject: Reverse the digits of a number. 
 * 
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [07:20 PM]
 *
 * */

import java.util.Scanner;// import declaration.
class ReverseDigits      // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < 5; i++)
		{
			System.out.print("Enter a number in [1, 99999]: ");
			int num = input.nextInt();

			if(num >= 1 && num <= 99999)
				System.out.print("Reversed version: " + reverseNum(num));
			else
				System.out.println("Follow the instructions.");

			System.out.println("\n");
		}	
	}

	public static int reverseNum(int x)
	{
		int pos = 1;
		int copy = x;

		// calcualte the position.
		while(copy > 9)
		{
			copy = copy / 10;
			pos *= 10;
		}

		int dummy = 0;

		// seperate the digits.
		while(x > 0)
		{
			dummy += x % 10 * pos;
			pos /= 10;
			x /= 10;
		}

		return dummy;
	}
}



