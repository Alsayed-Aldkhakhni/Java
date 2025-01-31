/*
 * File name: SquareOfAsterisks.java
 *
 * Subject: Print a hollow square of asterisks.
 *
 * Date: March 19, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [02:40 PM]
 *
 * */

import java.util.Scanner;     // import declaration.
public class SquareOfAsterisks// class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of the side: ");
        int asterisksNum = input.nextInt();
        
	if(asterisksNum >= 1)
	{
		if(asterisksNum <= 20)
		{
		        int rows = asterisksNum;

		        while(rows > 0)
		        {
		            int columns = asterisksNum;
		            System.out.print("* ");  

			    while(columns > 2)
			    {
		                if(rows == asterisksNum)
					System.out.print("* "); // the first line of the square.
		                else if(rows == 1)
	   	                        System.out.print("* "); // the last line of the square.
		                else
   		                        System.out.print("  "); // the hollow area within the square.
                
		                columns--;
			    }

           		    System.out.print("* ");  // the last asterisks of each line of the square.
		            System.out.println();    // next line.	
            
		            rows--;
		        }
		}else
			System.out.println("Exceeded the limit [1, 20].");
	}else
			System.out.println("Invalid number of asterisks [1, 20].");
    }
}






