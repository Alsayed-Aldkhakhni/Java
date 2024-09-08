/*
 * File name: Sales.java
 *
 * Subject: Count the number of salepeople who made amount of money accourding to some ranges.
 *
 * Author: Alsayed A. Aldkhakhni
 *
 * Date: September 08, 2024
 *
 * Last mod: September 08, 2024
 *
 *  */
 


import java.util.Scanner; // import declaration.
public class Sales        // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // read the user's data.
		int[] rangesNum = new int[11];           // store the ranges number.
		char ans = 'y';                         // user's answer to enter more.

		while(ans == 'y')
		{
			// read the amount.
			System.out.print("Enter the amount sold: ");
			double amount = input.nextDouble();

			// simple validation.
			if(amount < 0)
				System.out.println("Invalid amount.");
			else
			{
				// 200 + 9 % amount sold.
				// /100 to round them down
				// to fit the array range.
				int receive = (int)(200 + .09 * amount) / 100;
				
				// $1000 and over.
				if(receive >= 10)
					rangesNum[10]++;
				else
					rangesNum[receive]++;
			}

			// accept more one input?
			System.out.print("\nOne more?(y, n): ");
			ans = input.next().charAt(0);
		}

	
		// print the header of the table.	
		System.out.print("Ranges\t\t| Salepoeple who made this range.\n");
		System.out.println("------------------------------------------------");

		// the content.
		for(int i = 2; i < rangesNum.length; i++)
		{
			if(i == 10)
				System.out.printf("$%,d and over |  %d%n", i*100, rangesNum[i]);
			else
				System.out.printf("$%d-$%d\t|  %d%n", i*100, (i == 10? 0 : i*100+99), rangesNum[i]);
		}
	}

}





