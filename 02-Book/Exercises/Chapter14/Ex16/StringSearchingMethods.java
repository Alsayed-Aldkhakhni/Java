/*
 * File Name: StringSearchingMethods.java 
 * 
 * Subject  : Write our own 'indexOf & lastIndexOf' methods.
 * 
 * Date     : November 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : November 1, 2024
 * 
 * */


import java.util.Scanner;           // import declaration.
public class StringSearchingMethods // class  declaration.
{
	public static void main(String[] args)
	{
		// read the user's data at the keyboard.
		Scanner input = new Scanner(System.in);
		
		// read some text from the user.
		System.out.print("Write something: ");
		String str1 = input.nextLine();
		
		// get the target we will search for.
		System.out.print("Enter a target : ");
		char cTarget = input.next().charAt(0);
		
		// Java's built-ins
		System.out.println("Java's built-ins: ");
		System.out.printf("\"%c\" 1st  occurrence in \"%s\" at index [%02d]%n", cTarget, str1, str1.indexOf(cTarget));
		System.out.printf("\"%c\" last occurrence in \"%s\" at index [%02d]%n", cTarget, str1, str1.lastIndexOf(cTarget));
		
		System.out.println();
		
		// ours.
		System.out.println("Our homemade: ");
		System.out.printf("\"%c\" 1st  occurrence in \"%s\" at index [%02d]%n", cTarget, str1, indexOf(str1, cTarget));
		System.out.printf("\"%c\" last occurrence in \"%s\" at index [%02d]%n", cTarget, str1, lastIndexOf(str1, cTarget));
	}
	
	// find the 1st occurrence of target in str.
	public static int indexOf(String str, char target)
	{
		for(int i = 0; i < str.length(); i++)
			if(str.charAt(i) == target)
				return i;
		
		return -1;
	}
	
	// find the last  occurrence of target in str.
	public static int lastIndexOf(String str, char target)
	{
		for(int i = str.length() - 1; i >= 0; i--)
			if(str.charAt(i) == target)
				return i;
		
		return -1;
	}
	
}
