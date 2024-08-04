/*
 * File name: CountNumbers.java
 *
 * Subject: Read 5 numbers and determine how many positives, negatives and zeros.
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Ali
 *
 * Last modification: August 4, 2024 --> [12:00 PM]
 *
 * */

// import declaration.
import java.util.Scanner; 

public class CountNumbers // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate an object that accepts the uesr's data at the keyboard.
        Scanner input = new Scanner(System.in);
        
        // prompt the user to enter the 1st number.
        System.out.print("Enter the 1st number: ");
        int num1 = input.nextInt();

        // 2nd number.
        System.out.print("Enter the 2nd number: ");  
        int num2 = input.nextInt();

        // 3rd number.
        System.out.print("Enter the 3rd number: ");    
        int num3 = input.nextInt();

        // 4th number.
        System.out.print("Enter the 4th number: ");   
        int num4 = input.nextInt();

        // 5th number.
        System.out.print("Enter the 5th number: ");
        int num5 = input.nextInt();

	// intialize the variables to work as counters.
        int zeros = 0; 
        int positives = 0;
        int negatives = 0;
        
        /*
         * each number has 1 of 3 possiblites either it is positive, negative or zero
            so, for each number of 5 entered will be checked 3 times.
        */

        if(num1 > 0) positives = positives + 1;        
        if(num1 < 0) negatives = negatives + 1;
        if(num1 == 0) zeros = zeros + 1;
             
        if(num2 > 0) positives = positives + 1;        
        if(num2 < 0) negatives = negatives + 1;
        if(num2 == 0) zeros = zeros + 1;
                
        if(num3 > 0) positives = positives + 1;        
        if(num3 < 0) negatives = negatives + 1;
        if(num3 == 0) zeros = zeros + 1;
        
        if(num4 > 0) positives = positives + 1;        
        if(num4 < 0) negatives = negatives + 1;
        if(num4 == 0) zeros = zeros + 1; 
            
        if(num5 > 0) positives = positives + 1;        
        if(num5 < 0) negatives = negatives + 1;
        if(num5 == 0) zeros = zeros + 1;

        // display the final result.
        System.out.printf("%nNumber of positives = %d%nNumber of negatives = %d%nNumber of zeros     = %d%n",
		          positives, negatives, zeros);
    }
}
