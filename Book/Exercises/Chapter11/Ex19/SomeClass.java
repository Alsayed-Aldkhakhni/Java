/*
 * File name: SomeClass.java
 * 
 * Subject  : A class that test the idea of constructor failure.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

public class SomeClass
{
	public SomeClass() throws Exception
	{
		throw new Exception("I'm an exception thrown from SomeClass's ctor.");
	}
}
