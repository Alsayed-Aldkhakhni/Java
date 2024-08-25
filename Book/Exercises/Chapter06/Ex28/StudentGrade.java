/*
 * File name: StudentGrade.java
 *
 * Subject: Calculate the student quality of his points.
 * 
 * Date: August 25, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 25, 2024 at [07:00 AM]
 *
 * */

import java.util.Scanner; // import declaration, to read the user's data.
public class StudentGrade // class  declaration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a student's grade: ");
		int points = input.nextInt();

		if(points <= 100 && points >= 0)
			System.out.printf("Students state: %d%n%n", qualityPoints(points));
		else
			System.out.println("Invalid grade limit.");
	}

	public static int qualityPoints(int points)
	{
		switch(points/10)
		{
			// 90-100.
			case 10:
			case 9:	 return 4;

			// 80+
			case 8:  return 3;

			// 70+
			case 7:  return 2;

			// 60+
			case 6:  return 1;

			// 59-, or any invalid data.
			default: return 0;
		}
	}
}




