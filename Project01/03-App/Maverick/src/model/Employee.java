//==========================================================
// File Name: Employee.java
// Subject  : Emulates employee entity.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//===========================================================

package model;
import java.time.LocalDate;

public class Employee extends Person // class declaration.
{
	// local instance variable.
	private String jobTitle;
	private String workingDepartment;
	private double ratePerHour;
	private long empID;
	

	// no argument constructor.
	public Employee() { super(); }
	
	// arguments constructor.
	public Employee(long id, String fName, String lName, String addr, String phone, Gender gen,
				    LocalDate date, long empID, String dpt, String jTitle, double ratePerHour, String passwd)
	{
		super(id, fName, lName, addr, phone, 0, gen, date, passwd);
		setEmpID(empID);
		setWorkingDepartment(dpt);
		setJobTitle(jTitle);
		setRatePerHour(ratePerHour);
	}


	// setter and getter of jobTitle.
	public void setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
	
	public String getJobTitle() { return jobTitle; }


	// workingDpt setter and getter.
	public String getWorkingDepartment() { return workingDepartment; }

	public void setWorkingDepartment(String workingDepartment)
	{
		workingDepartment = workingDepartment.toUpperCase();
		this.workingDepartment = workingDepartment;
	}


	// empID mutator & accessor.
	public long getEmpID() { return empID; }

	public void setEmpID(long empID) throws IllegalArgumentException
	{
		if(empID <= 0)
			throw new IllegalArgumentException("["+ getEmpID() + "] Invalid employee ID.");

		this.empID = empID;
	}
	
	
	// will return the hours from the DB.
	public double getWorkedHours() { return 0.0; }
	
	// calculate the salary of the employee.
	public double calculateSalary()
	{
		super.setSalary(getWorkedHours() * getRatePerHour());
		return super.getSalary();
	}
	
	
	// ratePerHour utils.
	public double getRatePerHour() { return ratePerHour; }

	public void setRatePerHour(double ratePerHour) throws IllegalArgumentException
	{
		if(ratePerHour <= 0.0)
			throw new IllegalArgumentException("["+ ratePerHour +"] Invalid rate.");
		
		this.ratePerHour = ratePerHour;
	}

	
	@Override
	public String toString()
	{
		return super.toString() + 
		String.format("EmpID     : %d%n" +
					  "Works At  : %s%n" +
					  "Hours work: %,.2f%n"+
					  "Rate/Hour : $%,.2f%n" +
					  "Salary    : $%,.2f%n"+
					  "Job Title : %s%n" +
					  "Password  : %s%n",
					  getEmpID(), getWorkingDepartment(), getWorkedHours(),
					  getRatePerHour(), getSalary(), getJobTitle(), getPassword());
	}
}

