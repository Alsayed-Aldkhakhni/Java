/*
 * File name: SalariedEmployee.java 
 * 
 * Subject  : Class that emulates the employee who payed a fixed salary.
 * 
 * Date     : September 30, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : September 30, 2024
 * 
 * */


public class SalariedEmployee extends Employee // class declaration
{
	// instance variable.
	private double weeklySalary;
	
	// 7-argument constructor.
	public SalariedEmployee(String fName, String lName, String SSN,
			                int month, int day, int year, double weeklySalary)
	{
		// invoke the father's constructor to construct its own object part.
		super(fName, lName, SSN, month, day, year);
		
		if(weeklySalary <= 0) // simple validation.
			throw new IllegalArgumentException("Invalid salary is must be > 0");
		
		// assign the valid value.
		this.weeklySalary = weeklySalary;
	}

	// assign a new salary to the employee.
	public void setWeeklySalary(double weeklySalary)
	{
		if(weeklySalary <= 0) // simple validation.
			throw new IllegalArgumentException("Invalid salary is must be > 0");
		
		// assign the valid value.
		this.weeklySalary = weeklySalary;
	}
	
	// return the salary of a month.
	public double getWeeklySalary() { return weeklySalary; }
	
	@Override // tells the compiler that we are overriding a superclass' method.
	public double earnings() { return getWeeklySalary() *  4.0; }
	
	// a string representation of the current object.
	@Override
	public String toString()
	{
		return super.toString() + String.format("Salary per month: $%,.2f%n", earnings());
	}
}


