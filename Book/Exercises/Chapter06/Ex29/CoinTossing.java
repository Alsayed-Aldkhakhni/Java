/*
 * File name: CoinTossing.java
 *
 * Subject: Coin Tossing play. 
 * 
 * Date: August 25, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 25, 2024 at [07:30 AM]
 *
 * */

import java.security.SecureRandom;// to generate the coin faces randomly.
import java.util.Scanner;         // import declaration, to read the user's data.
public class CoinTossing          // class  declaratoin.
{
	private enum Coin{HEADS, TAILS};
	private static SecureRandom randGen = new SecureRandom();

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int ans;
		int heads = 0, tails = 0;

		do
		{
			System.out.print("Select the digit:\n1) Toss the coin.\n2) Print results: ");
			ans = input.nextInt();
			
			switch(ans)
			{
				case 1:
					if(flip() == Coin.HEADS)
					        heads++;
					else
					       	tails++;
					break;

				case 2:
					System.out.printf("%-10s%s%n", "HEADS", "TAILS");
					System.out.println("================");
					System.out.printf("%-10d%d%n", heads, tails);
					break;

				default:
					System.out.println("Invalid option.");
			}

			System.out.println();
		}while(ans == 1);
	}

	public static Coin flip()
	{
		int x = randGen.nextInt(2);

		if(x == 0)
			return Coin.HEADS;
		else
			return Coin.TAILS;
	}
}
