/*
 * File name: WorldPopulation.java
 *
 * Subject: World Population Growth Calculator.
 *
 * Date: August 4, 2024 --> [12:44 PM]
 *
 * Auhtor: Alsayed-Ali
 *
 * Last modification: August 4, 2024 --> [1:00 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class WorldPopulation // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate an object to read the user's data at the keyboard.
		Scanner input = new Scanner(System.in);

		// prompt the user to enter the current population.
		System.out.print("Enter the current population: ");
		long currentPop = input.nextLong();

		// enter the annual rate of growth.
		System.out.print("Enter the annual gorwth rate [1-100]: ");
		double annualRate = input.nextDouble() / 100.0;

		// P-future =  P-current * (1+r)^n, where n is the number of years.
		// the calculation part.
		long pop1 = (long)( currentPop * (1.0 + annualRate) );
		long pop2 = (long)( currentPop * ( (1.0 + annualRate) * (1.0 + annualRate) ) );
		long pop3 = (long)( currentPop * ( (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) ) );
		long pop4 = (long)( currentPop * ( (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) ) );
		long pop5 = (long)( currentPop * ( (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) * (1.0 + annualRate) ) );
	
		// print the population of each period.
		System.out.println("=========================================================");
		System.out.printf("The expected world population after 1 year : %,d%n", pop1);
		System.out.printf("The expected world population after 2 years: %,d%n", pop2);
		System.out.printf("The expected world population after 3 years: %,d%n", pop3);
		System.out.printf("The expected world population after 4 years: %,d%n", pop4);
		System.out.printf("The expected world population after 5 years: %,d%n", pop5);
		System.out.println("==========================================================");
	}
}


