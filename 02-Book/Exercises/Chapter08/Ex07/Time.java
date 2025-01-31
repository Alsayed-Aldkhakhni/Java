/* *
 * 
 *  File name : Time.java
 *  
 * Subject    : Class that emulates time.
 * 
 * Date       : September 14, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 14, 2024
 * 
 * */

public class Time // class declaration.
{
	private int hour;   // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	
	// no-arg ctor that initialize.
	public Time() {	this(0, 0, 0); }
	
	// 1-arg cotr.
	public Time(int hour) {	this(hour, 0, 0); }
	
	// 2-arg ctor.
	public Time(int hour, int minute) {	this(hour, minute, 0); }
	
	// 3-arg ctor.
	public Time(int hour, int minute, int second)
	{
		// validate the input.
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		// if no problems, 
		// assign the supplied values.
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// overloaded 1-arg ctor, object supplied.
	public Time(Time time) { this(time.getHour(), time.getMinute(), time.getSecond()); }

	// assign the supplied values to the data members.
	public void setTime(int hour, int minute, int second)
	{
		// validate the inputs' ranges.
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		// set the values.
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	// validate and set hour
	public void setHour(int hour)
	{
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		this.hour = hour;
	}
	
	// validate and set minute
	public void setMinute(int minute)
	{
		if (minute < 0 && minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");
		this.minute = minute;
	}
	
	// validate and set second
	public void setSecond(int second)
	{
		if (second >= 0 && second < 60)
			throw new IllegalArgumentException("second must be 0-59");
		
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
	public String toUniversalString()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	
	// increment the time by one hour.
	public void nextHour()
	{
		if(hour < 23)
			hour++;
		else
			hour = 0;
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
				hour = 0;
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
					hour = 0;
			}
		}
	}

	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%02d:%02d:%02d %s",
				((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
				getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}

