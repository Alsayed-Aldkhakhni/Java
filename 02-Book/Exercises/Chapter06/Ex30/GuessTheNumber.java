/*
 * File name: GuessTheNumber.java
 *
 * Subject: Guess the number play. 
 * 
 * Date: August 25, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 25, 2024 at [08:30 AM]
 *
 * */

import java.security.SecureRandom;// to generate the coin faces randomly.
import java.util.Scanner;         // import declaration, to read the user's data.
public class GuessTheNumber       // class  declaration.
{
	public static void main(String[] args)
	{
		SecureRandom randGen = new SecureRandom();
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number between [1, 1000]: ");
		int rightGuess = 1 + randGen.nextInt(1000);
		int guess = input.nextInt();
		char ans = 'y';

		if(guess >= 1 && guess <= 1000)
		{
			do
			{
				if(guess == rightGuess)
				{
					System.out.println("Congratulations. You guessed the number!");
					System.out.print("\nOne more time?(y, n): ");
					ans = input.next().charAt(0);
					
					if(ans == 'y')
						rightGuess = 1 + randGen.nextInt(1000);
					else
						break;
				}
				else if(guess < rightGuess)
					System.out.println("Too low.");
				else
					System.out.println("Too high.");
				
				System.out.print("\nEnter a number: ");
				guess = input.nextInt();

			}while(ans == 'y');
		}
		else
			System.out.println("Invalid value.");
	}
}





