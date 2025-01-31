/* 
 * 
 *  File name : DateAndTimeTest.java
 *  
 * Subject    : Test the class DateAndTime.
 * 
 * Date       : September 16, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 16, 2024
 * 
 * */

public class DateAndTimeTest // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			// instantiate 2 objects.
			DateAndTime dt1 = new DateAndTime();
			DateAndTime dt2 = new DateAndTime(7, 15, 1999, 23, 21, 15);

			// print them out.
			System.out.printf("%s", dt1);
			System.out.printf("%s", dt2);
			
			System.out.println();
			
			// moving to the next day test.
			for(int i = 0; i < 100; i++)
			{
				System.out.printf("%s", dt2);// display it first.
				dt2.nextHour();              // increment the hour in the dt2 object. 
				Thread.sleep(1500);          // pause the execution for 1500 milliseconds.
			}
		}
		catch(IllegalArgumentException e)    // catch the invalid argument exception thrown by our class.
		{
			System.out.print(e.getMessage());// print the exception message.
		}
		catch (InterruptedException e)       // catch the exception thrown by Thread class.
		{
			e.printStackTrace();
		}
	}
}



