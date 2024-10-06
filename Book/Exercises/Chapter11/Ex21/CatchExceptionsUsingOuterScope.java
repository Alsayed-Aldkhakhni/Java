/*
 * File name: CatchExceptionsUsingOuterScope.java
 * 
 * Subject  : Catch an exception using the outer catch block.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class CatchExceptionsUsingOuterScope // class declaration.
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
			throw new Exception("Thrown from try block of method1.");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println(1/0); // caused a division by zero exception to be thrown.
	}
}



