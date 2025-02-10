/*
 * File name: Main.java 
 * 
 * Subject  : A generic method checks its arguments equality.
 * 
 * Date     : Feb 8, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */


public class Equals // class declaration.
{
	public static void main(String[] args)
	{
		// compare two strings.
		System.out.println(isEqualTo("Alsayed", "Alsayed"));
		System.out.println(isEqualTo("Alsayed", "alsayed"));
		
		System.out.println("=================================");
		
		// compare to longs.
		System.out.println(isEqualTo(12345L, 12345L));
		System.out.println(isEqualTo(12345L, 123456L));

		System.out.println("=================================");
		
		// compare two floats.
		System.out.println(isEqualTo(123.55F, 123.55F));
		System.out.println(isEqualTo(123.50F, 123.51F));

		System.out.println("=================================");
	}
	
	// generic method to check if its arguments are equal.
	public static <T> boolean isEqualTo(T obj1, T obj2)
	{
		System.out.print("Does "+ obj1 +" equal "+ obj2 +": ");
		return obj1.equals(obj2);
	}
}

