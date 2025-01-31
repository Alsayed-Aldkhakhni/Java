/*
 * File name : BasePlusCommissionEmployee.java
 *
 * Subject   : Class that emulates commission employees who has a base salary.
 *
 * Date      : September 25, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 25, 2024
 *
 * */

// BasePlusCommissionEmployee has-a commissionEmployee.
public class BasePlusCommissionEmployee // class declaration.
{
	private double baseSalary;          // base salary per week
	CommissionEmployee commissionEmp;   // the commission part.
	
	// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales,	double commissionRate, double baseSalary)
	{
		// make an object an reference to it by commissionEmp variable.
		commissionEmp = new CommissionEmployee(firstName, lastName, SSN, grossSales, commissionRate);
		
		// if baseSalary is invalid throw exception
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() { return baseSalary; }
	
	// calculate earnings
	public double earnings()
	{
		return getBaseSalary() + commissionEmp.earnings();
	}
	
	// return String representation of BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return commissionEmp.toString() + String.format("base-salaried  : $%,.2f", getBaseSalary());
	}
}