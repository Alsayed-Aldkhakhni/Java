/*
 * File name: GasMileage.java
 *
 * Subject: Program to mileage the automobiles get.
 *
 * Date: March 17, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 10, 2024 at [03:02 PM]
 *
 * */

import java.util.Scanner; // import declaration.
public class GasMileage   // class declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int miles = 0, gallons = 0;
        int totalMiles = 0, totalGallons = 0;

        System.out.print("Enter the miles:   ");
        miles = input.nextInt();
        
        System.out.print("Enter the gallons: ");
        gallons = input.nextInt();


        while(miles != 0)
        {
	    System.out.println("\nEnter 0 to stop.");

    	    if(miles > 0)
		    if(gallons > 0)
			    System.out.printf("The mileage for this trip: %,.2f%n", (double)miles/gallons);
	    	    else
		    	    System.out.printf("Invalid gallons.%n");
	    else
		    System.out.printf("Invalid miles.%n");

	    totalMiles   += miles;
            totalGallons += gallons;

            System.out.println('\n');

            System.out.print("Enter the miles:   ");
            miles = input.nextInt();
        
            System.out.print("Enter the gallons: ");
            gallons = input.nextInt();
         }
        
        System.out.printf("Average miles per gallon: %,.2f%n%n", (double)totalMiles / totalGallons);
    }
}
