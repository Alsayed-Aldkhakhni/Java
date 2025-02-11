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

	// default constructor.
	public Manager() { super(); } 

	// arguments constructor.
	public Manager(int id, String fName, String lName, String addr, String phone,
			       Gender gen, LocalDate date, double salary, String dpt, String email, String passwd)
	{
		super(id, fName, lName, addr, phone, salary, gen, date, passwd);
		
		setManagedDpt(dpt);
		setEmail(email);
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
	public void setManagedDpt(String managedDpt) throws IllegalArgumentException
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


	// print  the object while
	// it is called using [%s].
	@Override
	public String toString() {
		return super.toString() +
		String.format("Salary    : $%,.2f%n"+
					  "Email     : %s%n"+
					  "Password  : %s%n"+
					  "Manages   : %s%n", 
		              getSalary(), getEmail(), getPassword(), getManagedDpt());
	}
	
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
