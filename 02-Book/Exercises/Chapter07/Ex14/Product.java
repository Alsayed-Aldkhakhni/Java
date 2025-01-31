/**
 * 
 * File name: Product.java 
 * 
 * Subject: Calculate the product of array using variable-length arg list.
 * 
 * Date: September 09, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 09, 2024
 * 
 **/

import java.util.Scanner; // import declaration, read the user's data.
public class Product      // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		// read the array's size.
		System.out.print("Array[size], enter size: ");
		int size = input.nextInt();
		
		// validate that size.
		if(size <= 0)
			System.out.println(size + " is an invalid size.\n");
		else
		{
			// allocate the memory, and fill it.
			int[] nums = new int[size];
			
			System.out.println();
			for(int i = 0; i < nums.length; i++)
			{
				System.out.print("Enter Array[" + i + "]: ");
				int dummy = input.nextInt();
				nums[i] = dummy;
			}
			
			// print the product of the items.
			System.out.printf("%nThe product of those ints: %,d%n", getProduct(nums));
		}
	}
	
	// calculate the product of array's items.
	public static int getProduct(int... nums)
	{
		int product = 1;
		
		for(int i : nums)
			product *= i;
		
		return product;
	}
}


