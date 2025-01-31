/* *
 * 
 *  File name: RectangleTest.java
 *  
 * Subject: Test the class Rectangle.
 * 
 * Date: September 14, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 14, 2024
 * 
 * */

import java.util.Scanner;  // import declaration.
public class RectangleTest // class  declaration.
{
	public static void main(String[] args)
	{
		// instantiate objects to use through the program.
		Scanner input = new Scanner(System.in); // reads the user's data.
		Rectangle rec1 = new Rectangle();       // simulate a rectangle.
		
		// rec1.setLength(21.5f); // both are invalid values.
		// rec1.setWidth(0.0f);
		
		// read the rec1's length.
		System.out.print("Enter rectange's length: ");
		float length = input.nextFloat();
		
		// read the rec1's width.
		System.out.print("Enter rectange's width:  ");
		float width = input.nextFloat();
		
		
		// assign new values to instance's rec1 length and width.
		rec1.setLength(length);
		rec1.setWidth(width);
		
		// display the instance's data using toString() implicitly.
		System.out.printf("%s", rec1);
	}
}



