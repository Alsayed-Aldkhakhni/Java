/*
 * File name: RethrowingExceptions.java
 * 
 * Subject  : Rethrowing an Exception. 
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class RethrowingExceptions // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}	
	}
	
	// invokes the method1 that throws the exception.
	public static void method2() throws Exception
	{
		try
		{
			method1();
		}
		catch(Exception e)
		{
			throw e;
		}
	}
	
	// throw the exception.
	public static void method1() throws Exception
	{
		throw new Exception("I'm an exception thrown from mehtod1.");
	}	
	
}


