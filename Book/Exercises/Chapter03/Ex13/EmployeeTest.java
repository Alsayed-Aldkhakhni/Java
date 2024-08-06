/*
 * File name: EmployeeTest.java
 *
 * Subject: A program that emulates organization's employees.
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 * Last modification: April 19, 2024
 */

import java.util.Scanner; // import declaration.

public class EmployeeTest // class declaration.
{
    public static void main(String[] args)
    {
        // instantiate an object of type Scanner to read the user's input.
        Scanner input = new Scanner(System.in);
        
        // instantiate two object represent two emplyees.
        Employee emp1 = new Employee("", "", 0.0);
        Employee emp2 = new Employee("", "", 0.0);
        
        // prompt messegaes tell the user to enter the emplyee's data.
        System.out.println("--------------1st employee---------------");
        
	// his first name.
        System.out.print("Enter first name: ");
        emp1.setFirstName(input.next());
        
        // his last name.
        System.out.print("Enter last name:  ");
        emp1.setLastName(input.next());
        
        // his salary.
        System.out.print("Enter salary:     ");
        emp1.setSalary(input.nextDouble());
        
        // prompt him again for the second emplyee.
        System.out.println("\n\n--------------2nd employee---------------");
        
        System.out.print("Enter first name: ");
        emp2.setFirstName(input.next());
        
        System.out.print("Enter last name:  ");
        emp2.setLastName(input.next());
        
        System.out.print("Enter salary:     ");
        emp2.setSalary(input.nextDouble());  
        
        // just a seperator.
        System.out.println("\n\n");
        
        // give both emplyees a raise.
        emp1.giveARaise(10.5);
        emp2.giveARaise(11);

        // print the data stored about both employees.
	System.out.printf("Name:    %s%nSalary:  $%,.2f%n", emp1.getFirstName() + " " + emp1.getLastName(), emp1.getSalary()*12);
	System.out.println();
	System.out.printf("Name:    %s%nSalary:  $%,.2f%n", emp2.getFirstName() + " " + emp2.getLastName(), emp2.getSalary()*12);
    }
}
