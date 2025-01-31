/*
 * File name: Compare.java
 *
 * Subject: Take two integers from the user and find the largest one.
 * 
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [11:42 AM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class Compare // class declaration.
{
    public static void main(String[] args)
    {   // create an object read user's input.
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the first number.
        System.out.print("Enter the 1st number: ");

        // read the integer and store it in 'number1'.
        int number1 = input.nextInt();
        
        // prompt the user to enter the second number.
        System.out.print("Enter the 2nd number: ");
        int number2 = input.nextInt();
        
	// if 'number1' is greater than 'number2', display that.
        if(number1 > number2) 
            System.out.printf("%d is larger.%n", number1);
		
        // or 'number2' is the biggest.
        if(number2 > number1)
            System.out.printf("%d is larger.%n", number2);
		
        // or they are equal.
        if(number2 == number1) 
            System.out.printf("%d = %d%n.", number1, number2);
    }
}
