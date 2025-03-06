/*
 Q) A generic method cannot have the same method name as a non-generic method.
    False, it can.
 * The compiler 1st searches for a called called <printValue>
    that takes an int value and has no return type.
 * It finds out that the 1st method matches the method call
    so, it uses it directly without checking the 2nd method.
 * This code will work and won't generate an error.
 */

public class PointA
{
	public static void main(String[] args)
    {
		printValue(10);
	}

    // 2nd check.
	public static <T> void printValue(T x)
	{
		System.out.println(x);
	}

    // 1st check.
	public static void printValue(int x)
	{
		System.out.println(x);
	}
}
