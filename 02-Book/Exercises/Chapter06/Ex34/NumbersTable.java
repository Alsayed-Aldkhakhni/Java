/*
 * File name: NumbersTable.java
 *
 * Subject: Print a table of exchanged numbers in 3 systems.
 * 
 * Date: August 26, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 26, 2024 at [11:45 AM]
 *
 * */

import java.util.Scanner; // import declaration, to read the user's data.
public class NumbersTable // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		// how many numbers to convert.
		System.out.print("Up to x, Enter x: ");
		int x = input.nextInt();

		// print the headers.
		System.out.printf("%-10s%-15s%-15s%s%n", "Number", "Binary", "Octal", "Hexa");
		System.out.println("=============================================");

		// invoke the methods.
		for(int i = 0; i <= x; i++)
			System.out.printf("%-10d%-15d%-15d%s%n", i, toBinary(i), toOctal(i), toHexa(i));

	
	}

	// from decimal to binary.
	public static int toBinary(int x)
	{
		if(x == 0)
		       	return 0;

		int exp = 0;
		int rem = 0;
		int binary = 0;

		while(x > 0)
		{
			rem = x%2;
			binary += rem * Math.pow(10, exp);
			x /= 2;
			exp++;
		}

		return binary;
	}

	// from decimal to octal.
	public static int toOctal(int x)
	{
		if(x == 0)
			return 0;

		int exp = 0;
		int rslt = 0;

		while(x != 0)
		{
			rslt += x % 8 * Math.pow(10, exp);
			exp++;
			x /= 8;
		}

		return rslt;
	}

	// from decimal to hexa.
	public static String toHexa(int x)
	{
		if(x == 0)
			return "0";
		else
		{
			int rslt = 0;
			int exp  = 0;
			String str = "";

			while(x != 0)
			{
				rslt = x % 16;
				
				if(rslt > 9)
					str += ((char)(rslt+55));
				else
				{
					str += Integer.toString(rslt);
				}

				x /= 16;
			}

			String rstr = "";

			// reverse the order.
			for(int i = str.length() - 1; i >= 0; i--)
				rstr += str.charAt(i);

			return rstr;
		}

	}
}




