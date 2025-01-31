/*
 * File name : EmployeesTest.java
 *
 * Subject   : Test the class CommissionEmployee and BasePlusCommissionEmployee.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */


public class EmployeesTest // class declaration.
{
	public static void main(String[] args)
	{
		//instantiate BasePlusCommissionEmployee object
		BasePlusCommissionEmployee employee1 = new BasePlusCommissionEmployee("Alsayed", "Ali", "123-45-6789", 5000.0, 4.0, 300.0);

		// print employee's data using toString().
		System.out.printf("%s", employee1);

		// change the base salary and gross sales.
		employee1.setBaseSalary(7000.0);
		employee1.setGrossSales(10000.0);
		
		System.out.println("\n");
		
		System.out.printf("%s", employee1);
	}
}

