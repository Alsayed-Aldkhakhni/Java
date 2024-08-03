/*
 * File name: Arithmetic.java
 *
 * Subject: Perform 4-basic arithmetic operations on integers.
 * 
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [11:31 AM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class Arithmetic // class declaration.
{
    public static void main(String[] args)
    {   // take an object of type 'Scanner' to read user's input at the keybaord.
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the first integer.
        System.out.print("Enter the 1st number: ");

        // read it and store the value passed in 'number1'.
        int number1 = input.nextInt();
        
        // prompt the user to enter the second integer.
        System.out.print("Enter the 2nd number: ");
        int number2 = input.nextInt(); // read it.
       
       	// print the values of the operations.	
	System.out.printf("The sum:  %d%n", (number1+number2));   
	System.out.printf("The dif:  %d%n", (number1-number2));   
	System.out.printf("The mul:  %d%n", (number1*number2));

	// division by zero is not allowed.
	if(number2 != 0)
		System.out.printf("The div:  %d%n", (number1/number2));
    }
}
