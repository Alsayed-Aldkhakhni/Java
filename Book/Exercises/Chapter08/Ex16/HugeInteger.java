/*
 * File name : HugeInteger.java
 *
 * Subject   : Design a class that handles huge integers.
 *
 * Date      : September 20, 2024
 * 
 * Author    : Alsayed A. Aldkhakhni
 *
 * Last mod  : September 21, 2024
 *
 * */


public class HugeInteger // class declaration
{
	// instance variables
	private int[] digits = new int[40]; // store the digits.
	private int numberOfDigits;         // # of digits.
	
	HugeInteger() { numberOfDigits = 0; }
	
	// is the array empty?
	public boolean isZero() { return digits.length == 0 ? true : false; }
	
	// is equal to.
	public boolean isEqualTo(HugeInteger hugeInt)
	{
		return toString().equals(hugeInt.toString());
	}

	// is not equal to.
	public boolean isNotEqualTo(HugeInteger hugeInt)
	{
		return !( isEqualTo(hugeInt) );
	}

	// greater than.
	public boolean isGreaterThan(HugeInteger hugeInt)
	{
		return toString().compareTo(hugeInt.toString()) > 0 ? true : false;
	}	
	
	// less than.
	public boolean isLessThan(HugeInteger hugeInt)
	{
		return toString().compareTo(hugeInt.toString()) < 0 ? true : false;
	}
	
	// greater than or equal to.
	public boolean isGreaterThanOrEqualTo(HugeInteger hugeInt)
	{
		return isGreaterThan(hugeInt) || isEqualTo(hugeInt);
	}	
	
	// less than or equal to methods.
	public boolean isLessThanOrEqualTo(HugeInteger hugeInt)
	{
		return isLessThan(hugeInt) || isEqualTo(hugeInt);
	}
	
	// subtract two hugeIntegers.
	public static HugeInteger sub(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		// lengths of the Integers.
		int len1 = hugeInt1.numberOfDigits;
		int len2 = hugeInt2.numberOfDigits;
		
		// helping variables.
		String str = "";
		int diff = 0;
		
		// iterate on the numbers.
		for(int i = len1-1, j = len2-1; i > 0 || j > 0; j--, i--)
		{
			// if the 1st digit is greater than or equals to the other.
			if(hugeInt1.digits[i] >= hugeInt2.digits[j])
			{
				diff = hugeInt1.digits[i] - hugeInt2.digits[j];
				str += diff;
			}
			else // otherwise.
			{
				hugeInt1.digits[i-1]--;
				hugeInt1.digits[i] += 10;
				
				diff = hugeInt1.digits[i] - hugeInt2.digits[j];
				str += diff;
			}
		}
		
		// assign the string to an object.
		HugeInteger dummy = new HugeInteger();
		dummy.parse(reverse(str));
		
		return dummy;
	}
	
	// add two hugeIntegers.
	public static HugeInteger add(HugeInteger hugeInt1, HugeInteger hugeInt2)
	{
		// temporary variables.
		String str = "", tmp = "";	
		int sum = 0;
		int len1 = hugeInt1.numberOfDigits; // # of items in hugeInt1.
		int len2 = hugeInt2.numberOfDigits; // # of items in hugeInt2.
		
		// merge both numbers.
		for(int i = len1-1, j = len2-1; i >= 0 || j >= 0; i--, j--)
		{
			if(i >= 0 && j >=0)	// case both arrays has items.
			{
				sum += hugeInt1.digits[i] + hugeInt2.digits[j];
				str += sum%10;
				sum = (sum - sum%10) / 10;
			}
			else if(i >= 0)     // if hugeInt1 only the one has items.
			{
				sum += hugeInt1.digits[i];
				str += sum%10;
				sum = (sum - sum%10) / 10;
			}
			else                // so hugeInt2 is the one has items.
			{
				sum += hugeInt1.digits[j];
				str += sum%10;
				sum = (sum - sum%10) / 10;
			}
		}
		
		// create an object to be returned.
		HugeInteger dummy = new HugeInteger();
		
		// reverse the order.
		tmp = reverse(str);
		
		dummy.parse(tmp);// store it in dummy.
		return dummy;    // return to the caller.
	}
	
	// convert a string of digits to numerical.
	public void parse(String str)
	{
		// validate the length.
		if(str.length() == 0)
			throw new IllegalArgumentException("size must be in -> [1, 40]");
		
		// check if there is non-digits in the str.
		int i;
		for(i = 0; i < digits.length && i < str.length(); i++)
		{
			if(str.charAt(i) < '0' || str.charAt(i) > '9')
				throw new IllegalArgumentException(str.charAt(i) + " is not a digit, it must be in -> [0, 9]");
			
			digits[i] = str.charAt(i) - '0';
			numberOfDigits++;
		}
	}
	
	// reverse the ordering of a string.
	public static String reverse(String str)
	{
		String dummy = "";
		
		// reverse the order.
		for(int j = str.length()-1; j >= 0; j--)
			dummy += str.charAt(j);
		
		// return to the caller.
		return dummy;
	}
	
	// return a string representation of the number.
	@Override
	public String toString()
	{
		String str = "";
		for(int i = 0 ; i < numberOfDigits; i++)			
			str += digits[i];
		
		return str;
	}
}