/*
 * File name: BarChart.java
 *
 * Subject: Print bars of asterisks.
 *
 * Date: April 06, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [12:45 PM]
 *
 * */


import java.util.Scanner; // import declaration, to read the user's input.
public class BarChart     // class declaration.
{
	public static void main(String[] args)
	{   
		Scanner input = new Scanner(System.in);
	
		System.out.println("All asterisks are in the range [1, 30]");

		System.out.print("Enter the number of asterisks of bar 1: ");
		int bar1 = input.nextInt();

		System.out.print("Enter the number of asterisks of bar 2: ");
		int bar2 = input.nextInt();
		
		System.out.print("Enter the number of asterisks of bar 3: ");
		int bar3 = input.nextInt();
		
		System.out.print("Enter the number of asterisks of bar 4: ");
		int bar4 = input.nextInt();
		
		System.out.print("Enter the number of asterisks of bar 5: ");
		int bar5 = input.nextInt();

		if(bar1 >= 1 && bar1 <= 30)
			for(int i = 0; i < bar1; i++) 
				System.out.print('*');
		else
			System.out.print(bar1 + " is not between [1, 30].");
		
		System.out.println();

		if(bar2 >= 1 && bar2 <= 30)
			for(int i = 0; i < bar2; i++)
				System.out.print('*');
		else
			System.out.print(bar2 + " is not between [1, 30].");
		
		System.out.println();

		if(bar3 >= 1 && bar3 <= 30)
			for(int i = 0; i < bar3; i++) 
				System.out.print('*');
		else
			System.out.print(bar3 + " is not between [1, 30].");
		
		System.out.println();

		if(bar4 >= 1 && bar4 <= 30)
			for(int i = 0; i < bar4; i++)
				System.out.print('*');
		else
			System.out.print(bar4 + " is not between [1, 30].");
		
		System.out.println();

		if(bar5 >= 1 && bar5 <= 30)
			for(int i = 0; i < bar5; i++) 
				System.out.print('*');
		else
			System.out.print(bar5 + " is not between [1, 30].");
		
		System.out.println();
	}
}











