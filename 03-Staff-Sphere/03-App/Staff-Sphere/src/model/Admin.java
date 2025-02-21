//==========================================================
// File Name: Admin.java
// Subject  : Admin class that emulates administrator entity.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//==========================================================

package model;
import java.time.LocalDate;

public class Admin extends Person // class declaration.
{
	// instance variables.
	private String email;
	private double salary;
	
	// arguments constructor.
	public Admin(long id, String fName, String lName,
			     String addr, String phone, Gender gen,
			     LocalDate date, double salary, String email, String passwd)
	{
		super(id, fName, lName, addr, phone, gen, date, passwd);
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

	// validate the manager email format.
	public boolean isEmailValid(String email)
	{
		// admin email format: admin.adminName@companyName.com
		return email.matches("admin." + getFirstName().toLowerCase() + "@"+ companyName +".com");
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
	
	@Override
	public String toString()
	{
		return super.toString() + 
		String.format("Salary    : $%,.2f%n"+
					  "Email     : %s%n"+
					  "Password  : %s%n",
					  earnings(), getEmail(), getPassword());
	}
	
	/* DB related methods. */
	public void addEmployee(Employee emp) {}
	public void updateEmployee(long empID) {}
	public void deleteEmployee(long empID) {}
	public void addDepartment(Department dpt) {}
	public void updateDepartment(long dptID) {}
	public void deleteDepartment(long dptID) {}

	@Override
	public void viewPersonalData() {}
	
	public void generateSystemReport()
	{
		// will use file to generate those reports.
	}
}
