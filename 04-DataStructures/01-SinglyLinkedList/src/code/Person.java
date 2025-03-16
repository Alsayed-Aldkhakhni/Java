/*
 * File name: Person.java
 * 
 * Subject  : Simple class that emulates person.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Person // class declaration.
{
	// instance variables.
	private String SSN;
	private String firstName;
	private String lastName;
	private int age;
	
	// constructor to build the object.
	public Person(String SSN, String firstName, String lastName, int age)
	{
		// validate the input.
		setSSN(SSN);
		set1stName(firstName);
		set2ndName(lastName);
		setAge(age);
	}
	
	// validate the person's age.
	private void setAge(int age) throws IllegalArgumentException
	{
		if(age <= 0 || age >= 120)
			throw new IllegalArgumentException(age +", Invalid age.");
		
		this.age = age;
	}
	
	// validate the person's SSN.
	private void setSSN(String SSN) throws IllegalArgumentException
	{
		if(SSN.matches("\\d{5}"))
			this.SSN = SSN;
		else
			throw new IllegalArgumentException(SSN + ", Invalid SSN.");
	}

	// validate the person's name [first or last].
	private void set1stName(String firstName) throws IllegalArgumentException
	{
		if(firstName.matches("\\w{2,10}"))
			this.firstName = firstName;
		else
			throw new IllegalArgumentException(firstName +", Invalid name.");
	}
	
	private void set2ndName(String lastName) throws IllegalArgumentException
	{
		if(lastName.matches("[a-zA-Z]{2,10}"))
			this.lastName = lastName;
		else
			throw new IllegalArgumentException(lastName +", Invalid name.");
	}
	
	// getters of the instance variables.
	public String getSSN() { return SSN; };
	public int    getAge() { return age; }
	public String getFullName() { return firstName + ", " + lastName; }
	
	// Person string representation.
	@Override
	public String toString()
	{
		return String.format("Person SSN : %s%n"+
				             "Person Name: %s%n"+
				             "Person age : %d%n", getSSN(), getFullName(), getAge());
	}
}
