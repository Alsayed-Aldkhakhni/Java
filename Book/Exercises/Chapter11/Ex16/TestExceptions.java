/*
 * File name: TestExceptions.java
 * 
 * Subject  : Make sure that a superclass can catch a subclass exception.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class TestExceptions // class declaration.
{
	public static void main(String[] args)
	{

		try {
			throw new ExceptionB(); // an exception of type ExceptionB occurred.
		}
		catch(ExceptionA e){
			System.out.println(e);
		}

		try {
			throw new ExceptionC(); // an exception of type ExceptionC occurred.
		}
		catch(ExceptionA e){
			System.out.println(e);			
		}
	}
}

