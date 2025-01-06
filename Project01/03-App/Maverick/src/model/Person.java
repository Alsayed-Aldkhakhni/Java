//==========================================================
// File Name: Person.java
// Subject  : Class Person that presents common attributes.
// Date     : Dec 30, 2024
// Author   : Alsayed A. Khaleel
//==========================================================

package model;
import java.time.LocalDate;
import java.time.Period;

public abstract class Person // class declaration.
{
	// instance variables.
	long personID;
	String firstName;
	String lastName;
	String address;
	String phoneNumber;
	double salary;
	int age;
	Gender gender;
	LocalDate birthDate;
	String password;


	// no argument constructor.
	public Person() {}
	
	// arguments constructor.
	public Person(long id, String fName, String lName,
			      String addr, String phone, double salary, Gender gen, LocalDate date, String passwd)
	{
		setPersonID(id);
		setFirstName(fName);
		setLastName(lName);
		setAddress(addr);
		setPhoneNumber(phone);
		setGender(gen);
		setBirthDate(date);
		setPassword(passwd);
		setSalary(salary);
	}


	// personID setter and getter.	
	public long getPersonID() { return personID; }

	public void setPersonID(long personID) throws IllegalArgumentException 
	{ 
		if(personID <= 0)
			throw new IllegalArgumentException("Invalid perosn id.");
		
		this.personID = personID;
	}
	
	
	// firstName setter and getter.
	public String getFirstName() { return firstName; }

	public void setFirstName(String firstName) throws IllegalArgumentException
	{
		if(! Person.isNameValid(firstName) )
			throw new IllegalArgumentException("Invalid 1st name");
		
		this.firstName = firstName;
	}

	
	// lastName setter and getter.
	public String getLastName() { return lastName; }

	public void setLastName(String lastName) throws IllegalArgumentException
	{
		if(! Person.isNameValid(lastName) )
			throw new IllegalArgumentException("Invalid last name");
		
		this.lastName = lastName;
	}
	

	// address setter and getter.
	public String getAddress() { return address; }

	public void setAddress(String address) throws IllegalArgumentException
	{
		if(! Person.isAddressValid(address))
			throw new IllegalArgumentException("Invalid address.");
		
		this.address = address;
	}

	
	// address setter and getter.
	public String getPhoneNumber() { return phoneNumber; }

	public void setPhoneNumber(String phoneNumber) throws IllegalArgumentException
	{
		if(! isPhoneNumberValid(phoneNumber))
			throw new IllegalArgumentException("Invalid phone number.");
		
		this.phoneNumber = phoneNumber;
	}


	// calculate the age of a person.
	public int getAge() { return age; }
	
	private void setAge(LocalDate birthDate) throws IllegalArgumentException
	{
		int dummy = Period.between(birthDate, LocalDate.now()).getYears();

		if(dummy < 20 || dummy > 60)
			throw new IllegalArgumentException("["+ dummy +"] Invalid person age.");

		age = dummy;
	}


	// birth date setter & getter.
	public LocalDate getBirthDate() { return birthDate; }

	public void setBirthDate(LocalDate birthDate)
	{
		this.birthDate = birthDate;
		this.setAge(birthDate);
	}

	
	// gender setter and getter.
	public void setGender(Gender gender) { this.gender = gender; }

	public Gender getGender() {	return gender; }
	

	// password setter and getter.
	public String getPassword() { return password; }

	public void setPassword(String password) throws IllegalArgumentException
	{
		if(! Employee.isPasswordValid(password))
			throw new IllegalArgumentException("Invalid password");
		
		this.password = password;
	}
	
	
	// salary setter and getter.
	public double getSalary() { return salary; }
	
	public void setSalary(double salary) throws IllegalArgumentException
	{
		if(salary < 0)
			throw new IllegalArgumentException("["+ salary +"] Invalid salary.");
		
		this.salary = salary; 
	}
	
	
	// validate the manager password format.
	public static boolean isPasswordValid(String password) {
		return password.matches("^([aA-zZ]|[0-9]){8,20}$");
	}

	// validate the name.
	public static boolean isNameValid(String name) {
		return name.matches("[A-Z][a-z]{2,10}");
	}
	
	// validate the address.
	public static boolean isAddressValid(String address) {
		return address.matches("[1-9][0-9]{0,3} [aA-zZ]{2,10}( [aA-zZ]{2,10})*");
	}
	
	
	// allows only 010, 011, 012, 015 as a prefix.
	// phone number has a prefix and 11 characters length.
	public static boolean isPhoneNumberValid(String phone){
		return phone.matches("[0][1][0125][0-9]{8}");
	}


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
}

