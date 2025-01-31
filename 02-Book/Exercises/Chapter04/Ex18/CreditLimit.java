/*
 * File name: CreditLimit.java
 *
 * Subject: Calculate the credit limit of custmores' accounts.
 *
 * Date: March 18, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [09:50 AM]
 *
 * */

import java.util.Scanner; // import declaration, to read input from the user.
public class CreditLimit  // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
	// read the account's data.
        System.out.print("Enter your account number: ");
	int accountNum = input.nextInt();
        
	System.out.print("Enter your account initial balance: ");
	int startBalance = input.nextInt();
        
	System.out.print("Enter total of all items charged:   ");
	int chargedItems = input.nextInt(); 
        
	System.out.print("Enter total of all credits applied: ");
	int totalCredits = input.nextInt();

	System.out.print("Enter allowed credits limit: ");
        int allowedCredits = input.nextInt();

	int creditLimit = 0;
	
	while(accountNum > 0)
	{
		// validate the values.
		if(startBalance > 0)
			if(chargedItems >= 0)
				if(totalCredits >= 0)
				       creditLimit = startBalance + chargedItems - totalCredits;
				else
					System.out.println("Invalid credits.");
			else
				System.out.println("Invalid charged items.");
		else
			System.out.println("Invalid initial balance.");
        
	        System.out.printf("%nAccount #%d balance is: $%d%n", accountNum, creditLimit);
	        
	        if(creditLimit > allowedCredits)
	               System.out.println("Credit limit exceeded.");
	     
		System.out.print("Enter your account number: ");
	        accountNum = input.nextInt();
        
	        System.out.print("Enter your account initial balance: ");
	        startBalance = input.nextInt();
        
	        System.out.print("Enter total of all items charged:   ");
	        chargedItems = input.nextInt(); 
        
	        System.out.print("Enter total of all credits applied: ");
	        totalCredits = input.nextInt();
	  
	        System.out.print("Enter allowed credits limit: ");
        	allowedCredits = input.nextInt();
	}
    }
}
