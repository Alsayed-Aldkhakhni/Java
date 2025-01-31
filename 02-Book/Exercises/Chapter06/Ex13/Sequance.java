/*
 * File name: Sequances.java
 *
 * Subject: Print a random number from some sets.
 *
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [06:30 AM]
 *
 * */

import java.security.SecureRandom;
public class Sequances // class declaration.
{
	public static void main(String[] args)
	{
		SecureRandom randGen = new SecureRandom();
		
		int x = 2 + 2 * randGen.nextInt(5);
		int y = 3 + 2 * randGen.nextInt(5);
		int z = 6 + 4 * randGen.nextInt(5);

		System.out.printf("x = %d%n", x);
		System.out.printf("y = %d%n", y);
		System.out.printf("z = %d%n", z);
	}
}

