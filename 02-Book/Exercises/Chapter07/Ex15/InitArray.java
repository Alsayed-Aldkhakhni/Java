/**
 * 
 * File name: InitArray.java 
 * 
 * Subject: Print the array's content.
 * 
 * Date: September 09, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 09, 2024
 * 
 **/

public class InitArray // class declaration.
{
	public static void main(String[] args)
	{
		int size = 10; // default length.
		
		// if the user passed a new length by command-line argument.
		if(args.length > 0)
		{
			if(Integer.parseInt(args[0]) > 0)
				size = Integer.parseInt(args[0]);			 
		}

		// allocate the array.
		int[] array = new int[size];
	
		// print the header of the table.
		System.out.printf("%5s%8s%n", "Index", "Value");
	
		// print the content.
		for (int i = 0; i < array.length; i++)
			System.out.printf("%02d%10d%n", i, array[i]);
	}
}

