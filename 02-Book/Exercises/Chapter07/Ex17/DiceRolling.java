/**
 * 
 * File name: DiceRolling.java 
 * 
 * Subject: Track how many times the dice faces repeated.
 * 
 * Date: September 09, 2024 
 * 
 * Author: Alsayed A. Aldkhakhni 
 * 
 * Last mod: September 09, 2024
 * 
 **/

import java.util.Random; // import declaration.
public class DiceRolling // class  declaration.
{
	public static void main(String[] args)
	{
		// define the objects to use.
		Random randGen = new Random(); // to generate random numbers.
		int[] repeats = new int[13];   // to hold the number of possibilities.
				
		// iterate 36,000,000 iteration.
		for(int i = 0; i < 36000000; i++)
		{
			// generate a random number in [1, 6].
			int x = 1 + randGen.nextInt(6);
			int y = 1 + randGen.nextInt(6);
			
			// sum and increment its position.
			int z = x + y;
			repeats[z]++;
		}
		
		// print the tabular header.
		System.out.printf("%-6s | %20s%n","Number", "Number of possibilities.");
		System.out.println("---------------------------------");
		
		// the content.
		for(int i = 2; i <= 12; i++)
			System.out.printf("%-6d | %,d%n", i, repeats[i]);
	}
}
