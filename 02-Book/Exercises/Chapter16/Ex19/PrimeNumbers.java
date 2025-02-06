/*
 * File name: PrimeNumbers.java
 *  
 * Subject  : Print prime factors of a non-prime number.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 6, 2025
 */

// import(s) declaration.
import java.util.*;

public class PrimeNumbers // class declaration.
{
	public static void main(String[] args)
	{
		// print table's head.
		System.out.printf("%-8s%-10s%s%n", "Number", "Is prime", "Prime Factors");
		System.out.println("================================");
		
		// print the content.
		for(int i = 0; i < 25; i++)
		{
			if(isPrime(i))
				System.out.printf("%02d%10s%n", i, "T");
			else
				System.out.printf("%02d%10s%-7s%s%n", i, "F", " ", getPrimeFactors(i));
		}
	}
	
	
	// determine whether it parameter is prime or not.
	public static boolean isPrime(long x)
	{	
		// prime numbers are greater than 0.
		if(x <= 0) return false;
		
		// checking if it is prime.
		for(int i = 2; i <= Math.sqrt(x); i++)
			if(x % i == 0) 
				return false; // not prime.
		
		// it is prime.
		return true;
	}
	
	
	// find the prime factors of non-prime number x.
	public static Set<Integer> getPrimeFactors(long x)
	{
		// a set to hold the prime factors of the number.
		Set<Integer> primeFactorsSet = new HashSet<Integer>();
		
		// if the number is prime, so has no factors.
		if(isPrime(x))
			return primeFactorsSet;
		
		// if not, search for its factors.
		for(int i = 2; x > 1; )
		{
			// factors of a number are those it is divisible by.
			if(x % i == 0)
			{
				x /= i;
				primeFactorsSet.add(i); // add the factor.
			}
			else                        // move to another suitable factor.
				i++;
		}
		
		return primeFactorsSet;		    // the list of factors.
	}
}


