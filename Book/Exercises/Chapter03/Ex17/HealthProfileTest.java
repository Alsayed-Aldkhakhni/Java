/*
 * File name: HealthProfileTest.java
 *
 * Subject: Test HealthProfile class.
 *
 * Date: August 7, 2024
 *
 * Author: Alsayed Aldkhakhni
 * 
 * Last modification: August 7, 2024 --> [12:10 PM]
 *
 * */

// import declaration.
import java.util.Scanner;

public class HealthProfileTest // class declaration
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

		System.out.print("Enter your gender:  ");
		String gender = input.next();

		System.out.print("Enter your weight:  ");
		double weight = input.nextDouble();

		System.out.print("Enter your height:  ");
		double height = input.nextDouble();

		HealthProfile profile1 = new HealthProfile(fName, lName, month, day, year, weight, height, gender);

		System.out.println("====================================");
		System.out.printf("Hi, %s%nDate of birth: %s%nAge: %d%nWight: %.2f lbs%nHeight: %.2f Foot.%nMaximum heart rate: %d bpm.%nTarget heart rate:  %.2f%n",
			       	 profile1.get1stName() + " " + profile1.get2ndName(), month +"/"+ day +"/"+ year, profile1.getAge(),
				 profile1.getWeight(), profile1.getHeight(), profile1.getMaxRate(), profile1.getTargetRate());
		System.out.println("====================================");
		profile1.getBMI();
	}
}


