/*
 * File name: Sphere.java
 * 
 * Subject  : Class that represents Sphere shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */


public class Sphere extends ThreeDimensionalShape // class declaration.
{
	// instance variable.
	private double radius;

	// 1-arg constructor.
	public Sphere(double radius)
	{
		if(radius <= 0) // validate the supplied argument.
			throw new IllegalArgumentException("Invalid radius, must be > 0");

		this.radius = radius;
	}

	// mutate the radius.
	public void setRadius(double radius)
	{
		if(radius <= 0) // validate the supplied argument.
			throw new IllegalArgumentException("Invalid radius, must be > 0");

		this.radius = radius;
	}	
	
	// retrieve the radius' value.
	public double getRadius() { return radius; }

	// calculate the surface area.
	@Override
	public double getArea() { return 4.0 * Math.PI * Math.pow(radius, 2); }

	// calculate the total volume.
	@Override
	public double getVolume() { return 4.0/3.0 * Math.PI * Math.pow(getRadius(), 3); }
}

