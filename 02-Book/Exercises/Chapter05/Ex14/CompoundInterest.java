/*
 * File name: CompundInterest.java
 *
 * Subject: Print the interest rate of 10 years.
 *
 * Date: April 07, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [03:30 PM]
 *
 * */


public class CompoundInterest // class declaration.
{
 	public static void main(String[] args)
 	{
		// amount on deposit at end of each year.
		double amount; 
		
		// initial amount before interest.
		double principal = 1000.0;
		
		// interest rate.
		double rate = 0.05; 
        
		// print the table's header.
		System.out.printf("%-10s%-16s%-16s%-16s%-16s%-16s%-16s%n", "Year", "5%", "6%", "7%", "8%", "9%", "10%");
	      	System.out.println("--------------------------------------------------" + 
				   "-------------------------------------------------");

		// calculate amount on deposit for each of ten years.
		for (int year = 1; year <= 10; ++year)
		{
	    		double currentRate = rate;
	    		System.out.printf("%-10d", year);

			// go through 5% -> 10%.
			for(int j = 0; j < 6; j++)
	    		{
			      	// calculate new amount for specified year.
		  		amount = principal * Math.pow(1.0 + currentRate, year);

				System.out.print("$");

		  		// display the year and the amount.
		  		System.out.printf("%,-15.2f", amount);
		  		currentRate += 0.01;
			}

			System.out.println();
		}
	}
}





