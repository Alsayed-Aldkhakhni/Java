/*
 * File name : DateTest.java
 *
 * Subject   : Test our Date class.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 15, 2024
 *
 * */


public class DateTest // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			// instantiate a date object.
			Date date1 = new Date(2, 25, 2024);

			// Test member function nextDay().
			for(int i = 0; i < 10; i++)
			{
				// print the date.
				System.out.printf("%s%n", date1);
				date1.nextDay();
				
				// pause the execution to trace.
				Thread.sleep(1500);
			}
			
		}
		catch (IllegalArgumentException e) // illegal arguments thrown by our class.
		{
			System.out.printf("%s%n", e.getMessage());
		}
		catch (InterruptedException e)     // thrown by Thread class.   
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



