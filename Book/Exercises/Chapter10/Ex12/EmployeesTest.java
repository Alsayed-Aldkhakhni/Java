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
import java.time.LocalDate;

public class EmployeesTest // class declaration.
{
	// Entry point, execution starts from.
	public static void main(String[] args)
	{
		try
		{
			// create subclass objects.
			SalariedEmployee salariedEmployee =
					new SalariedEmployee("Alsayed", "Ali", "111-11-1111", 10, 18, 2003, 1050.55);

			HourlyEmployee hourlyEmployee =
					new HourlyEmployee("Adel", "Khalid", "222-22-2222", 8, 12, 1999, 150, 50);

			CommissionEmployee commissionEmployee =
					new CommissionEmployee("Hytham", "Ibrahiem", "333-33-3333", 3, 7, 2001, 10000, 6);

			BasePlusCommissionEmployee basePlusCommissionEmployee =
					new BasePlusCommissionEmployee("Salma", "Mostafa", "444-44-4444", 10, 19, 2000, 5000, 4, 700);

			// print the employees' data.
			System.out.println(salariedEmployee);
			System.out.println(hourlyEmployee);
			System.out.println(commissionEmployee);
			System.out.println(basePlusCommissionEmployee);

			// create four-element Employee array
			Employee[] employees = new Employee[4];

			// initialize array with Employees
			employees[0] = salariedEmployee;
			employees[1] = hourlyEmployee;
			employees[2] = commissionEmployee;
			employees[3] = basePlusCommissionEmployee;

			System.out.printf("******************************%n%n");
			
			// to get the current month dynamically.
			LocalDate currentDate = LocalDate.now();
			int currentMonth = currentDate.getMonthValue();
			
			// generically process each element in array employees.
			for (Employee currentEmployee : employees)
			{
				// if the current month is the birth month of this employee.
				if (currentEmployee.getMonth() == currentMonth)
				{
					// give him/her a bonus.
					System.out.printf("After bonus $100.0, %10s's salary: $%,.2f%n",
							currentEmployee.get1stName() + " " + currentEmployee.getLastName(),
							currentEmployee.earnings() + 100.0);
				}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("%s", e.getMessage());
		}
	}
}