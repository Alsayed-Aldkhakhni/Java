/*
 * File name : CommissionEmployee.java
 *
 * Subject   : Class that emulates commission employees.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 22, 2024
 *
 * */

// class CommissionEmployee inherits class Employee.
// CommissionEmployee is-an employee.
public class CommissionEmployee extends Employee // class declaration.
{
	// child's instance variables.
	private double commissionRate;
	private double grossSales;
	
	// child's constructor.
	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate)
	{
		// parent's ctor to construct it's part of the object.
		super(firstName, lastName, SSN);
		
		// if grossSales is invalid throw exception.
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		// if commissionRate is invalid throw exception.
		if (commissionRate < 0.0 || commissionRate > 100)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 100");

		// set the valid values.
		this.grossSales = grossSales;
		this.commissionRate = commissionRate / 100.0;
	}

	// Modifying the commission rate.
	public void setCommissionRate(double commissionRate)
	{
		if(commissionRate < 0.0 || commissionRate > 100.0) // simple validation.
			throw new IllegalArgumentException(commissionRate + " is not a valid rate, it must be [0.0, 100.0]");
		
		// assign the valid value.
		this.commissionRate = commissionRate;
	}
	
	// retrieving the commission rate.
	public double getCommissionRate() { return commissionRate; }
	
	// Modifying the gross sales.
	public void setGrossSales(double grossSales)
	{
		if(grossSales < 0.0) // simple validation.
			throw new IllegalArgumentException(grossSales + " is not a valid sales.");
		
		// assign the valid value.
		this.grossSales = grossSales;
	}
	
	// retrieving the gross sales.
	public double getGrossSales() { return grossSales; }
	
	// calculate the earnings.
	public double earnings() { return getCommissionRate() * getGrossSales(); }
	
	@Override
	public String toString()
	{
		// invoke the parent's toString() and complete the rest here.
		return	super.toString() + String.format("Gross Sales    : $%,.2f%nCommission rate: %.1f%s%n"
												+"Emplo-earnings : $%,.2f%n",
				                                  getGrossSales(), getCommissionRate()*100.0, "%", earnings());
	}
}




