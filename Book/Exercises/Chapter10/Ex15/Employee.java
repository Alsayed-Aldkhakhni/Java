/*
 * File name: Employee.java 
 * 
 * Subject  : Class that emulates the employee.
 * 
 * Date     : September 30, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : September 30, 2024
 * 
 * */

public abstract class Employee implements Payable // class declaration.
{
	// instance members.
	private final String firstName;
	private final String lastName;
	private final String SSN;
	private final Date dateOfBirth;
	
	// constructor
	public Employee(String firstName, String lastName, String SSN, int month, int day, int year)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		dateOfBirth = new Date(month, day, year);
	}

	// return first name
	public String get1stName() { return firstName; }

	// return last name
	public String getLastName()  { return lastName; }

	// return social security number
	public String getSSN() { return SSN;}

	public int getMonth () { return dateOfBirth.getMonth(); }
	
	// return String representation of Employee object
	@Override
	public String toString() {
		return String.format("Employee name   : %s%nScoial Security : %s%nDate of birth   : %s%n", get1stName() + " " + getLastName(),
				getSSN(), dateOfBirth);
	}
}