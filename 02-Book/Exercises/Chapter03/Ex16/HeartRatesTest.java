/*
 * File name: HeartRates.java
 *
 * Subject: Test the HeartRates class.
 * 
 * Date: August 6, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [7:15 PM]
 *
 * */


import java.util.Scanner;  // import declaration.
public class HeartRatesTest// class  declaration.
{
	public static void main(String[] args)
	{
		// reads the user's data at the keyboard.
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your 1st name:  ");
		String fName = input.next();

		System.out.print("Enter your last name: ");
		String lName = input.next();
	
		// read the date of birth.	
		System.out.println("Your date of birth...");
		System.out.print("Enter month: ");
		int month = input.nextInt();

		System.out.print("Enter day:   ");
		int day = input.nextInt();

		System.out.print("Enter year:  ");
		int year = input.nextInt();

		HeartRates HR1 = new HeartRates(fName, lName, month, day, year);

		System.out.println("============================================");
		System.out.printf("Hi, %s%nYour age: %d%nMaximum heart rate: %d bpm.%nTarget heart rate:  %.2f%n",
			       	 HR1.get1stName() + " " + HR1.get2ndName(), HR1.getAge(), HR1.getMaxRate(),
				 HR1.getTargetRate());
		System.out.println("============================================");
	}
}


