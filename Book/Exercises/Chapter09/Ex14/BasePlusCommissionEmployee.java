/*
 * File name : BasePlusCommissionEmployee.java
 *
 * Subject   : Class that emulates base plus commission employees.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */

// BasePlusCommissionEmployee is-a CommissionEmployee.
public class BasePlusCommissionEmployee extends CommissionEmployee // class declaration.
{
	private double baseSalary; // base salary per week

	// six-argument constructor
	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate, double baseSalary)
	{
		// call the parent's class constructor to construct it instance part.
		super(firstName, lastName, SSN, grossSales, commissionRate);
		
		// if baseSalary is invalid throw exception 
		if (baseSalary < 0.0)
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// set base salary
	public void setBaseSalary(double baseSalary)
	{
		if (baseSalary < 0.0) // avoid negative salary.
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		
		this.baseSalary = baseSalary;
	}
	
	// return base salary
	public double getBaseSalary() {	return baseSalary; }
	
	@Override // indicates that this method overrides a superclass method
	public double earnings()
	{
		return baseSalary + (getCommissionRate() * getGrossSales());
	}
	
	//return String representation of BasePlusCommissionEmployee
	@Override
	public String toString()
	{
		return super.toString() + String.format("base salary    : $%,.2f%n", baseSalary);
	}
}



