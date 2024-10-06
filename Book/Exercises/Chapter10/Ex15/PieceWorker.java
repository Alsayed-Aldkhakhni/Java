/*
 * File name: PieceWorker.java 
 * 
 * Subject  : Class that represents the employees payed per piece.
 * 
 * Date     : October 3, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 3, 2024
 * 
 * */

public class PieceWorker extends Employee // class declaration.
{
	// instance variables.
	private double wage;
	private int pieces;

	// constructor
	public PieceWorker(String firstName, String lastName,
			String SSN, int month, int day, int year, int pieces, double wage)
	{
		// invoke the father's.
		super(firstName, lastName, SSN, month, day, year);

		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");

		if ((pieces < 0.0)) // validate pieces
			throw new IllegalArgumentException( "Hours worked must be >= 0.0 and <= 168.0");

		// assign the valid data.
		this.wage = wage;
		this.pieces = pieces;
	}

	// set wage
	public void setWage(double wage)
	{
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");

		this.wage = wage;
	}

	// return wage
	public double getWage() { return wage; }

	// set pieces worked
	public void setPieces(int pieces)
	{
		if ((pieces < 0.0) || (pieces > 168.0)) // validate pieces
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168.0");

		this.pieces = pieces;
	}

	// return pieces worked
	public int getPieces() { return pieces; }

	// the worker's getPaymentAmount.
	@Override
	public double getPaymentAmount() { return wage * pieces; }
	
	@Override
	public String toString()
	{
		return super.toString() + String.format("Wage per piece  : $%,.2f%nNumber of pieces: %,d%nTotal payment   : $%,.2f%n",
				                                 getWage(), getPieces(), getPaymentAmount()); 
	}
}


