/*
 Q) The scope of a generic class’s type parameter is the entire class except
    its static members.
 *  [True] either methods or variables.
 */


class Class<T>
{
	private T var1;        // works fine.
	private static T var2; // Error message: Cannot make a static reference to the non-static type T.
	
	// works fine.
	public void method1(T value)
	{
		System.out.println(value);
	}
	
	// Error message: Cannot make a static reference to the non-static type T.
	public static void method2(T value)
	{
		System.out.println(value);
	}
}

