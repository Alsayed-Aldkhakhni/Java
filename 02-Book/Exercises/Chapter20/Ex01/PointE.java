/*
 Q) Type-parameter names among different generic methods must be unique.
 *  [False], the same name may be used for all generic methods in 
              the same class.
 */

public class PointE
{
	public static void main(String[] args)
	{
		// call those methods.
		method1(10);
		method2(10, 11);
		method3(10, 11, 12);
	}

	// print one parameter.
	public static <T> void method1(T x) {
		System.out.println(x);
	}

	// print two parameters.
	public static <T> void method2(T x, T y) {
		System.out.println(x + ", " + y);
	}
	
	// print three parameters.
	public static <T> void method3(T x, T y, T z) {
		System.out.println(x + ", " + y + ", " + z);
	}
}

