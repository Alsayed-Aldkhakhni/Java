/*
 * File name: StudentState.java
 *
 * Subject: Check the students' states in a class.
 *
 * Date: March 22, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [02:10 PM]
 * 
 **/


import java.util.Scanner; // import declaration to read the user's input.
public class StudentState // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int passes = 0;
        int failures = 0;
        int studentCount = 1;
        
        while (studentCounter <= 10)
        {
            // prompt user for input and obtain value from user
            System.out.print("Enter result (1 = pass, 2 = fail): ");
            int result = input.nextInt();
        
            if (result == 1)
            {
                passes++;
                studentCount++;
            }
            else if(result == 2)
            {
                failures++;
                studentCount++;
            }
            else
            {
                System.out.println("Invalid input, try again.");
            }
        }
        
        
        System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
        
        // determine whether more than 8 students passed.
        if (passes > 8)
            System.out.println("Bonus to instructor!");
    }
}




