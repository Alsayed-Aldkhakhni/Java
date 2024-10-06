/*
 * File name: Square.java
 * 
 * Subject  : Class that represents Square shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

public class Square extends TwoDimensionalShape // class declaration.
{
	// instance variable.
	private double side;

	// 1-arg constructor.
	public Square(double side)
	{
		if(side <= 0) // validate the supplied input.
			throw new IllegalArgumentException("Invalid side, must be > 0");
		
		this.side = side;
	}
	
	// mutate the side.
	public void setSide(double side)
	{
		if(side <= 0) // validate the supplied input.
			throw new IllegalArgumentException("Invalid side, must be > 0");
		
		this.side = side;		
	}
	
	// access the side.
	public double getSide() { return side; }
	
	// calculate the area of the square.
	@Override
	public double getArea() { return side * side; }
}
