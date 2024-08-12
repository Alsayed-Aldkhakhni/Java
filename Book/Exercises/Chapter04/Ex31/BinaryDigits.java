/*
 * File name: BinaryDigits.java
 *
 * Subject: Evaluate from binary to decimal representation.
 *
 * Date: March 19, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 12, 2024 at [10:29 AM]
 *
 * */

import java.util.Scanner; // import declaration, to read the user's input.
public class BinaryDigits // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a binary binrayNumber: ");
	
	// sample: 101101 = 45.
	int binrayNum = input.nextInt();
        int bit = binrayNum % 10;
        int decimalVal = 0;
        int position = 1;
        
        while(binrayNum > 0)
        {
            if(bit == 1)
                decimalVal += position;
	    else if(bit == 0)
		    decimalVal += 0;
	    else 
		    System.out.println(bit + " Not a binray digit.");
            
	    // move to the next 
	    // position in the number.
            position *= 2;
            binrayNum /= 10;
            bit = binrayNum % 10;
        }
        
        System.out.println("The decimal value is: " + decimalVal);
    }
}
