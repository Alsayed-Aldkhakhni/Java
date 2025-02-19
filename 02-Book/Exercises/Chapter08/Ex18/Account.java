// ***********************************************************
// File name: Account.java
// Subject  : Class Account that emulates a Bank account.
// Date     : Feb 19, 2025
// Author   : Alsayed A. Khaleel
// ***********************************************************


import java.math.BigDecimal;    // import declaration.

public class Account            // class declaration.
{
	// instance variables.
	private String name;        // the account name.        
	private BigDecimal balance; // the amount of money in it.
	
	// Account constructor that receives two parameters
	public Account(String name, BigDecimal balance)
	{
		this.name = name;       // set the account name.
		
		// if the supported balance is greater than 0.0, set it.
		if (balance.compareTo(BigDecimal.ZERO) >= 0)
			this.balance = balance; 
		else
			throw new IllegalArgumentException("("+ balance +") invalid balance.");
	}
	
	// method that deposits (adds) only a valid amount to the balance
	public void deposit(BigDecimal depositAmount)
	{
		if (depositAmount.compareTo(BigDecimal.ZERO) >= 0)
			balance = balance.add(depositAmount);
	}
	
	// method returns the account balance.
	public BigDecimal getBalance()   { return balance; }
	
	// method that sets the name.
	public void setName(String name) { this.name = name; }
	
	//method that returns the name.
	public String getName() { return name; }
}

