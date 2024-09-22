/*
 * File name : HourlyEmployee.java
 *
 * Subject   : Class that emulates HourlyEmployees.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */

public class HourlyEmployee extends Employee // class declaration.
{
	// instance variables.
	private double hours;
	private double wage;
	
	// 5-argument constructor to accept supplied arguments.
	public HourlyEmployee(String firstName, String lastName, String SSN, double hours, double wage)
	{
		super(firstName, lastName, SSN);// calls the father's constructor to built its instance.
		
		if(hours <= 0 || hours > 168)   // simple validation.
			throw new IllegalArgumentException(hours + " is invalid hours.");
		
		if(wage <= 0)                   // also a simple validation.
			throw new IllegalArgumentException(wage + " is invalid wage.");
			
		// so far so good :-)
		this.hours = hours;
		this.wage = wage;
	}

	// set the rules to accept that input.
	public void setHours(double hours)
	{
		if(hours <= 0 || hours > 168)   // simple validation.
			throw new IllegalArgumentException(hours + " is invalid hours.");
		
		this.hours = hours;
	}
	
	// modify the wage according to our specifications.
	public void setWage(double wage)
	{
		if(wage <= 0)     // also a simple validation.
			throw new IllegalArgumentException(wage + " is invalid wage.");
		
		this.wage = wage;
	}
	
	// return the values of hours and wage.
	public double getHours() { return this.hours; }
	public double getWage()  { return this.wage; }
	
	// calculate the earnings of this employee. 
	public double earnings()
	{
		return getHours	> 40 ? ((getHours() - 40) * 1.5 * getWage()) + (40 * getWage()) : getHours() * getWage();
	}
	
	// return a sting representation of the instances data.
	@Override // flags the compiler that we are overriding an inherited method.
	public String toString()
	{
		return super.toString() + String.format("Employee hours: %.2f%nwage per hour : %,.2f%nTotal earnings: $%,.2f%n",
				                                 getHours(), getWage(), earnings());
	}
}

