/*
 * File name: ATM.java
 *
 * Subject: A program that emulates ATM accounts, 'enhanced version of Exercise3.11'.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [12:35 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class ATM // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate three objects. 
        Scanner input    = new Scanner(System.in);
        Account account1 = new Account(" ", 0.0);
        Account account2 = new Account(" ", 0.0);
        
	System.out.println("----------------1st account.---------------");

	// prompt message tells the user what to do.
        System.out.print("Enter the account name: ");
        account1.setName(input.nextLine());
        
	// print initial data about the account.
        showAccount(account1);

	// prompt the user to enter the amount of deposite.
        System.out.print("Make a deposite, Enter the amount: ");
        account1.deposite(input.nextDouble());
        
	// confirmation with successful deposit.
        showAccount(account1);

	// prompt the user to enter the amount of withdraw.
        System.out.print("Enter a value to be withdrawed: ");
        account1.withDraw(input.nextDouble());
        
	// confirmation with successful withdraw.
        showAccount(account1);

	System.out.println("----------------2nd account.---------------");
	
        System.out.print("Enter the account name: ");

	input.nextLine();

        account2.setName(input.nextLine());
        
        showAccount(account2);

        System.out.print("Make a deposite, Enter the amount: ");
        account2.deposite(input.nextDouble());
        
        showAccount(account2);

        System.out.print("Enter a value to be withdrawed: ");
        account2.withDraw(input.nextDouble());
        
        showAccount(account2);
    }

    // print the account's data.
    public static void showAccount(Account Ac)
    {
        System.out.printf("The current balance at \"%s\" account is $%,.2f.%n%n", Ac.getName(), Ac.getBalance());
    }
}
