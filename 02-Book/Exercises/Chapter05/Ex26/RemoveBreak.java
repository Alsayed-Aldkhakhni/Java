/*
 * File name: RemoveBreak.java
 *
 * Subject: Substitute the break statement with another equivalent.
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [11:28 PM]
 *
 * */


public class RemoveBreak // class declaration.
{
	public static void main(String[] args)
	{
		int count;
		
		// loop 10 times
		for (count = 1; count <= 10 && count != 5; count++)
			System.out.printf("%d ", count);

		System.out.printf("%nBroke out of loop at count = %d%n", count);
	}

}






