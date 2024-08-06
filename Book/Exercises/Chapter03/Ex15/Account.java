/*
 * File name: Account.java
 *
 * Subject: A class that represents a bank accounts.
 *
 * Date: March 4, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [12:40 PM]
 *
 * */

public class Account // class declaration.
{
    // instance variables.
    private String name;
    private double balance;
    
    // 2-arguments constructor.
    public Account(String accountName, double amount)
    {
        name = accountName;
	if(amount > 0)
		balance = amount;
    }
    
    // make a withdraw
    public void withDraw(double amount)
    {
	 // validate the input.
       	 if(amount > balance)
      	     System.out.printf("The amount %.2f is invalid.%n", amount);

	 if(amount <= 0)   
      	     System.out.printf("The amount %.2f is invalid.%n", amount);
		
	 if(amount > 0)
		 if(amount <= balance)
			 balance = balance - amount;
    }
    
    // add an amount of money to the current one.
    public void deposite(double amount)
    {
        if(amount > 0) // validate the input.
        {
            balance = balance + amount;
        }

	if(amount <= 0)
	     System.out.printf("The amount %.2f is invalid.%n", amount);			
    }
    
    // naming the account.
    public void setName(String accountName)
    {
        name = accountName;
    }
    
    // return the values stored in instance variables.
    public String getName()    { return name; }
    public double getBalance() { return balance; }  
} 
