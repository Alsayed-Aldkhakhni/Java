//==========================================================
// File Name: Vacation.java
// Subject  : Represents the vacation requested by employees.
// Date     : Jan 23, 2025
// Author   : Alsayed A. Khaleel
//===========================================================

// make all classes visible to each other.
package model;

// import declaration.
import java.time.DateTimeException;
import java.time.LocalDate;

public class Vacation // class declaration.
{
	// instance variables.
	private long vacationID;
	private long requesterID;
	private int numberOfDays;
	private LocalDate startDate;
	private LocalDate endDate;
	private String causes;
	
	
	// no argument constructor.
	public Vacation() {} 
	
	
	// 4 arguments constructor.
	public Vacation(long vacationID, long requesterID, int numberOfDays, String causes)
	{
		setVacationID(vacationID);
		setNumberOfDays(numberOfDays);
		setCauses(causes);
	}

	
	// the vacation id.
	public long getVacationID() { return vacationID; }
	public void setVacationID(long vacationID)  throws IllegalArgumentException
	{
		if(vacationID <= 0)
			throw new IllegalArgumentException("Invalid vacation ID [" + vacationID +"] ");
		
		this.vacationID = vacationID;
	}

	
	// the period that the employee will take.
	public int getNumberOfDays() { return numberOfDays; }
	public void setNumberOfDays(int numberOfDays) throws IllegalArgumentException
	{
		if(numberOfDays <= 0)
			throw new IllegalArgumentException("Invalid number of days for this vacation ["+ numberOfDays +"] ");
		
		this.numberOfDays = numberOfDays;
	}

	
	// the vacation start day.
	public LocalDate getStartDate() { return startDate; }
	public void setStartDate(LocalDate startDate) throws DateTimeException
	{
		this.startDate = startDate;
	}

	
	// the vacation end day.
	public LocalDate getEndDate() { return endDate; }
	public void setEndDate(LocalDate endDate) throws DateTimeException
	{
		this.endDate = endDate;
	}

	
	// the vacation causes.
	public String getCauses() { return causes; }
	public void setCauses(String causes) { this.causes = causes; }


	// the requester of this vacation.
	public long getRequesterID() { return requesterID; }
	public void setRequesterID(long requesterID) throws IllegalArgumentException
	{
		if(requesterID <= 0)
			throw new IllegalArgumentException("Invalid requester id ["+ requesterID +"] ");
		
		// must access the database to see if this employee really exists.
		this.requesterID = requesterID;
	}
}
