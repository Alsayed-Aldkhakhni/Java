/*
 * File name: Triangle.java
 * 
 * Subject  : Class that represents Triangle shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

public class Triangle extends TwoDimensionalShape // class declaration.
{
	// instance variables.
	private double height;
	private double base;
	
	// 2-arg constructor.
	public Triangle(double base, double height)
	{
		
		if(base <= 0 || height <= 0)
			throw new IllegalArgumentException("Invalid argument(s), either base or/and height.");
		
		this.base = base;
		this.height = height;
	}
	
	// mutate the height.
	public void setBase(double base)
	{
		if(base <= 0) // validate the base.
			throw new IllegalArgumentException("Invalid base, must be > 0");
		
		this.base = base;
	}
	
	// mutate the base.
	public void setHeight(double height)
	{
		if(height <= 0) // validate the height.
			throw new IllegalArgumentException("Invalid height, must be > 0");
		
		this.height = height;
	}
	
	// access both base and height.
	public double getBase() { return base; }
	public double getHeight() { return height; }
	
	// calculate the area.
	@Override
	public double getArea() { return getBase() * 0.5 * getHeight(); }
}

