/*
 * File name : HourlyEmployeeTest.java
 *
 * Subject   : Test the HourlyEmployee class.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */

public class HourlyEmployeeTest  // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Alsayed", "Ali", "123-45-6789", 120, 80.88);
			System.out.printf("%s%n", hourlyEmployee1); // display the content of the object.
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("%s%n", e.getMessage());
		}
	}
}

