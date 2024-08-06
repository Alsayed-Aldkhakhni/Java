/*
 * File name: Account.java
 *
 * Subject: A class presents a bank account.
 *
 * Date: March 4, 2024
 *
 * Author: Alsayed-Ali
 *
 * Last modification: August 6, 2024 --> [4:28 AM]
 *
 **/

public class Account // class declaration.
{
    // instance variables.
    private String name;
    private double balance;
    
    // instance methods.
    public Account(String accountName, double amount)
    {
        name = accountName;
    	if(amount > 0.0) balance = amount;
    }
    
    // take an amount of money from the account.
    public void withdraw(double amount)
    {
        if(amount > balance)
	     System.out.printf("The amount %.2f is not valid for withdraw.%n", amount);

	if(amount <= 0)
	    System.out.printf("The amount %.2f is not valid for withdraw.%n", amount);

	if(amount <= balance)
		balance = balance - amount;
    }
        
    
    // add an amount of money to the account.
    public void deposite(double amount)
    {
        if(amount > 0) // validate the parameter.
            balance = balance + amount;
        
	if(amount <= 0)
            System.out.println("Invalid deposite value.");
    }
    
    // set the name of the account.
    public void setName(String accountName)
    {
        name = accountName;
    }
    
    // return the name of the account.
    public String getName() { return name; }
    
    // how much money is in the account.
    public double getBalance() { return balance; } 
    
    // display object's data.
    public void printAccount()
    {
        System.out.printf("Account's name:    %s%nAccount's balance: $%,.2f%n%n", name, balance);
    }
}
