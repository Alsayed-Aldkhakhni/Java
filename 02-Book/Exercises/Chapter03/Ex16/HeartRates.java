/*
 * File name: HeartRates.java
 *
 * Subject: A class that presents heart rates monitor.
 *
 * Date: August 6, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [7:15 PM]
 *
 * */

public class HeartRates // class declaration.
{
	// instance varibales.
	private String fName;
	private String lName;

	// date of birth parts.
	private int month;
	private int day;
	private int year;

	// constructor.
	public HeartRates(String fName, String lName, int month, int day, int year)
	{
		this.fName = fName;
		this.lName = lName;
	
		// month validation.
		if(month <= 0)
			System.out.println("Invalid month.");

		if(month > 12)
			System.out.println("Invalid month.");

		if(month > 0)
			if(month <= 12)
				this.month = month;
		
		// day validation.
		if(day <= 0)
			System.out.println("Invalid day.");

		if(day > 31)
			System.out.println("Invalid day.");

		if(day > 0)
			if(day <= 31)
				this.day = day;

		// the year.
		if(year <= 0)
			System.out.println("Invalid year.");

		if(year > java.time.LocalDate.now().getYear())
			System.out.println("Invalid year.");

		if(year > 0)
			if(year <= java.time.LocalDate.now().getYear())
				this.year = year;
	}

	// mutators.
	public void set1stName(String name) { fName = name;}
	public void set2ndName(String name) { lName = name;}
	public void setMonth(int month)
       	{
		if(month <= 0)
			System.out.println("Invalid month.");

		if(month > 12)
			System.out.println("Invalid month.");

		if(month > 0)
			if(month <= 12)
				this.month = month;
	}

	public void setDay(int day)
       	{
		if(day <= 0)
			System.out.println("Invalid day.");

		if(day > 31)
			System.out.println("Invalid day.");

		if(day > 0)
			if(day <= 31)
				this.day = day;
	}

	public void setYear(int year)
       	{
		if(year <= 0)
			System.out.println("Invalid year.");

		if(year > java.time.LocalDate.now().getYear())
			System.out.println("Invalid year.");

		if(year > 0)
			if(year <= java.time.LocalDate.now().getYear())
				this.year = year;
	}

	// accessors.
	public String get1stName() { return fName; }
	public String get2ndName() { return lName; }

	public int getMonth() { return month;}
	public int getDay()   { return day; }
	public int getYear()  { return year;}

	public int getAge() { return java.time.LocalDate.now().getYear() - year; }
	public int getMaxRate() { return 220 - getAge(); }
	public double getTargetRate() { return 70.0/100.0 * getMaxRate(); }
}
