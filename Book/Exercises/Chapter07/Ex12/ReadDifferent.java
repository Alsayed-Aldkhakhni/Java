/*
 * File name: ReadDifferent.java
 * 
 * Subject: read 5 different numbers and store in an array.
 * 
 * Date: September 09, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 09, 2024
 * 
 * */

import java.util.Scanner;  // import declaration, to read the data at  the keyboard.
public class ReadDifferent // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] diffNums = new int[5]; // store the different numbers.
		
		for(int i = 0; i < 5;)
		{
			// read a number from the user.
			System.out.print("Enter a number in [10, 100]: ");
			int num = input.nextInt();
			
			// validate the range.
			if(num < 10 || num > 100)
				System.out.println(num + " is not in the valid range.\n");
			else
			{
				// check if it already exist.
				int	loc = isExist(diffNums, num);

				// execute based on the loc's value.
				if(loc >= 0)
					System.out.println(num + " is exist at LOC[" + loc + "]\n");
				else
				{
					// if it isn't exist, add it.
					diffNums[i++] = num;
					
					// print the array after addition.
					System.out.print(num + " ---> [ ");
					for(int j = 0; j < i; j++)
						System.out.print(diffNums[j] + " ");
					System.out.println("]\n");
				}
			}
		}
	}
	
	// to search for target in nums.
	public static int isExist(int[] nums, int target)
	{
		for(int i = 0; i < nums.length; i++)
			if(target == nums[i])
				return i;
		
		return -1;
	}
}


