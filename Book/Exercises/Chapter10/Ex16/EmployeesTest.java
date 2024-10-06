/*
 * File name: EmployeesTest.java 
 * 
 * Subject  : Test those classes.
 * 
 * Date     : September 30, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : September 30, 2024
 * 
 * */

public class EmployeesTest // class declaration.
{
	// Entry point, execution starts from.
	public static void main(String[] args)
	{
		try
		{
			// create four-element Employee array
			Employee[] employees = new Employee[5];

			// create subclass objects & initialize array with Employees.
			employees[0] = new SalariedEmployee("Alsayed", "Ali", "111-11-1111", 10, 18, 2003, 1050.55);
			employees[1] = new HourlyEmployee("Adel", "Khalid", "222-22-2222", 8, 12, 1999, 150, 50);
			employees[2] = new CommissionEmployee("Hytham", "Ibrahiem", "333-33-3333", 3, 7, 2001, 10000, 6);
			employees[3] = new BasePlusCommissionEmployee("Salma", "Mostafa", "444-44-4444", 10, 19, 2000, 5000, 4, 700);
			employees[4] = new PieceWorker("Khalid", "Sami", "555-55-5555", 10, 15, 2001, 750, 3.255);

			// print out the string representation of the objects.
			for(Employee currentEmployee: employees)
				System.out.println(currentEmployee);

			// print out just the earnings.
			for(Employee currentEmployee: employees)
				System.out.printf("Employee's earnings: $%,.2f%n", currentEmployee.getPaymentAmount());
		}
		catch(Throwable e) // catch any exception.
		{
			System.out.printf("%s", e.getMessage());
		}
	}
}