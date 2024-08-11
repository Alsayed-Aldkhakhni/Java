/*
 * File name: Plindromes.java
 *
 * Subject: Check whether a number is palindrome.
 *
 * Date: March 19, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [03:03 PM]
 *
 * */

import java.util.Scanner; // import declaration.
public class Palindromes  // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
	int num1 = input.nextInt();

	while((int)(num1 / 10000) > 9 || (int)(num1 / 10000) < 1)
	{
		 System.out.print("Not a 5-digits number, try again: ");
		 num1 = input.nextInt();
	}

	// sample: 12321
	int copy = num1;

	int digit5 = num1 % 10; // 1
	num1 /= 10; // 1232
		
	int digit4 = num1 % 10; // 2
	num1 /= 10; // 123
		
	int middle = num1 % 10; // 3
	num1 /= 10; // 12
		
	int digit2 = num1 % 10; // 2
	num1 /= 10; // 1
		
	int digit1 = num1 % 10; // 1
	num1 /= 10; // 0

	if(digit1 == digit5)
		if(digit2 == digit4)
			System.out.println(copy + " Is a palindrome.");
		else
			System.out.println(copy + " Not a palindrome.");
	else
		System.out.println(copy + " Not a palindrome.");
     }
}

