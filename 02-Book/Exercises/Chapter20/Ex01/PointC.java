/*
 Q) A generic method can be overloaded by another generic method
    with the same method name but different method parameters.
 *  [True]
 */

public class PointC 
{
	public static void main(String[] args) {
        method(10);     // 1st version.
		method(10, 11); // 2nd version.
	}

    // 1st version.
    public static <T> void method(T x)
	{
		System.out.println(x);
	}

    // 2nd version.
	public static <T> void method(T x, T y)
	{
		System.out.println(x+", "+y);
	}
}
