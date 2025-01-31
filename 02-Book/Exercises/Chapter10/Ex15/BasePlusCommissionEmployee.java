/*
 * File name: BasePlusCommissionEmployee.java 
 * 
 * Subject  : Class that emulates employees take commissions.
 * 
 * Date     : September 30, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : September 30, 2024
 * 
 * */

public class BasePlusCommissionEmployee extends CommissionEmployee // class declaration.
{
	// instance variable.
	private double baseSalary;
	
	// 9-arg constructor.
	public BasePlusCommissionEmployee(String firstName, String lastName, String SSN,
			                          int month, int day, int year,	double grossSales,
			                          double commissionRate, double baseSalary)
	{
		// invoke the father's constructor to build its own part of the object.
		super(firstName, lastName, SSN, month, day, year, grossSales, commissionRate);
		
		if(baseSalary <= 0) // validate the salary.
			throw new IllegalArgumentException("Invalid salary, it must be > 0");
		
		this.baseSalary = baseSalary;
	}

	// modify the baseSalary.
	public void setBaseSalary(double baseSalary)
	{
		if(baseSalary <= 0)
			throw new IllegalArgumentException("Invalid salary, it must be > 0");
	
		this.baseSalary = baseSalary; 
	}
	
	// retrieve the value of baseSalary.
	public double getBaseSalary() { return baseSalary; }
	
	// this employee getPaymentAmount method.
	@Override
	public double getPaymentAmount() { return getBaseSalary() + super.getPaymentAmount(); }
	
	@Override
	public String toString()
	{
		return super.toString() + String.format("Base Salary     : $%,.2f%n", getBaseSalary());
	}
	
}


