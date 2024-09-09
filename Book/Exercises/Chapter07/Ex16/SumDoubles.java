/**
 * 
 * File name: SumDoubles.java 
 * 
 * Subject: Sum the doubles passed by command-line argument.
 * 
 * Date: September 09, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 09, 2024
 * 
 **/

public class SumDoubles // class declaration.
{
	public static void main(String[] args)
	{
		double sum = 0;
		for(String strDob : args)
			sum += Double.parseDouble(strDob);
		
		System.out.printf("The total of those numbers: %,.3f%n", sum);
	}
}
