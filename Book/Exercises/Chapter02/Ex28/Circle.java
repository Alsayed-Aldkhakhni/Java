/*
 * File name: Circle.java
 *
 * Subject: Calculate the circle's  area, diameter and circumfrence.
 *
 * Date: March 11, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: April 2nd, 2024
 */

// import declaration.
import java.util.Scanner; 

public class Circle // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate an object to read the user's input at the keyboard.  
        Scanner input = new Scanner(System.in);

        // prompt the user to enter the circle's radius.
        System.out.print("Enter circle's radius: ");
		
	// read the radius using 'input' object.
        int radius = input.nextInt(); 
        
	System.out.println();

        // print the values directly without using memory space.
        System.out.printf("Diameter = %d%n", 2 * radius);               // diameter.
        System.out.printf("Area     = %f%n", Math.PI * radius * radius);// area.
        System.out.printf("Circum   = %f%n", 2 * Math.PI * radius);     // circumfrence.
    	System.out.println(); // a newline.
    }   
}
