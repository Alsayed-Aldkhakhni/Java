/*
 * File name: Factorial.java
 *
 * Subject: Calculate the factorial of a givin number and the value of 'e' constant.
 *
 * Date: March 21, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 12, 2024 at [01:00 PM]
 * 
 * */

import java.util.Scanner; // import declaration to read the user's data.
public class Factorial    // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
	/*
	 * (a) Calculate the factorial.
	 */

        System.out.print("a)\nEnter a number to get its factorial:  ");
        int num = input.nextInt();

        if(num > 0)
        {
            int numFactorial = 1;
            int count = num;
        
            while(count > 1)
            {
                numFactorial *= count;
                count--;
            }
            
            System.out.printf("The factorial of (%d) is (%d).%n%n", num, numFactorial);
        }
        else
        {
            System.out.println("There is no factorial to that number.\n");
        }
        
	/*
	 * (b) estimate the value of (e) up to 'x' terms.
	 */
        
        System.out.print("b)\nEstimating the value of (e), up to how many terms?: ");
        int howTerms = input.nextInt();
        int cpyTerms = howTerms;

        double eValue = 1.0;
        
        while(howTerms >= 1)
        {
	     int result = 1;
	     int numx = howTerms;

	     // the denominator's factorial.
	     while(numx > 1)
             {
                result *= numx;
                numx--;
             }

            eValue += 1.0/result;
            howTerms--;
        }
        
           System.out.printf("The estimated value of 'e' up to (%d) is: %f%n%n", cpyTerms,  eValue);
	  
            /*
	     * (c) estimate the value of (e^x) up to 'n' terms.
	    */
	   System.out.print("c)\nEstimate the value of (e^x), enter the (x): ");
           int xValue = input.nextInt();

	   if(xValue < 0)
		   System.out.println("Ivalid power.");
	   else if(xValue == 0)
		   System.out.println("The value of (e^0) is: 1.");
	   else
	   {
		   System.out.print("How many terms carry out the calculation: ");
		   int nTerms = input.nextInt();

		   if(nTerms <= 0)
			   System.out.println("Invalid number of terms.");
		   else
		   {
			   double rslt = 1.0;
			   int power = 1;

			   // how many fractions should be calculated.
			   while(nTerms > 1)
			   {
				   int fNum = power;
				   int fact = 1;

				   // calculate the factorial of the denominator.
				   while(fNum >= 1)
				   {
					   fact *= fNum;
					   fNum--;
				   }

				   // add each term result.
				   rslt += Math.pow(xValue, power) / (double) fact;
				   nTerms--;
				   power++;
			   }

			   System.out.printf("The extimated value of (e^%d) is: %f%n", xValue, rslt);
		   }
	   }
    }
}






