/*
 * File name: AutoPlicy.java
 *
 * Subject: Modified AutoPolicy class.
 *
 * Date: August 17, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 17, 2024 at [03:50 PM]
 *
 * */

public class AutoPolicy // class declaration.
{
	private int accountNumber;   // policy account number
	private String makeAndModel; // car that the policy applies to
	private String state; 	     // two-letter state abbreviation
	
	// ctor.
	public AutoPolicy(int accountNumber, String makeAndModel, String state)
	{
		if(accountNumber > 0)
			this.accountNumber = accountNumber;
		else
			System.out.println(accountNumber + " is invalid.");

		this.makeAndModel = makeAndModel;

		if(state == "CT" || state == "MA" || state == "ME" || state == "NH" ||
		   state == "NJ" || state == "NY" || state == "PA" || state == "VT")
			this.state = state;
		else
			System.out.println("Invalid state abbreviation.");
	}

	// set the account number.
	public void setAccountNumber(int accountNumber)
	{
		if(accountNumber <= 0)
			System.out.println(accountNumber + " is invalid.");
		else
			this.accountNumber = accountNumber;
	}
	
	// retreive the account number.
	public int getAccountNumber() { return accountNumber; }

	// sets the makeAndModel
	public void setMakeAndModel(String makeAndModel) { this.makeAndModel = makeAndModel; }
	
	// returns the makeAndModel
	public String getMakeAndModel() { return makeAndModel; }

	// validate the state abbreviation.
	public void setState(String state)
	{
	       	if(state == "CT" || state == "MA" || state == "ME" || state == "NH" ||
		   state == "NJ" || state == "NY" || state == "PA" || state == "VT")
			this.state = state;
		else
			System.out.println("Invalid state abbreviation.");
	}

	// returns the state
	public String getState() { return state; }

	// predicate method returns whether the state has no-fault insurance.
	public boolean isNoFaultState()
	{
		boolean noFaultState;
		
		switch (getState())
		{
		case "MA": case "NJ": case "NY": case "PA":
			noFaultState = true; break;
		default:
			noFaultState = false;
		}

		return noFaultState;
	}
}









