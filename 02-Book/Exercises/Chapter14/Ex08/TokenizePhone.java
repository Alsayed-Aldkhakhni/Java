/*
 * File Name: TokenizePhone.java
 *
 * Subject  : A program that validates a phone number.
 *
 * Date     : October 31, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 31, 2024
 *
 * */

import java.util.Scanner; // import declaration.
public class TokenizePhone// class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in); // read the user's input at the keyboard.
		System.out.print("Enter a phone number"+// prompt the user to enter a phone.
						" as (123) 456-7890: ");
		
		String phone = input.nextLine();          // accept the phone.
		String[] phoneNumParts = phone.split(" ");// split into parts.
		
		// validate the phone number.
		boolean isAreaNumValid  = isAreaValid(phoneNumParts[0]);
		boolean isPhoneNumValid = isPhoneValid(phoneNumParts[1]);
		
		// print the phone again if it's valid.
		if(isAreaNumValid && isPhoneNumValid)
			System.out.print("The number you entered: " + phone);
		else 
			System.out.println("Invalid input, either the foramte or the phone itself.");
	}

	// validate the area code.
	public static boolean isAreaValid(String area)
	{
		return area.matches("\\([1-9]\\d{2}\\)");
	}
	
	// validate the phone number.
	public static boolean isPhoneValid(String phone)
	{
		return phone.matches("[1-9]\\d{2}-\\d{4}");
	}
}

