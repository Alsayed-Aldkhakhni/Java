//==========================================================
// File Name: Department.java
// Subject  : Class Department that emulates the Department.
// Date     : Jan 6, 2025
// Author   : Alsayed A. Khaleel
//==========================================================

package model;
import java.time.LocalDate;

public class Department // class declaration.
{
	// instance variable.
	private long dptID;
	private DptsNames dptName;
	private long mgrID;
	private String dptLoc;
	private LocalDate mgrStartDate;
	
	
	// no-arg ctor.
	public Department() {}
	
	// argument ctor.
	public Department(long dptID, DptsNames dptName, long mgrID, String dptLoc, LocalDate mgrStartDate)
	{
		setDptID(dptID);
		setDptName(dptName);
		setMgrID(mgrID);
		setDptLoc(dptLoc);
		setMgrStartDate(mgrStartDate);
	}
	
	// department id.
	public long getDptID() { return dptID; }
	public void setDptID(long dptID) throws IllegalArgumentException
	{
		if(dptID <= 0)
			throw new IllegalArgumentException("["+ dptID +"] Invalid ID");
		
		this.dptID = dptID;
	}
	
	
	// department name.
	public String getDptName() { return dptName.toString(); }
	public void setDptName(DptsNames dptName) { this.dptName = dptName; }
	
	
	// department manager id.
	public long getMgrID() { return mgrID; }
	public void setMgrID(long mgrID)
	{
		/*
		 * You have to check from this id from
		 * the database before assigning it.
		 */
		this.mgrID = mgrID;
	}
	
	
	// department location.
	public String getDptLoc() { return dptLoc; }
	public void setDptLoc(String dptLoc) { this.dptLoc = dptLoc; }
	
	
	// manager start date.
	public LocalDate getMgrStartDate() { return mgrStartDate; }
	public void setMgrStartDate(LocalDate mgrStartDate) { this.mgrStartDate = mgrStartDate; }	
	
	
	// call implicitly if the object called by %s.
	@Override
	public String toString()
	{
		return String.format("Department ID  : %d%n"+
							 "Department Name: %s%n"+
							 "Department Loc : %s%n"+
							 "Manager ID     : %d%n"+
							 "Mgr Start Date : %s%n",
							 getDptID(), getDptName(), getDptLoc(), getMgrID(), getMgrStartDate());
		
	}
}

