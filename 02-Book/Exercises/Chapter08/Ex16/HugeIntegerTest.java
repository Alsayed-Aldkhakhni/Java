/*
 * File name : HugeIntegerTest.java
 *
 * Subject   : Test our class that handles huge integers.
 *
 * Date      : September 20, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 20, 2024
 *
 * */

public class HugeIntegerTest
{
	public static void main(String[] args)
	{
		// instantiate two HugeIntegers.
		HugeInteger hugeInt1 = new HugeInteger();
		HugeInteger hugeInt2 = new HugeInteger();

		try
		{
			// assign their values.
			hugeInt1.parse("123456478922");
			hugeInt2.parse("123456578922");
			
			// display some comparing operations.
			System.out.printf("Is %s zero----------------------------: %b%n", hugeInt1.toString(), hugeInt1.isZero());
			System.out.printf("Is %s zero----------------------------: %b%n", hugeInt2.toString(), hugeInt2.isZero());			
			System.out.printf("Is %s equal to %s--------------: %b%n", hugeInt1.toString(), hugeInt2.toString(), hugeInt1.isEqualTo(hugeInt2));
			System.out.printf("Is %s less than %s-------------: %b%n", hugeInt1.toString(), hugeInt2.toString(), hugeInt1.isLessThan(hugeInt2));
			System.out.printf("Is %s greater than %s----------: %b%n", hugeInt1.toString(), hugeInt2.toString(), hugeInt1.isGreaterThan(hugeInt2));
			System.out.printf("Is %s not equal to %s----------: %b%n", hugeInt1.toString(), hugeInt2.toString(),hugeInt1.isNotEqualTo(hugeInt2));
			System.out.printf("Is %s greater or equal to %s---: %b%n", hugeInt1.toString(), hugeInt2.toString(), hugeInt1.isGreaterThanOrEqualTo(hugeInt2));
			System.out.printf("Is %s less than or equal to %s : %b%n", hugeInt1.toString(), hugeInt2.toString(),hugeInt1.isLessThanOrEqualTo(hugeInt2));
			
			System.out.println();
			
			// add two HugeIntegers and place the result in sum.
			HugeInteger sum = HugeInteger.add(hugeInt1, hugeInt2);
			HugeInteger diff = HugeInteger.sub(hugeInt1, hugeInt2);
			
			// print the numbers and the sum.
			System.out.println("1st huge number: " + hugeInt1.toString());
			System.out.println("2nd huge number: " + hugeInt2.toString());
			System.out.println("Sum of them    : " + sum.toString());

			System.out.println();
			
			// print the numbers and the sum.
			System.out.println("1st huge number: " + hugeInt1.toString());
			System.out.println("2nd huge number: " + hugeInt2.toString());
			System.out.println("diff of them   : " + diff.toString());
		}
		catch(IllegalArgumentException e)
		{
			System.out.printf("%s", e.getMessage());
		}
	}
}





