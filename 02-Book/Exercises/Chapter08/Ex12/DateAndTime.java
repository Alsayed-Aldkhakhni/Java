/* 
 * 
 *  File name : DateAndTime.java
 *  
 * Subject    : Combine both classes Time and Date in one.
 * 
 * Date       : September 16, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 16, 2024
 * 
 * */


public class DateAndTime // class declaration.
{
	// ------------------------------------ data members. ----------------------------------//
	// instance variables.
	private int month; // 1-12
	private int day;   // 1-31 based on month
	private int year;  // any year
	
	// class-wide members.
	private static int[] daysPerMonth  = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final String[] monthsNames = { "", "January", "February", "March", "April","May", "June",
			                                      "July", "August", "September", "October", "November", "December"};

	// ------------------------------------ time members. -----------------------------------//
	private int hour;   // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// no argument ctor to enable
	// instantiation without args.
	DateAndTime() { this(1, 1, 2000, 0, 0, 0); }
	
	// instantiation with args.
	DateAndTime(int month, int day, int year, int hour, int minute, int second)
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
		
		///-------------------->> time part.
		
		// validate the input.
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23.");
		
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59.");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59.");
		
		// if no problems, 
		// assign the supplied values.
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// assign the supplied values to the data members.
	public void setTime(int hour, int minute, int second)
	{
		// invoke the setters.
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	// validate and set hour
	public void setHour(int hour)
	{
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23.");
		
		this.hour = hour;
	}
	
	// validate and set minute
	public void setMinute(int minute)
	{
		if (minute < 0 && minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59.");
		this.minute = minute;
	}
	
	// validate and set second
	public void setSecond(int second)
	{
		if (second >= 0 && second < 60)
			throw new IllegalArgumentException("second must be 0-59.");
		
		this.second = second;
	}
	
	// some accessors.
	// get hour value
	public int getHour() { return hour; }

	// get minute value
	public int getMinute() { return minute; }

	// get second value
	public int getSecond() { return second; }
	
	// convert to String in universal-time format (HH:MM:SS)
	public String toUniversal()
	{
		return String.format("%s %02d, %04d. at %02d:%02d:%02d", monthsNames[month],
							 day, year, getHour(), getMinute(), getSecond());
	}
	
	// format the date as "September 15, 2024".
	public String toString()
	{
		return String.format("%s %02d, %04d. at %02d:%02d:%02d %s%n", monthsNames[month], day, year,
			   ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12), getMinute(), getSecond(),
			    (getHour() < 12 ? "AM" : "PM"));
	}
	
	// check if the year is leap.
	public boolean isLeap()
	{
		return ( year % 400 == 0 || ( year % 100 != 0 && year % 4 == 0) ); 
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

	// increment the time by one hour.
	public void nextHour()
	{
		if(hour < 23)
			hour++;
		else
		{
			hour = 0;
			nextDay();
		}
	}
	
	// increment the time by one minute.
	public void nextMinute()
	{
		if(minute < 59)
			minute++;
		else
		{
			minute = 0;
			if(hour < 23)
				hour++;
			else
			{
				hour = 0;
				nextDay();
			}
		}
	}
	
	// increment the time by one second.
	public void tick()
	{
		if(second < 59)
			second++;
		else if(second >= 59)
		{
			second = 0;
			
			if(minute < 59)
				minute++;
			else
			{
				minute = 0;
				
				if(hour < 23)
					hour++;
				else
				{
					hour = 0;
					nextDay();
				}
			}
		}
	}
}



