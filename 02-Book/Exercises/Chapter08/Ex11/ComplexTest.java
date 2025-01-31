/*
 * File name : ComplexTest.java
 *
 * Subject   : Test the Complex class.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 15, 2024
 *
 * */

public class ComplexTest // class declaration.
{
	public static void main(String[] args)
	{
		// instantiate 3 complex numbers.
		Complex comp1 = new Complex(2, 9);
		Complex comp2 = new Complex(5, 7);
		Complex comp3 = new Complex(15, 5);
		
		// invoke the methods.
		comp1.add(comp2);
		comp3.sub(comp2);
		
		// print the numbers.
		System.out.print("comp1: "); comp1.printNumber();
		System.out.print("comp2: "); comp2.printNumber();
		System.out.print("comp3: "); comp3.printNumber();
	}
}


