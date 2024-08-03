/*
 * File name: Multiples.java
 *
 * Subject: Read 2 ints and check whether the 1st is a multiple of the 2nd.
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [12:30 PM]
 *
 * */

// import declaration.
import java.util.Scanner; 

public class Multiples // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate an object, 'input', of type 'Scanner' that reads user's input at the keybaord.
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the 1st number.
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt(); // read the number.
        
        // prompt him for the 2nd number.
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt(); // read the number.

        
        // if the 1st is a multiple of the 2nd it won't be a reminder.
        if(number1 % number2 == 0)
            System.out.printf("%d is a multiple of %d%n", number1, number2);
        
        // if it isn't, so they are not multiples.
        if(number1 % number2 != 0)
            System.out.printf("%d is not a multiple of %d%n", number1, number2);
    }
}
