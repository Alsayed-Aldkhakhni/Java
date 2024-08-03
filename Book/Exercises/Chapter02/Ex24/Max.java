/*
 * File name: Max.java
 *
 * Subject: Find the largest and smallest integer of 5s.
 * 
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [12:06 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class Max // class declaration.
{
    public static void main(String[] args)
    {  
	// take an objcet to read the user's data.
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the first number.
        System.out.print("Enter the 1st number: ");

        // read the number from the user.
	int number1 = input.nextInt();

        // the 2nd number.
        System.out.print("Enter the 2nd number: ");
        int number2 = input.nextInt();
        
        // the 3rd number.
        System.out.print("Enter the 3rd number: ");
        int number3 = input.nextInt();
        
        // the 4th number.
        System.out.print("Enter the 4th number: ");
        int number4 = input.nextInt();
        
        // the 5th number.
        System.out.print("Enter the 5th number: ");
        int number5 = input.nextInt();
        
       	// prepare the variables that will hold
	//  the values of the biggest & smallest. 
        int smallest = 0;
        int largest  = 0;

        // largest number of them.
        if(number1 > number2)             // if 'number1' is bigger than 'number2' and
            if(number1 > number3)         // at the same time is bigger than 'number3' and
                if(number1 > number4)     // also is bigger than 'number4' and
                    if(number1 > number5) // finally is bigger than 'number5'
                        largest = number1;// so it is the biggest number.
               
	// check for 'number2'.
        if(number2 > number3)
            if(number2 > number4)
                if(number2 > number5)
                    if(number2 > number1)
                        largest = number2; 

       // check for 'number3'.
       if(number3 > number2)
            if(number3 > number4)
                if(number3 > number5)
                    if(number3 > number1)
                        largest = number3;
      
       // check for 'number4'.
       if(number4 > number3)
           if(number4 > number2)
               if(number4 > number5)
                  if(number4 > number1)
                      largest = number4; 
        
       // for 'number5'.
        if(number5 > number3)
            if(number5 > number2)
                if(number5 > number4)
                    if(number5 > number1)
                        largest = number5;  
        
        //*********************************************************//

        // smallest number of them.
        if(number1 < number2)            // if 'number1' is smaller than 'number2' and
            if(number1 < number3)        // at the same time it is smaller than 'number3' and 
                if(number1 < number4)    // also is smaller than 'number4' and 
                    if(number1 < number5)// finally is smaller than the last number 'number5'
                        smallest = number1; // so it is the smallest number.

	// for 'number2'.
        if(number2 < number3)
            if(number2 < number4)
                if(number2 < number5)
                    if(number2 < number1)
                        smallest = number2; 
		
       // for 'number3'.
       if(number3 < number2)
            if(number3 < number4)
                if(number3 < number5)
                    if(number3 < number1)
                        smallest = number3;
       
   
	// for 'number4'.
        if(number4 < number3)
            if(number4 < number2)
                if(number4 < number5)
                    if(number4 < number1)
                        smallest = number4; 
        	
	// for 'number5'.
        if(number5 < number3)
            if(number5 < number2)
                if(number5 < number4)
                    if(number5 < number1)
                        smallest = number5; 
        
        // display the result.
        System.out.printf("%nThe largest number  = %d%nThe smallest number = %d%n", largest, smallest);
    }
}
