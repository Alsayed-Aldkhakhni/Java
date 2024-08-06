/*
 * File name: ATM.java
 *
 * Subject: Test the Account class.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed-Ali
 * 
 * Last modification: August 6, 2024 --> [4:38 AM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class ATM // class declaration.
{
    public static void main(String[] args)
    {
        // instantiate two objects one to read user's data at the keyboard, input,
        // and the other to model a bank acount, account1.
        Scanner input = new Scanner(System.in);
        Account account1 = new Account("", 0.0);
        
        // print the initial data in the account.
        account1.printAccount();
                
        // prompt the user to enter the acount's name.
        System.out.print("Enter the account name: ");
        String accountName = input.nextLine(); // read the name.
        account1.setName(accountName);         // assign the name of the account.
        
        account1.printAccount();

        // deposite some money.
        System.out.print("Make a deposite, enter the amount: ");
        double amount = input.nextDouble();
        account1.deposite(amount);
        
        // show the account's data after deposite.
        account1.printAccount();
        
        // make a withdraw.
        System.out.print("make a withdraw, Enter the amount: ");
        amount = input.nextDouble();
        account1.withdraw(amount);
        
        // show the account's data after withdraw.
        account1.printAccount();
    }
}
