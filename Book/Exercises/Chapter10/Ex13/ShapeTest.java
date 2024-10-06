/*
 * File name: ShapeTest.java
 * 
 * Subject  : Test the shapes we made.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

public class ShapeTest // class declaration.
{
	public static void main(String[] args)
	{
		// six shapes that we have.
		Shape[] shapes = new Shape[6];

		try
		{
			// allocate the objects.
			shapes[0] = new Circle(1.025);
			shapes[1] = new Square(2.120);
			shapes[2] = new Triangle(3.50, 5.12);
			shapes[3] = new Sphere(5.88);     // 3D circle.
			shapes[4] = new Cube(5.1);        // 3D square.
			shapes[5] = new Tetrahedron(3.12);// triangular pyramid.

			// iterate on the whole array.
			for(Shape currentShape : shapes)
			{
				// print the common attributes.
				System.out.printf("Object type  : %s%nObject area  : %,.2f cm^2%n",
						currentShape.getClass().getName(), currentShape.getArea());

				// the volume if it is 3D.
				if(currentShape instanceof ThreeDimensionalShape)
					System.out.printf("Object volume: %,.2f cm^3%n", ((ThreeDimensionalShape)currentShape).getVolume());

				System.out.println();
			}
		}
		catch(Exception e) // handle the exception thrown.
		{
			System.out.println(e.getMessage());
		}
	}
}

