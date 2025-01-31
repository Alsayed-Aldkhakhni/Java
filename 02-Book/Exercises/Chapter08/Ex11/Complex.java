/*
 * File name : Complex.java
 *
 * Subject   : Construct a class to emulate complex numbers.
 *
 * Date      : September 15, 2024
 *
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 15, 2024
 *
 * */

public class Complex // class declaration.
{
	// instance variables.
	private float realPart;
	private float imaginaryPart;
	
	// set the default values.
	Complex() { realPart = 0; imaginaryPart = 0; }
	
	// set the supplied values.
	Complex(float realPart, float imaginaryPart)
	{
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}
	
	// add the compNum to this object.
	public void add(Complex compNum)
	{
		this.realPart += compNum.realPart;
		this.imaginaryPart += compNum.imaginaryPart;
	}

	// subtract the compNum from this object.
	public void sub(Complex compNum)
	{
		this.realPart -= compNum.realPart;
		this.imaginaryPart -= compNum.imaginaryPart;
	}
	
	// print the number in the complex form.
	public void printNumber()
	{
		System.out.printf("%s%,.1f, %,.1f%s%n","(", realPart, imaginaryPart, "i)");
	}
}
