/*
 * Subject: A program that emulates the date.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: April 20, 2024
 */

// import declaration.
import java.util.Scanner;

public class DateTest // class declaration.
{
    public static void main(String[] args)
    {
	// instantiate two objects one to read the user's input at the keyboard
	//  ,input, and the other is to present today's date will entered by the user.
        Scanner input = new Scanner(System.in);
        Date date1    = new Date(0, 0, 0);
        
	// prompt him for the month.
        System.out.print("The current month: ");
        date1.setMonth(input.nextInt());
		
	// prompt him for the day.
        System.out.print("The current day: ");
        date1.setDay(input.nextInt()); 
		
        // prompt him for the year.
        System.out.print("The current year: ");
        date1.setYear(input.nextInt());
        
	// finaly print the entered date.
        date1.displayDate();
    }
}


