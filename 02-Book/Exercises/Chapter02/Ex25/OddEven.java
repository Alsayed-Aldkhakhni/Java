/*
 * File name: OddEven.java
 *
 * Subject: Determine whether a number is odd or even.
 * 
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [12:21 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class OddEven // class declaraion.
{
    public static void main(String[] args)
    {   
	// instantiate an object, 'input', of type 'Scanner'
	// to read the user's data at the keyboard.
        Scanner input = new Scanner(System.in);
        
        // promt the user to enter a number.
        System.out.print("Enter an integer: ");

        // read the number and store it in 'testNum'.
        int testNum = input.nextInt();
		
        // if the number is even, inform the user.
        if(testNum % 2 == 0)
            System.out.printf("%d is even%n", testNum);
		
        // otherwise, it is odd, inform him also.
        if(testNum % 2 != 0)
            System.out.printf("%d is odd.%n", testNum);
    }
}
