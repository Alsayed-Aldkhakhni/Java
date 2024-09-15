/*
 * File name : SavingsAccountTest.java
 *
 * Subject   : Test the class SavingsAccount.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 15, 2024
 *
 * */

public class SavingsAccountTest // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate 2 savers' accounts.
		SavingsAccount acc1 = new SavingsAccount(3000);
		SavingsAccount acc2 = new SavingsAccount(4000);

		// default rate, 0%.
		System.out.printf("%s%s", acc1, acc2);
		
		// modify the rate, 4%.
		SavingsAccount.modInterestRate(4);
		
		// print the accounts' data.
		System.out.printf("%s%s", acc1, acc2);
		
		// set a new interest.
		SavingsAccount.modInterestRate(5);
		
		// print z data.
		System.out.printf("%s%s", acc1, acc2);
	}
}



