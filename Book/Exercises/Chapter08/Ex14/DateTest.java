/*
 * File name : DateTest.java
 *
 * Subject   : Test our new Date class.
 *
 * Date      : September 18, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 18, 2024
 *
 * */

public class DateTest // class declaration.
{
	public static void main(String[] args)
	{
		try
		{	
			// instantiate 3 dates.
			Date dt1 = new Date("September", 18, 2024);
			Date dt2 = new Date(9, 18, 2024);
			Date dt3 = new Date(366, 2024);
			
			// print their contents.
			System.out.printf("%s%n%s%n%s", dt1, dt2, dt3);
			
		}   // detect the thrown exceptions, if any.
		catch(IllegalArgumentException e)
		{
			// print exception's message.
			System.out.printf("%s%n", e.getMessage());
		}
	}
}

