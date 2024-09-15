/* *
 * 
 *  File name: Rectangle.java
 *  
 * Subject: Class that emulates rectangles.
 * 
 * Date: September 14, 2024
 * 
 * Author: Alsayed A. Aldkhakhni
 * 
 * Last mod: September 14, 2024
 * 
 * */

public class Rectangle // class declaration.
{
	// instance variables.
	private float length;
	private float width;
	
	// set the default values.
	Rectangle() { length = 1; width = 1; }

	// assign the length value.
	public void setLength(float length)
	{
		// validate the input.
		if(length > 0.0 && length <= 20.0)
			this.length = length;
		else
			System.out.println("Invalid length.");
	}
	
	// the value of length.
	public float getLength() { return this.length; }
	
	// assign the width value.
	public void setWidth(float width)
	{
		// validate the input.
		if(width > 0.0 && width <= 20.0)
			this.width = width;
		else
			System.out.println("Invalid width.");
	}
	
	// return  the width's content.
	public float getWidth()  { return this.width; }
	
	// calculate the rectangle area.
	// you can simply type it as "length * width".
	public float getArea()      { return this.length * this.width; }
	public float getPerimeter() { return 2 * (length + width);}
	
	// return the object's data formated.
	// also is invoked implicitly if the %s called on the object's name only.
	public String toString()
	{
		return String.format("%n%s%,.2f%n%s%,.2f%n%s%,.2f%n%s%,.2f%n",
				             "Length = ", getLength(),
				             "Width  = ", getWidth(),
				             "Area   = ", getArea(),
				             "Perim  = ", getPerimeter());
	}
}

