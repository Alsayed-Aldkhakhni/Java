/*
 * File name: Circle.java
 * 
 * Subject  : Class that represents Circle shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */


public class Circle extends TwoDimensionalShape // class declaration.
{
	// instance variable.
	private double radius;
	
	public Circle(double radius)
	{
		if(radius <= 0) // validate.
			throw new IllegalArgumentException("Invalid radius, must be > 0");
		
		this.radius = radius;
	}
		
	// mutate the radius.
	public void setRadius(double radius)
	{		
		if(radius <= 0) // validate.
			throw new IllegalArgumentException("Invalid radius, must be > 0");
		
		this.radius = radius;
	}

	// access the radius safely.
	public double getRadius() { return radius; }
	
	// calculate the area of the circle.
	@Override
	public double getArea() { return Math.PI * radius * radius; }
}
