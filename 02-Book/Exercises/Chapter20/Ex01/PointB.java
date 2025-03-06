/*
 Q) All generic method declarations have a type-parameter section
    that immediately precedes the method name.
 * [False, its return type]
 */

public class PointB
{
	public static void main(String[] args)
    {
		printValue(10);
	}

    // the generic method's structure.
	public static <T> void printValue(T x)
	{
		System.out.println(x);
	}
}
