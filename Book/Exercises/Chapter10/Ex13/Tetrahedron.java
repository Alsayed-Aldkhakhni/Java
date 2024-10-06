/*
 * File name: Tetrahedron.java
 * 
 * Subject  : Class that represents Tetrahedron shape.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

// Tetrahedron is-a ThreeDimensionalShape 
public class Tetrahedron extends ThreeDimensionalShape // class declaration.
{
	// date member.
	private double edge;

	// 1-arg constructor.
	public Tetrahedron(double edge)
	{		
		if(edge <= 0) // validate.
			throw new IllegalArgumentException("Invalid edge, must be > 0");
		
		this.edge = edge;
	}
	
	// retrieve the edge's value.
	public double getEdge() { return edge; }
	
	// mutate the edge.
	public void setEdge(double edge)
	{		
		if(edge <= 0) // validate the edge.
			throw new IllegalArgumentException("Invalid edge, must be > 0");
		
		this.edge = edge;
	}
	
	// calculate the area.
	@Override
	public double getArea() { return Math.sqrt(3.0) * Math.pow(edge, 2.0); }

	// calculate the volume.
	@Override
	public double getVolume() { return Math.pow(getEdge(), 3.0) / 6.0 * Math.sqrt(2.0);}
	
}
