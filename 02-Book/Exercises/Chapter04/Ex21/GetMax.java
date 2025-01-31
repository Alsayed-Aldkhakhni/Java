/*
 * File name: GetMax.java
 *
 * Subject: A program tha takes 10 integers and print the largest number.
 *
 * Date: March 19th, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [01:45 PM]
 *
 * */


import java.util.Scanner; // import declaration to read the user's data.
public class GetMax       // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
     
        // initialize the variables.	
        int counter = 1;
        int number = 0;
	int largest = 0;
        
	// read the numbers.
        while(counter <= 10)
        {
            System.out.printf("Enter number #%d: ", counter);
            number = input.nextInt();
                        
            if(number > largest)
		    largest = number;

            counter++;
        }
        
	// print the largest.
        System.out.printf("%nThe largest number of  those is: %d.%n", largest);
    }
}




