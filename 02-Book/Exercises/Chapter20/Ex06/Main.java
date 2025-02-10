/*
 * File name: Main.java 
 * 
 * Subject  : Overload generic method with a non-genreic one.
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
		// array of names.
		String[] strArray = 
			{"Ali", "Ahmed", "Hoda", "Adel", "Marwan", "Moamen",
			 "Khalid", "Mero", "Sami", "Kareem", "Samieer", "Hind"};
	
		System.out.print("strArray containts: ");
		printArray(strArray); // the 2nd method not the 1st.
	}
	
	// template [generic] method to print an array
	// of any type passed.
	public static <T> void printArray(T[] array)
	{
		for(T item : array)
			System.out.print(item + " ");

		System.out.println();
	}
	
	// a method prints only an array of String.
	public static void printArray(String[] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			if(i % 4 == 0)
				System.out.println();
			
			System.out.printf("%-10s", array[i]);
		}
		
		System.out.println();
	}
}
