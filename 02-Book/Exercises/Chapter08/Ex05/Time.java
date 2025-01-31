package Ex05;

public class Time // class declaration.
{
	// the only instance field.
	private int seconds;
	
	// no-argument constructor:
	public Time() { this(0, 0, 0); }
	
	// Time constructor: hour supplied, minute and second defaulted to 0
	public Time(int hour) {	this(hour, 0, 0); }
	
	// Time constructor: hour and minute supplied, second defaulted to 0
	public Time(int hour, int minute) { this(hour, minute, 0); }
	
	// Time constructor: hour, minute and second supplied
	public Time(int hour, int minute, int second)
	{
		// validate each value supplied.
		if (hour < 0 || hour >= 24)
		throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute < 0 || minute >= 60)
		throw new IllegalArgumentException("minute must be 0-59");
		
		if (second < 0 || second >= 60)
		throw new IllegalArgumentException("second must be 0-59");
		
		// convert the passed values to seconds.
		this.seconds = seconds + minute * 60 + hour * 3600;
	}
	
	// Time constructor: another Time object supplied
	public Time(Time time) { this.seconds = time.seconds; }
	
	// set a new time value using universal time;
	public void setTime(int hour, int minute, int second)
	{
		// validate the data.
		if (hour < 0 || hour >= 24)
			throw new IllegalArgumentException("hour must be 0-23");
		
		if (minute < 0 || minute >= 60)
			throw new IllegalArgumentException("minute must be 0-59");
		
		if (second < 0 || second >= 60)
			throw new IllegalArgumentException("second must be 0-59");
		
		// convert the passed values to seconds.
		this.seconds = seconds + minute * 60 + hour * 3600;
	}
	
	// get hour value
	public int getHour() { return (int)(this.seconds / 3600); }
	
	// get minute value
	public int getMinute() { return (int) ( (this.seconds - getHour() * 3600) / 60); }
	
	// get second value.
	public int getSecond() { return (int) ( this.seconds - (getHour() * 3600) - (getMinute() * 60) ); }

	// return formated time.
	public String toUniversal()
	{
		return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
	}
	 
	// convert to String in standard-time format (H:MM:SS AM or PM)
	public String toString()
	{
		return String.format("%02d:%02d:%02d %s", ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
					                                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
	}
}



