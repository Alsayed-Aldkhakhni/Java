//==========================================================
// File Name: Dependent.java
// Subject  : Class that emulates the employee's dependents.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//==========================================================

package model;

// import declaration.
import java.time.LocalDate;
import java.time.Period;

public class Dependent implements Validatable// class declaration.
{
	// instance variables.
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	private Relationship relationship;
	private long personID;

	// no argument constructor.
	public Dependent() { super(); }

	public Dependent(long personID, String fName, String lName,
			         LocalDate date, Gender gen, Relationship rel)
	{
		setPersonID(personID);
		setFirstName(fName);
		setLastName(lName);
		setBirthDate(date);
		setGender(gen);
		setRelationship(rel);
	}
	
	// firstName setter and getter.
	public String getFirstName() { return firstName; }

	public void setFirstName(String firstName) throws IllegalArgumentException
	{
		if(! Validatable.isNameValid(firstName) )
			throw new IllegalArgumentException("Invalid 1st name");
		
		this.firstName = firstName;
	}
	
	// lastName setter and getter.
	public String getLastName() { return lastName; }

	public void setLastName(String lastName) throws IllegalArgumentException
	{
		if(! Validatable.isNameValid(lastName) )
			throw new IllegalArgumentException("Invalid last name");
		
		this.lastName = lastName;
	}

	// birth date accessors.
	public LocalDate getBirthDate() { return birthDate; }

	public void setBirthDate(LocalDate BirthDate) {
		this.birthDate = BirthDate;
	}
	
	// gender setter and getter.
	public void setGender(Gender gender) { this.gender = gender; }
	public Gender getGender() {	return gender; }
	
	// setting the relationship between the employee and their dependents (if any).
	public String getRelationship() { return relationship.toString(); }

	public void setRelationship(Relationship relationship){
		this.relationship = relationship;
	}
	
	// the independent id.
	public long getPersonID() { return personID; }
	public void setPersonID(long personID) throws IllegalArgumentException
	{
		/*
		 * This method must access the database
		 * and check the id before assigning.
		 */
		this.personID = personID;
	}
	
	// calculate the age of a person.
	public int getAge() { return Period.between(getBirthDate(), LocalDate.now()).getYears(); }
}
