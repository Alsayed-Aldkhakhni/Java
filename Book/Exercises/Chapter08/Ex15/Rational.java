/* 
 *  File name : Rational.java
 *  
 * Subject    : Class that emulates rational numbers.
 * 
 * Date       : September 18, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 20, 2024
 * 
 * */

public class Rational // class declaration.
{
	private int numerator;
	private int denominator;
	
	// 2-argument constructor.
	Rational(int numerator, int denominator)
	{
		// validate supplied values.
		if(denominator == 0)
			throw new IllegalArgumentException("Invalid denominator.");
		
		// assign the valid data.
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	// add two Rational objects.
	public static Rational add(Rational ra1, Rational ra2)
	{
		// a/b + c/d = a.d + b.c / b.d
		int numerator = ra1.numerator * ra2.denominator + ra2.numerator * ra1.denominator;
		int denominator = ra1.denominator * ra2.denominator;
		
		Rational dummy = new Rational(numerator, denominator);
		reduce(dummy);
		return dummy;
	}
	
	// subtract two Rational objects.
	public static Rational sub(Rational ra1, Rational ra2)
	{
		// a/b - c/d = a.d - b.c / b.d
		int numerator = ra1.numerator * ra2.denominator - ra2.numerator * ra1.denominator;
		int denominator = ra1.denominator * ra2.denominator;
		
		Rational dummy = new Rational(numerator, denominator);
		reduce(dummy);
		return dummy;
	}
	
	// multiply two Rational objects.
	public static Rational mul(Rational ra1, Rational ra2)
	{
		// a/b * c/d = a.c / b.d
		int numerator = ra1.numerator * ra2.numerator;
		int denominator = ra1.denominator * ra2.denominator;
		
		Rational dummy = new Rational(numerator, denominator);
		reduce(dummy); // reduce the terms.
		return dummy;
	}
	
	// divide two Rational objects.
	public static Rational div(Rational ra1, Rational ra2)
	{
		// avoid division by zero.
		if(ra2.numerator == 0)
			throw new IllegalArgumentException("Division by zero is not allowed.");

		// a/b / c/d = a.d / b.c
		int numerator = ra1.numerator * ra2.denominator;
		int denominator = ra1.denominator * ra2.numerator;

		Rational dummy = new Rational(numerator, denominator);
		reduce(dummy);
		return dummy;
	}

	// return the fraction as a string.
	public String toString() { return String.format("%d/%d", numerator, denominator); }
	
	// String representation of the fraction.
	public String toFloating(int percisions)
	{
		if(percisions < 0 || percisions > 7)
			throw new IllegalArgumentException(percisions + " is an invalid percisions number," +
		                                                    " it must be [0, 7] for floats.");
		
		// how many digits after the decimal points.
		switch(percisions)
		{
		case 1:
			return String.format("%,.1f", (float)numerator/denominator);
			
		case 2:
			return String.format("%,.2f", (float)numerator/denominator);
			
		case 3:
			return String.format("%,.3f", (float)numerator/denominator);
			
		case 4:
			return String.format("%,.4f", (float)numerator/denominator);
			
		case 5:
			return String.format("%,.5f", (float)numerator/denominator);
			
		case 6:
			return String.format("%,.6f", (float)numerator/denominator);
			
		case 7:
			return String.format("%,.7f", (float)numerator/denominator);
		}
		
		// in case zero digits.
		return String.format("%,d", (int)numerator/denominator);
	}
	
	// reduce the fractions to the lowest term.
	private static void reduce(Rational ra)
	{
		// take copies to divide by later.
		int num   = ra.numerator;
		int denom = ra.denominator;

		// some validation.
		if(num < 0)   num = -num;
		if(denom < 0) denom = -denom;
		if(num == 0)  { ra.numerator = 0; ra.denominator = 1; return; }

		
		// sample: 24/36
		while(num != 0)
		{
			if(denom > num)  // 36 > 24, 24 > 12, 12 > 12
			{
				int temp = num;
				num = denom; // 36, 24
				denom = temp;// 24, 12
			}

			num -= denom;    // 36 - 24 = 12, 24 - 12 = 12, 12 - 12 = 0 
		}

		// modify the object's data.
		ra.numerator /= denom;
		ra.denominator /= denom;
	}
}
