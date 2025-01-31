/*
 * File name: RemoveContinue.java
 *
 * Subject: Remove the continue from the Fig. 5.14
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [03:13 PM]
 *
 * */


public class RemoveContinue // class declaration.
{
	public static void main(String[] args)
	{
		// loop 10 times
		for (int count = 1; count <= 10; count++)
		{
			if (count != 5)
				System.out.printf("%d ", count);
		}

		System.out.printf("%nUsed continue to skip printing 5%n");
	}
}






