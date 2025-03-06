/*
 Q) A type parameter can be declared only once in the type-parameter section
    but can appear more than once in the method’s parameter list.
 * [True]
 */

public class PointD
{
	public static void main(String[] args) {
		method(10, 11, 12); 
	}

	// generic method to print the 3 objects of 
	// type T.
	public static <T> void method(T x, T y, T z)
	{
		System.out.println(x +", "+ y +", "+ z);
	}
}