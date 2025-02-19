// ***********************************************************
// File name: AccountTest.java
// Subject  : Test the Account class after the modifications.
// Date     : Feb 19, 2025
// Author   : Alsayed A. Khaleel
// ***********************************************************

import java.math.BigDecimal;// import(s) declaration.
import java.util.Scanner;   

public class AccountTest    // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate 2 accounts.
		Account account1 = new Account("Jane Green", BigDecimal.valueOf(50.00));
		Account account2 = new Account("John Blue",  BigDecimal.valueOf(0.0));
		
		// display initial balance of each object.
		System.out.printf("%-10s balance: $%.2f%n",
				account1.getName(), account1.getBalance());
		System.out.printf("%-10s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		
		// Read the user's input at the keyboard.
		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: "); // prompt
		double depositAmount = input.nextDouble();               // obtain user input
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);

		account1.deposit(BigDecimal.valueOf(depositAmount));     // add to account1’s balance
		
		System.out.printf("%-10s balance: $%.2f%n",              // display balances
				account1.getName(), account1.getBalance());
		
		System.out.printf("%-10s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
		
		System.out.print("Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble();                      // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n",
				depositAmount);
		account2.deposit(BigDecimal.valueOf(depositAmount));     // add to account2 balance
		
		System.out.printf("%-10s balance: $%.2f%n",              // display balances
				account1.getName(), account1.getBalance());
		System.out.printf("%-10s balance: $%.2f%n%n",
				account2.getName(), account2.getBalance());
	}
}
