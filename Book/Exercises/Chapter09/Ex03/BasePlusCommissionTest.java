/*
 * File name : BasePlusCommissionTest.java
 *
 * Subject   : Test the BasePlusCommissionEmployee class.
 *
 * Date      : September 25, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 25, 2024
 *
 * */

public class BasePlusCommissionTest // class declaration.
{
	// driver method.
	public static void main(String[] args)
	{
		// instantiate an object and assign the values.
		BasePlusCommissionEmployee emp1 = new BasePlusCommissionEmployee(
				                              "Alsayed", "Ali", "123-45-6789", 5000.0, 5.0, 1000.0);
		
		// print the data.
		System.out.printf("%s", emp1);
	}
}

