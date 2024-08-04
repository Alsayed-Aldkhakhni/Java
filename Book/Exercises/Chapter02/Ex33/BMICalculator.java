/*
 * File name: BMICalculator.java
 *
 * Subject: Body Mass Index Calculator.
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Ali
 * 
 * Last modification: August 4, 2024 --> [12:10 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class BMICalculator // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate an object to read the user's input at the keyboard.
        Scanner input = new Scanner(System.in);
              
        // prompt the user to enter the weight.
        System.out.print("Enter your weight in kilograms: ");
       	
	// read it and store the value in 'weightInKilograms'.
        int weightInKilograms = input.nextInt();
        
        // prompt the user to enter the height.
        System.out.print("Enter your height in centimeters: ");
        double heightInMeters = input.nextFloat();
        
        // convert the height from centimeters to meters.
        heightInMeters = heightInMeters / 100.0;
        
        // calculate the person's BMI.
        double BMI = weightInKilograms / (heightInMeters * heightInMeters);

        // print the result.
        System.out.printf("Your BMI: %.1f%n", BMI);
        
        // some standards to inform the user his status.
        System.out.print("\n====================================");
        System.out.print("\n-------------BMI VALUES-------------\n");
        System.out.print("Underweight: less than 18.5\n");
        System.out.print("Normal:      between 18.5 and 24.9\n");
        System.out.print("Overweight:  between 25 and 29.9\n");
        System.out.print("Obese:       30 or greater\n");
        System.out.println("====================================");
    }
}
