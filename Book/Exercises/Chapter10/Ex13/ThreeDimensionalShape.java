/*
 * File name: ThreeDimensionalShapes.java
 * 
 * Subject  : The parent of the all 3D shapes coming next.
 * 
 * Date     : October 1, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 2, 2024
 * 
 * */

// ThreeDimensionalShapes is-a Shape.
// sine it has no implementation, so it must be abstract also.
public abstract class ThreeDimensionalShape extends Shape
{
	public abstract double getVolume(); // 3D shapes have also a volume.
}

