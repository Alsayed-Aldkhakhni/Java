/*
 * File name: GuessTheNumber.java
 *
 * Subject: Guess the number play. 
 * 
 * Date: August 26, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 26, 2024 at [10:30 AM]
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
		int guessTimes = 0;

		if(guess >= 1 && guess <= 1000)
		{
			do
			{
				guessTimes++;

				if(guess == rightGuess)
				{
					if(guessTimes == 10)
						System.out.println("Aha! You know the secret.");
					else if(guessTimes < 10)
						System.out.println("Either you know the secret or you got lucky!");
					else if(guessTimes > 10)
						System.out.println("You should be able to do better.");	

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





