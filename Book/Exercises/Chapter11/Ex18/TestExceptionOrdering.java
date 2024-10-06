/*
 * File name: TestExceptionOrdering.java
 * 
 * Subject  : Test the ordering of thrown exceptions.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class TestExceptionOrdering
{
	public static void main(String[] args)
	{
		/*
		 * This code will generate an error
		 * since the thrown exception of 
		 * type IndexOutOfBoundsException
		 * is already caught in catch(Exception e).
		 */
		
		try
		{
			throw new IndexOutOfBoundsException();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);			
		}
	}
}
