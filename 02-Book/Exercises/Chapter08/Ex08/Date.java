/*
 * File name : Date.java
 *
 * Subject   : Emulate the date.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 15, 2024 
 *
 * */

public class Date // class declaration.
{
	// instance variables.
	private int month; // 1-12
	private int day;   // 1-31 based on month
	private int year;  // any year
	
	// class-wide members.
	private static int[] daysPerMonth  = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] monthsNames = { "", "January", "February", "March", "April","May", "June", "July",
			                                     "August", "September", "October", "November", "December"};
	
	// constructor: confirm proper value for month and day given the year
	public Date(int month, int day, int year)
	{
		// check if month in range.
		if (month <= 0 || month > 12)
			throw new IllegalArgumentException("month (" + month + ") must be 1-12.");
		
		// any day that it is zero or below or exceeded the valid range in 
		// the array daysPerMonth is invalid but there is one exception that
		// if the year is leap, the last day of February, 29, which is greater than daysPerMonth[2], 28.
		if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year.");
		
		// check for leap year if month is 2 and day is 29.
		if (month == 2 && day == 29 && !isLeap())
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year.");
		
		// validate the year.
		if(year < 1000 || year > 5000)
			throw new IllegalArgumentException("Invalid year.");
		
		// assign the valid values.
		this.month = month;
		this.day = day;
		this.year = year;
		
		// avoid much date processing.
		if(isLeap() == true) daysPerMonth[2] = 29;
	}
	
	// change the date to the next day.
	public void nextDay()
	{
		if(day < daysPerMonth[month])
			day++;
		else
		{
			day = 1;
			
			if(month < 12)
				month++;
			else
			{
				month = 1;
				year++;
			}
		}
	}
	
	// check if the year is leap.
	public boolean isLeap() { return ( year % 400 == 0 || ( year % 100 != 0 && year % 4 == 0) ); }
	
	// format the date as "September 15, 2024".
	public String toString()
	{
		return String.format("%s %02d, %04d.", monthsNames[month], day, year);
	}
}


