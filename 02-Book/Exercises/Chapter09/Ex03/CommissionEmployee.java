/*
 * File name : CommissionEmployee.java
 *
 * Subject   : Class that emulates commission employees.
 *
 * Date      : September 22, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 25, 2024
 *
 * */


public class CommissionEmployee    // class declaration.
{
	private final String firstName;// employee's first name.
	private final String lastName; // employee's last name.
	private final String SSN;      // social security number.
	private double grossSales;     // gross weekly sales
	private double commissionRate; // commission percentage
 
	// five-argument constructor.
	public CommissionEmployee(String firstName, String lastName, String SSN, double grossSales, double commissionRate)
	{
		// if grossSales is invalid throw exception.
		if (grossSales < 0.0)
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		
		// if commissionRate is invalid throw exception.
		if (commissionRate <= 0.0 || commissionRate >= 100.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 100.0");
		
		// so far so good.
		this.firstName = firstName;
		this.lastName = lastName;
		this.SSN = SSN;
		this.grossSales = grossSales;
		this.commissionRate = commissionRate / 100.0;
	}
	
	//return first name
	public String get1stName() { return firstName; }
	
	//return last name
	public String getLstName() { return lastName; }
	
	//return social security number
	public String getSSN() { return SSN; }
	
	// set commission rate.
	public void setCommissionRate(double commissionRate)
	{
		if (commissionRate <= 0.0 || commissionRate >= 100.0)
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 100.0");
		
		this.commissionRate = commissionRate;
	}
	
	// return commission rate.
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

	// calculate earnings.
	public double earnings() { return getCommissionRate() * getGrossSales(); }

	// a string representation about the object's content.
	@Override // flags the compiler that i am overriding the parent's toString(), stay alert.
	public String toString()
	{
		return	String.format("Employee name  : %s%nEmployee SSN   : %s%nGross Sales    : $%,.2f%nEmplo-earnings : $%.1f%n"+
				              "Commission rate: %,.2f%s%n", get1stName() + " " + getLstName(), getSSN(), getGrossSales(),
				               earnings(), getCommissionRate()*100.0, "%");
	}
}


