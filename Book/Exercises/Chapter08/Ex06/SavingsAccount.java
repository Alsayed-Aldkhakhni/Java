/*
 * File name : SavingsAccount.java 
 *
 * Subject   : Construct a class that emulates a bank account.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  :  September 15, 2024
 *
 * */

public class SavingsAccount // class declaration.
{
	// class-wide variables.
	private static int accountNumber = 1000;        // the starting point to numbering the accounts.
	private static double annualInterestRate = 0.0; // the annual investment rate as 4%, 5%, 3.5% and so on.

	// instance variables.
	private double savingsBalance;                  // the account's balance.
	private int localNumber;                        // the account number.
	
	// 1-argument constructor.
	SavingsAccount(double balance)
	{
		// if the balance is zero or negative.
		if(balance <= 0)
			throw new IllegalArgumentException( balance + " is an invalid account balance.");
		
		// so far so good.
		savingsBalance = balance;
		localNumber = accountNumber++;
	}
	
	// assign a new value to the annualInterestRate.
	public static void modInterestRate(double rate)
	{
		// validate the input.
		if(rate <= 0)
			throw new IllegalArgumentException(rate + " is an invalid interest rate.");
		
		annualInterestRate = rate;
	}

	// calculate the monthly interest rate.
	public double calcMonthlyInterest()
	{
		return (savingsBalance += savingsBalance * annualInterestRate / 12.0);
	}
	
	// print the instance's data when it's called by %s.
	public String toString()
	{
		return String.format(
				"%nAccount number       : %d%nAnnual  interest rate: %.1f%s%nAccount principle    :$%,.2f%nMonthly interest     :$%,.2f%n", 
                   localNumber,  annualInterestRate, "%", savingsBalance, calcMonthlyInterest());
	}
}


