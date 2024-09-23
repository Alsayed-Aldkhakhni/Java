/*
 * File name : RationalTest.java
 *
 * Subject   : Test the Rational class.
 *
 * Date      : September 18, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 20, 2024
 *
 * */

public class RationalTest // class declaration.
{
	public static void main(String[] args)
	{
		try
		{
			// instantiate 2 Rational objects.
			Rational ra1 = new Rational(1, 5);
			Rational ra2 = new Rational(4, 16);

			// carry out the operations.
			Rational add = Rational.add(ra1, ra2);
			Rational sub = Rational.sub(ra1, ra2);
			Rational mul = Rational.mul(ra1, ra2);
			Rational div = Rational.div(ra1, ra2);

			// print all of them.
			System.out.printf("ra1 = %s%nra2 = %s%n%n", ra1, ra2);
			System.out.printf("add = %s\tsub = %s%n", add, sub);
			System.out.printf("mul = %s\tdiv = %s%n", mul, div);
			
			System.out.printf("%s%n", ra1.toFloating(1));
			System.out.printf("%s%n", ra1.toFloating(4));
			System.out.printf("%s%n", ra1.toFloating(7));
			System.out.printf("%s%n", ra1.toFloating(10));
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("%s%n", e.getMessage());
		}
	}
}

