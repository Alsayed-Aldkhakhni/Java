/*
 * File name: Randoms.java
 *
 * Subject: Assign random values in specific ranges.
 *
 * Date: August 24, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 24, 2024 at [05:50 AM]
 *
 * */

import java.security.SecureRandom;
public class Randoms // class declaration.
{
	public static void main(String[] args)
	{
		SecureRandom randGen = new SecureRandom();

		int x1 = 1 + randGen.nextInt(2);
		int x2 = 1 + randGen.nextInt(100);
		int x3 = 0 + randGen.nextInt(10);

		int x4 = 1000 + randGen.nextInt(113);
		int x5 = -1 + randGen.nextInt(3);
		int x6 = -3 + randGen.nextInt(15);

		System.out.printf("%-10s%-10s%s%n", "X", "Value", "Rule");
		System.out.println("-----------------------------------");

		System.out.printf("%-10s%-9d%-15s%n", "x1", x1, "1 <= " + x1 + " <= 2.");       // 1 ≤ n ≤ 2.
		System.out.printf("%-10s%-9d%-15s%n", "x2", x2, "1 <= " + x2 + " <= 100.");     // 1 ≤ n ≤ 100.
		System.out.printf("%-10s%-9d%-15s%n", "x3", x3, "0 <= " + x3 + " <= 9.");       // 0 ≤ n ≤ 9.
		System.out.printf("%-10s%-9d%-15s%n", "x4", x4, "1000 <= " + x4 + " <= 1112."); // 1000 ≤ n ≤ 1112.
		System.out.printf("%-10s%-9d%-15s%n", "x5", x5, "-1 <= " + x5 + " <= 1.");      // –1 ≤ n ≤ 1.
		System.out.printf("%-10s%-9d%-15s%n", "x6", x6, "-3 <= " + x6 + " <= 11." );    // –3 ≤ n ≤ 11.
	}
}




