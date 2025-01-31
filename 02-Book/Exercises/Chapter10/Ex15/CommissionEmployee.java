/*
 * File name: CommissionEmployee.java 
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

public class CommissionEmployee extends Employee // class declaration.
{
	// instance variables.
	private double grossSales;     // gross weekly sales
	private double commissionRate; // commission percentage
	
	// constructor
	public CommissionEmployee(String firstName, String lastName, String SSN, int month,
			                  int day, int year, double grossSales, double commissionRate)
	{
		// invoke the superclass' constructor to built its own part.
		super(firstName, lastName, SSN, month, day, year);
		
		if (commissionRate <= 0.0 || commissionRate >= 100.0) // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 100.0");
		
		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales     = grossSales;
		this.commissionRate = commissionRate;
	}
	
	// set gross sales amount
	public void setGrossSales(double grossSales)
	{
		if (grossSales < 0.0) // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		this.grossSales = grossSales;
	}
	
	// return gross sales amount.
	public double getGrossSales() { return grossSales; }
	
	// set commission rate.
	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 100.0) // validate
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		
		this.commissionRate = commissionRate;
	}
	
	// return commission rate.
	public double getCommissionRate() { return commissionRate; }
	
	// calculate getPaymentAmount; override abstract method getPaymentAmount in Employee.
	@Override
	public double getPaymentAmount() { return getCommissionRate() / 100.0 * getGrossSales(); }
	
	// return String representation of CommissionEmployee object.
	@Override
	public String toString()
	{
		return super.toString() + String.format("Gross sales     : $%,.2f%nComm-Rate       : %.2f%s%nTotal Salary    : $%,.2f%n",
				                                 getGrossSales(), getCommissionRate(), "%", getPaymentAmount());
	}
}


