/*
 * File name: Cube.java
 * 
 * Subject  : Class that represents Cube shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

public class Cube extends ThreeDimensionalShape // class declaration.
{
	// instance variable.
	private double side;

	public Cube(double side)
	{
		if(side <= 0) // validate.0
			throw new IllegalArgumentException("Invalid side, must be > 0");
		
		this.side = side;
	}
	
	// mutate the side's value.
	public void setSide(double side)
	{
		if(side <= 0) // validate.
			throw new IllegalArgumentException("Invalid side, must be > 0");
		
		this.side = side;		
	}
	
	// access the side.
	public double getSide() { return side; }
	
	// calculate the area of the cube.
	@Override
	public double getArea() { return 6 * Math.pow(getSide(), 2); }
	
	// calculate the volume of the cube.
	@Override
	public double getVolume() { return Math.pow(getSide(), 3); }
}
