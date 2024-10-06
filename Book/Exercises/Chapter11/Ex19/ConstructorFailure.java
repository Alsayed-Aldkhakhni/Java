/*
 * File name: ConstructorFailure.java
 * 
 * Subject  : Test the class SomeClass.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class ConstructorFailure
{
	public static void main(String[] args)
	{
		try
		{
			SomeClass someClass = new SomeClass();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}


