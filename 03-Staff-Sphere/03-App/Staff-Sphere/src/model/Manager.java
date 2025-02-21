//==========================================================
// File Name: Manager.java
// Subject  : Class Manager that represents manager entity.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//===========================================================

package model;
import java.time.LocalDate;

public class Manager extends Person // class declaration.
{
	// instance variables.
	private String email;
	private String managedDpt;
	private double salary;
	
//	public Person(long id, String fName, String lName,
//		      String addr, String phone, Gender gen, LocalDate date, String passwd)
	
	// arguments constructor.
	public Manager(long id, String fName, String lName, String addr, String phone,
			       Gender gen, LocalDate date, String passwd, double salary, String dpt, String email)
	{
		super(id, fName, lName, addr, phone, gen, date, passwd);
		
		setManagedDpt(dpt);
		setEmail(email);
		setSalary(salary);
	}

	// email setter and getter.
	public String getEmail() { return email; }
	public void setEmail(String email) throws IllegalArgumentException
	{
		if (! isEmailValid(email))
			throw new IllegalArgumentException("Invlaid email");

		this.email = email;
	}


	// department setter and getter.
	public String getManagedDpt() {	return managedDpt; }
	public void   setManagedDpt(String managedDpt) throws IllegalArgumentException
	{
		if(! isDeptValid(managedDpt))
			throw new IllegalArgumentException("Invalid department format.");
		
		this.managedDpt = managedDpt;
	}


	// validate the manager email format.
	public boolean isEmailValid(String email)
	{
		// manager email format: department.manager.mgrName@companyName.com
		return email.matches(getManagedDpt() + ".manager." + getFirstName().toLowerCase() + "@ABC.com");
	}


	// validate the manager's salary.
	public void setSalary(double salary)
	{
		if(salary <= 0.0 || salary >= Double.MAX_VALUE)
			throw new IllegalArgumentException("Invalid salary ["+ salary +"]");
		
		this.salary = salary;
	}
	
	@Override
	public double earnings() { return salary; }
	
	// print  the object while
	// it is called using [%s].
	@Override
	public String toString() {
		return super.toString() +
		String.format("Salary    : $%,.2f%n"+
					  "Email     : %s%n"+
					  "Password  : %s%n"+
					  "Manages   : %s%n", 
		              earnings(), getEmail(), getPassword(), getManagedDpt());
	}
	
	/* DB related functions. */
	
	// validate the department.
	public static boolean isDeptValid(String dpt) {
		
		// must access the database.
		return true;
	}
	
	public void assignTask(Task task) {
		// take the task information and assign them in DB.
	}

	public void viewDptData() {
		// Retrieve the data from the database.
	}

	public void respondOnVacationReqs() {
		// fetch the vacations and print them.
	}

	public void generateReportOfDpt() {
		// fetch the data and print them on a file.
	}
}

