/*
 * File name: Smallest.java
 *
 * Subject: Find the smallest number.
 *
 * Date: April 06, 2024
 *
 * Author: Alsayed_Ali_Aldkahkhni
 *
 * Last modification: August 16, 2024 at [12:00 PM]
 *
 * */

import java.util.Scanner;// import declaration, to read the user's input.
public class Smallest	 // class declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the numbers count.
        System.out.print("How many numbers you're going to enter: ");

	// read it.
        int xNumbers = input.nextInt(); 
		
	// to hold the smallest number will be entered.
	int smallestNum = 0;
	int dummy = 0;
	
        // looping xNumbers times.
        for(int count = 0; count < xNumbers; count++)
        {
           // prompt him to enter the next number.
           System.out.printf("Enter number #%d: ", count + 1);
	   dummy = input.nextInt();

	   if(smallestNum > dummy)
		   smallestNum = dummy;
       }

        // print the smallest number to the user.
        System.out.println("The smallest number is: " + smallestNum);
    }
}






