/*
 * File name: Main.java 
 * 
 * Subject  : Overload printArray method to print a portion of its array.
 * 
 * Date     : Feb 8, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */


public class Main // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			// print from 22 -> 393.
			Integer[] intArray = {10, 12, 22, -2, 190, 393, 90};
			printArray(intArray, 2, 5);
			
			System.out.println("==============================");
			
			// print names from Hoda -> Khalid.
			String[] strArray =
				{"Ali", "Ahmed", "Hoda", "Adel", "Marwan", "Moamen",
				 "Khalid", "Mero", "Sami", "Kareem", "Samieer", "Hind"};
			printArray(strArray, 3, 6);
			
		} catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	// method that prints all array's items.
	public static <T> void printArray(T[] array)
	{
		for(T item : array)
			System.out.print(item + " ");

		System.out.println();
	}
	
	// overloaded method that print a portion of the array.
	public static <T> void printArray(T[] array, int lowSubscript, int highSubscript) throws Exception
	{
		// validate the subscripts.
		if(lowSubscript < 0 || lowSubscript > highSubscript || lowSubscript > array.length)
			throw new InvalidSubscriptException("["+ lowSubscript +"] invalid Subscript");

		if(highSubscript >= array.length || highSubscript < 0)
			throw new InvalidSubscriptException("["+ highSubscript +"] invalid Subscript");

		// print the portion of the array.
		for(int i = lowSubscript; i <= highSubscript; i++)
			System.out.print(array[i] + " ");

		System.out.println();
	}
}

