/*
 * File name: HourlyEmployee.java 
 * 
 * Subject  : Class that represents the employees payed per hour.
 * 
 * Date     : September 30, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : September 30, 2024
 * 
 * */

public class HourlyEmployee extends Employee // class declaration.
{
	// instance variables.
	private double wage; // wage per hour
	private double hours; // hours worked for week
	
	// constructor
	public HourlyEmployee(String firstName, String lastName,
			String SSN, int month, int day, int year, double hours, double wage)
	{
		super(firstName, lastName, SSN, month, day, year);
		
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		
		if ((hours < 0.0) || (hours > 168.0)) // validate hours
			throw new IllegalArgumentException( "Hours worked must be >= 0.0 and <= 168.0");
		
		// assign the valid data.
		this.wage = wage;
		this.hours = hours;
	}
	
	// set wage
	public void setWage(double wage)
	{
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		this.wage = wage;
	}
	
	// return wage
	public double getWage() { return wage; }
	
	// set hours worked
	public void setHours(double hours)
	{
		if ((hours < 0.0) || (hours > 168.0)) // validate hours
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");
		
		this.hours = hours;
	}
	
	// return hours worked
	public double getHours() { return hours; }
	
	// calculate earnings; override abstract method earnings in Employee
	@Override
	public double earnings()
	{
		if (getHours() <= 40) // no overtime
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
	}

	@Override
	public String toString()
	{
		return super.toString() + String.format("wage per hour   : %.2f%nHours worked    : %.2f%nTotal salary    : $%,.2f%n",
				                                 getWage(), getHours(), earnings());
	}
}

