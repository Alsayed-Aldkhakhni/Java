/*
 * File name: PI.java
 *
 * Subjcet: Approximately calculate the value of PI.
 *
 * Date: April 7, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [02:09 PM]
 *
 * */

public class PI // class declaration.
{
 	public static void main(String[] args)
 	{
		// declare and initialize the variables that will be used.
		double PI = 0;
		int denom = 3;
	
		PI = 4.0 - 4.0/denom;
	
		for(int i = 0; i < 189000; i++)   // 3.14159
		{
			denom +=2;
			PI += (4.0/denom) - 4.0/(denom += 2);
		}
	
		System.out.println("PI = " + PI);
	}
}






