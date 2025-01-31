/*
 * File name : Employee.java
 *
 * Subject   : Class that emulates Employees.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */

public class Employee // class declaration.
{
	// instance variables.
	private final String firstName;
	private final String lastName;
	private final String SSN;   // social security number.
	
	// 3-argument constructor.
	public Employee(String firstName, String lastName, String SSN)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
	}

	// some getters to retrieve the the attributes' values. 
	public String get1stName() { return this.firstName; }
	public String getLstName() { return this.lastName; }
	public String getSSN() { return this.SSN; }
	
	@Override
	public String toString()
	{
		return String.format("First name     : %s%nLast name      : %s%nSocial Number  : %s%n",
				              get1stName(), getLstName(), getSSN());
	}
}







