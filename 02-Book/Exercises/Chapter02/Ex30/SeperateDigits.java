/*
 * File name: SeperateDigits.java
 *
 * Subject: Separating the Digits in an Integer.
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 4, 2024 --> [11:32 AM]
 *
 * */

// import declaration.
import java.util.Scanner; 

public class SeperateDigits // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate an object to read the user's input at the keyboard.
        Scanner input = new Scanner(System.in);

        // prompt the user to enter an integer.
        System.out.print("Enter an integer consists of 5-digits: ");
		
	// read the input using 'input' object.
        int wholeNum = input.nextInt();
        
        int ones = wholeNum % 10; // the most-right digit.
        wholeNum = wholeNum / 10; // remove it from the number.
        
	// the second-right digit.
        int tens = wholeNum % 10;
        wholeNum = wholeNum / 10;
        
        // the third-right digit.
        int hundreds = wholeNum % 10;
        wholeNum = wholeNum / 10;   

        // the fourth-right digit.
        int thosands = wholeNum % 10;
        wholeNum = wholeNum / 10;   

        // the fifth-right digit.
        int hunderdThosands =  wholeNum % 10;
        
        // print the digits seperated by spaces.
        System.out.printf("Number's digits: %d   %d   %d   %d   %d%n", hunderdThosands, thosands, hundreds, tens, ones);
    }
}
