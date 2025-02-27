//=====================================================================
// File Name: Person.java
// Subject  : Class Person that presents persons stored in our system.
// Date     : Dec 30, 2024
// Author   : Alsayed A. Khaleel
//=====================================================================

package model;
import java.time.*;  // import(s) declaration.

public abstract class Person implements Payable, Validatable // class declaration.
{
	// instance variables.
	private long personID;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Gender gender;
	private String address;
	private String phoneNumber;
	private int age;
	private String password;

	// arguments constructor.
	public Person(long id, String fName, String lName,
			      String addr, String phone, Gender gen, LocalDate date, String passwd)
	{
		setPersonID(id);
		setFirstName(fName);
		setLastName(lName);
		setAddress(addr);
		setPhoneNumber(phone);
		setGender(gen);
		setBirthDate(date);
		setPassword(passwd);
	}

	// personID setter and getter.	
	public  long getPersonID() { return personID; }
	public final void setPersonID(long personID) throws IllegalArgumentException 
	{ 
		if(personID <= 0)
			throw new IllegalArgumentException("Invalid person id ["+ personID +"]");
		
		this.personID = personID;
	}
	
	// firstName setter and getter.
	public  String getFirstName() { return firstName; }
	public final void   setFirstName(String firstName) throws IllegalArgumentException
	{
		if(! Validatable.isNameValid(firstName) )
			throw new IllegalArgumentException("[Invalid 1st name ["+ firstName +"]");
		
		this.firstName = firstName;
	}
	
	// lastName setter and getter.
	public  String getLastName() { return lastName; }
	public final void   setLastName(String lastName) throws IllegalArgumentException
	{
		if(! Validatable.isNameValid(lastName) )
			throw new IllegalArgumentException("Invalid last name ["+ lastName +"]");
		
		this.lastName = lastName;
	}
	
	// address setter and getter.
	public String getAddress() { return address; }
	public final void setAddress(String address) throws IllegalArgumentException
	{
		if(! Validatable.isAddressValid(address))
			throw new IllegalArgumentException("Invalid address.["+ address +"]");
		
		this.address = address;
	}
	
	// address setter and getter.
	public String getPhoneNumber() { return phoneNumber; }
	public final void setPhoneNumber(String phoneNumber) throws IllegalArgumentException
	{
		if(! Validatable.isPhoneNumberValid(phoneNumber))
			throw new IllegalArgumentException("Invalid phone number. ["+ phoneNumber +"]");
		
		this.phoneNumber = phoneNumber;
	}

	// calculate the age of a person.
	public  int  getAge() { return age; }
	public final void setAge(LocalDate birthDate) throws IllegalArgumentException
	{
		int dummy = Period.between(birthDate, LocalDate.now()).getYears();

		if(dummy < 20 || dummy > 60)
			throw new IllegalArgumentException("["+ dummy +"] Invalid person age.");

		age = dummy;
	}

	// birth date setter & getter.
	public  LocalDate getBirthDate() { return birthDate; }
	public final void      setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
		this.setAge(birthDate);
	}
	
	// gender setter and getter.
	public final void   setGender(Gender gender) { this.gender = gender; }
	public  Gender getGender() { return gender; }
	

	// password setter and getter.
	public String getPassword() { return password; }
	public final void   setPassword(String password) throws IllegalArgumentException
	{
		if(! Validatable.isPasswordValid(password))
			throw new IllegalArgumentException("Invalid password. ["+ password +"]");
		
		this.password = password;
	}

	// represent the object as a string called by %s.
	@Override
	public String toString()
	{
		return String.format("Person ID : %d%n"+
		 					 "First name: %s%n"+
							 "Last  name: %s%n"+
							 "Address   : %s%n"+
							 "Phone     : %s%n"+
							 "Birth Date: %s%n"+
							 "Age       : %d%n"+
							 "Gender    : %s%n",
							  getPersonID(), getFirstName(), getLastName(),
							  getAddress(), getPhoneNumber(), getBirthDate().toString(),
							  getAge(), getGender().toString());
	}
	
	// print the personal data of the person.
	public void viewPersonalData()
	{
		// it has to be with the GUI.
		this.toString();
	}
}
