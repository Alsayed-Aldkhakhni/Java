/*
 * File name : Date.java
 *
 * Subject   : Class that accepts date in more than one form.
 *
 * Date      : September 18, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 18, 2024 
 *
 * */

import java.util.Arrays;
enum WhichForm{formOf3Ints, formOf2Ints, formOfStrMonth};

public class Date // class declaration.
{
	// instance variables.
	private int month; // 1-12
	private int day;   // 1-31 based on month or 1-365 in form of DDD / YYYY. 
	private int year;  // any year
	private String strMonth;   // January - December.
	private WhichForm dateForm;// 9/15/2024, January 15, 2001 or 211 / 2005.
	
	// class-wide members.
	private static int[] daysPerMonth  = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] monthsNames = { "", "January", "February", "March", "April","May", "June", "July",
			                                     "August", "September", "October", "November", "December"};
	
	// date in 1st form (e.g. 15/9/2001).
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
		if (month == 2 && day == 29 && !isLeap(year))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year.");
		
		// validate the year.
		if(year < 1000 || year > 5000)
			throw new IllegalArgumentException("Invalid year.");
		
		// assign the valid values.
		this.month = month;
		this.day = day;
		this.year = year;
		dateForm = WhichForm.formOf3Ints;
		
		// avoid much date processing.
		if(isLeap(year) == true) daysPerMonth[2] = 29;
	}

	// date in 2nd form (e.g. 215 / 2001).
	Date(int dayNum, int year)
	{
		// validate the year.
		if(year <= 2000 || year > 5000)
			throw new IllegalArgumentException("Invalid year, it must be in [2000, 5000].");
		
		// validate day.
		if((dayNum <= 0 || dayNum > 366) || (!isLeap(year) && dayNum > 365) || (isLeap(year) && dayNum > 366))
			throw new IllegalArgumentException(dayNum + " is an invalid day number.");
		
		// valid data.
		this.day = dayNum;
		this.year = year;
		dateForm = WhichForm.formOf2Ints;
	}
	
	// date in 3rd form (e.g. July 15, 1999).
	Date(String month, int day, int year)
	{
		// check the month validation.
		if(Arrays.binarySearch(monthsNames, month) < 0)
			throw new IllegalArgumentException("Invalid month, must be start with uppercase and the whole month name.");
		
		// validate the day.
		if (day <= 0 || (day > daysPerMonth[Arrays.binarySearch(monthsNames, month)] && !(month == monthsNames[2] && day == 29)))
			throw new IllegalArgumentException("day (" + day + ") out-of-range for the specified month and year.");
		
		// validate the year.
		if(year < 1000 || year > 5000)
			throw new IllegalArgumentException("Invalid year, it must be in [2000, 5000].");
		
		dateForm = WhichForm.formOfStrMonth;
		this.year = year;
		this.day = day;
		this.strMonth = month;
	}
	
	// check if the year is leap.
	public boolean isLeap(int year) { return ( year % 400 == 0 || ( year % 100 != 0 && year % 4 == 0) ); }
	
	// just print the date in the specified form.
	public void printDate()
	{
		if(dateForm == WhichForm.formOf2Ints)     // 255/2001
			System.out.printf("%02d/%04d.", day, year);

		else if(dateForm == WhichForm.formOf3Ints)// 9/15/2001
			System.out.printf("%02d/%02d/%4d.", month, day, year);
		
		else                                      // March 10, 2001
			System.out.printf("%s %02d, %4d.", strMonth, day, year);
	}
	
	// format the date as "September 15, 2024".
	public String toString()
	{
		if(dateForm == WhichForm.formOf2Ints)     // 255/2001
			return  String.format("%02d/%04d.", day, year);

		else if(dateForm == WhichForm.formOf3Ints)// 9/15/2001
			return  String.format("%02d/%02d/%4d.", month, day, year);
		
		else                                      // March 10, 2001
			return  String.format("%s %02d, %4d.", strMonth, day, year);
	}
}



