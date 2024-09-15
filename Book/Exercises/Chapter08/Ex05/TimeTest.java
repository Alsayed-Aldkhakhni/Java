package Ex05;

public class TimeTest // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate the objects.
		Time t1 = new Time();          // 00:00:00
		Time t2 = new Time(2);         // 02:00:00
		Time t3 = new Time(21, 34);    // 21:34:00
		Time t4 = new Time(12, 25, 42);// 12:25:42
		Time t5 = new Time(t4);        // 12:25:42
		
		// print the process.
		System.out.println("Constructed with:");
		displayTime("t1: 0-arg ctor.", t1);
		displayTime("t2: 1-arg ctor.", t2);
		displayTime("t3: 2-arg ctor.", t3);
		displayTime("t4: 3-arg ctor.", t4);
		displayTime("t5: supplied object t4.", t5);
		
		// attempt to initialize t6 with invalid values
		try
		{
			Time t6 = new Time(27, 74, 99); // invalid values
		}
		catch (IllegalArgumentException exp)
		{
			System.out.printf("%nException while initializing t6: %s%n", exp.getMessage());
		}
	}
	
	// displays a Time object in 24-hour and 12-hour formats
	private static void displayTime(String header, Time t)
	{
		System.out.printf("%s%n%s%n%s%n%n", header, t.toUniversal(), t.toString());
	}
}
