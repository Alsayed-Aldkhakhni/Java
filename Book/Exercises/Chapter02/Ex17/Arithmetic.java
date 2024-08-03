/*
 * File name: Arithmetic.java
 *
 * Subject: A program takes 3 integers and get the sum and average.
 * 
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 3, 2024 --> [11:48 AM]
 *
 * */

// import declaration.
import java.util.Scanner; 

public class Arithmetic // class declaration.
{
    public static void main(String[] args) 
    {   // take an object to read the user's data at the keyboard.
	Scanner input = new Scanner(System.in);

        // prompt the user to enter the first integer.
        System.out.print("Enter the 1st number: ");

        // read it using 'input' objcet and store the value in 'number1'.
        int number1 = input.nextInt();

        // 2nd integer.
        System.out.print("Enter the 2nd number: ");
        int number2 = input.nextInt();

        // 3rd integer.
        System.out.print("Enter the 3rd number: ");
        int number3 = input.nextInt();
        
        // carry out some calculations and sotre the values in the following variables.
        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;
        
	// intialize needed variables to find the biggest and the smallest number of them.
        int smallest = 0; 
        int largest  = 0;
        
        // if 'number1' is greater than 'number2'.
        if(number1 > number2)
            if(number1 > number3) // and at the same time it is greater than 'number3'
                largest = number1;// so it is the biggest.
        
        // if 'number2' is the biggest.
        if(number2 > number1)
            if(number2 > number3)
                largest = number2;
        
        // if 'number3' is the biggest.
        if(number3 > number1)
            if(number3 > number2)
                largest = number3;
        
        //-------------------------------------------------------------------------------//
        
        // if 'number1' is the smaller than 'number2'.
        if(number1 < number2)
            if(number1 < number3) // and at the same time it is smaller than 'number3'.
                smallest = number1;// so it is the smallest one.
        
        // if 'number2' is the smaller than 'number1'.
        if(number2 < number1)
            if(number2 < number3)
                smallest = number2;
        
        // if 'number3' is the smaller than 'number1'.
        if(number3 < number1)
            if(number3 < number2)
                smallest = number3;

       // display the results stored in the these variables.
       System.out.printf("%nSmallest = %d%nLargest  = %d%nSum      = %d%nAverage  = %d%nProduct  = %d%n",
                         smallest, largest, sum, average, product);   
    }
}
