/*
 * File name: Product.java
 *
 * Subject: A program the multiply three entered integers.
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni 
 * 
 * Last modification: August 3, 2024 [11:00 AM]
 *
 * */

// import declaration, to use 'Scanner' class.
import java.util.Scanner;

// class declaration.
public class Product
{
    public static void main(String[] args)
    {   // take an object of type 'Scanner' to read data from the user at the keyboard.
        Scanner input = new Scanner(System.in);

        // prompt him to enter the first integer.
        System.out.print("Enter the 1st integer: ");
        int x = input.nextInt(); // read the integer.
        
	// the 2nd one.
        System.out.print("Enter the 2nd integer: ");
        int y = input.nextInt(); // read the second integer.
        
	// the 3rd.
        System.out.print("Enter the 3rd integer: ");
        int z = input.nextInt(); // third integer.
        
	// carry out the calculation.
        int result = x * y * z; 
        
        // print the value to the user.
        System.out.printf("The product is: %d%n", result);
    }
}
