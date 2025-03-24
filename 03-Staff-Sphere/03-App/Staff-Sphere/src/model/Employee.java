//==========================================================
// File Name: Employee.java
// Subject  : Emulates employee entity.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//==========================================================

package model;
import java.time.LocalDate;

public class Employee extends Person implements Comparable <Employee> // class declaration.
{
	// local instance variable.
	private String jobTitle;
	private String workingDepartment;
	private double ratePerHour;
	private double workedHours;
	private long empID;
	
	// arguments constructor.
	public Employee(long id, String fName, String lName, String addr,
					String phone, Gender gen, LocalDate date, String passwd,
					long empID, String dpt, String jobTitle, double workedHours, double ratePerHour)
	{
		super(id, fName, lName, addr, phone, gen, date, passwd);
		setEmpID(empID);
		setWorkingDepartment(dpt);
		setJobTitle(jobTitle);
		setWorkedHours(workedHours);
		setRatePerHour(ratePerHour);
	}

	// setter and getter of jobTitle.
	public void   setJobTitle(String jobTitle) { this.jobTitle = jobTitle; }
	public String getJobTitle() { return jobTitle; }

	// workingDpt setter and getter.
	public String getWorkingDepartment() { return workingDepartment; }
	public void   setWorkingDepartment(String workingDepartment)
	{
		// must access the database and match this dpt and the available ones.
		//workingDepartment = workingDepartment.toUpperCase();
		//this.workingDepartment = workingDepartment;
	}

	// empID mutator & accessor.
	public long getEmpID() { return empID; }
	public void setEmpID(long empID) throws IllegalArgumentException
	{
		if(empID <= 0)
			throw new IllegalArgumentException("["+ empID + "] Invalid employee ID.");

		this.empID = empID;
	}
	
	// ratePerHour.
	public double getRatePerHour() { return ratePerHour; }
	public void   setRatePerHour(double ratePerHour) throws IllegalArgumentException
	{
		if(ratePerHour <= 0.0)
			throw new IllegalArgumentException("["+ ratePerHour +"] Invalid rate.");
		
		this.ratePerHour = ratePerHour;
	}
	
	// worked hours services.
	public double getWorkedHours() { return workedHours; }
	public void   setWorkedHours(double workedHours) throws IllegalArgumentException
	{
		// calculate the total hours for the employee
		// he worked in the month.
		if(workedHours < 0.0 || workedHours > (4*168))
			throw new IllegalArgumentException("Invalid number of hours ["+ workedHours +"] ");
		
		this.workedHours = workedHours;
	}
	
	@Override
	public double earnings() { return getWorkedHours() * getRatePerHour(); }
	
	// call the object in one step using %s.
	@Override
	public String toString()
	{
		return super.toString() + 
			   String.format(
				      "EmpID     : %d%n" +
					  "Works At  : %s%n" +
					  "Hours work: %,.2f%n"+
					  "Rate/Hour : $%,.2f%n" +
					  "Salary    : $%,.2f%n"+
					  "Job Title : %s%n" +
					  "Password  : %s%n",
					  getEmpID(), getWorkingDepartment(), getWorkedHours(),
					  getRatePerHour(), earnings(), getJobTitle(), getPassword());
	}

	// to sort a list of employees.
	@Override
	public int compareTo(Employee emp)
	{
		return (int)(getEmpID() - emp.getEmpID());
	}
	
	public void requestVacation(Vacation vacation)
	{

	}

	public void viewTasks()
	{
		

	}

	public void viewVacationStatus()
	{

	}
}