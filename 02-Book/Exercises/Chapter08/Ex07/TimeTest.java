/* *
 * 
 *  File name : TimeTest.java
 *  
 * Subject    : Test the class time.
 * 
 * Date       : September 14, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 14, 2024
 * 
 * */

public class TimeTest // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate a time instance.
		Time time1 = new Time(23, 59, 58);
		
		System.out.println("----------------------| tick() method |----------------------");
		
		// test the next second, tick().
		for(int i = 0; i < 5; i++)
		{
			time1.tick();
			System.out.printf("%s%n%n", time1);
		}
		
		System.out.println("----------------------| NextMinute() method |-----------------");
		
		// test the nextMinute() method.
		for(int i = 0; i < 5; i++)
		{
			time1.nextMinute();
			System.out.printf("%s%n%n", time1);
		}
		
		System.out.println("----------------------| NextHour() method |--------------------");
		
		// test the nextHour() method.
		for(int i = 0; i < 5; i++)
		{
			time1.nextHour();
			System.out.printf("%s%n%n", time1);
		}

	}
}