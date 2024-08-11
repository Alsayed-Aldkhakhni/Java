/* File name: SalaryCalculator.java
 *
 * Subject: Calculate the employee's gross pay.
 *
 * Date: March 22, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [12:20 PM]
 *
 *  */

import java.util.Scanner;    // import declaration, to get the user's data.
public class SalaryCalculator// class  decalration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);        
        int count = 1;  
   	double pay = 0;
	double hoursNum = 0.0;
	double hourlyRate = 0.0;

	// read data for 3 employees.
    	while(count <= 3)
        {
	    	System.out.printf("Enter employee's #%d hours number: ", count);
	        hoursNum =  input.nextDouble();

	        System.out.printf("Enter employee's #%d hourly rate:  ", count);
        	hourlyRate =  input.nextDouble();  
	
		pay = hoursNum > 40 ? hourlyRate * 40 + (hoursNum - 40) * (hourlyRate * 1.5): hourlyRate * hoursNum;
		System.out.printf("Employee #%d's pay: $%,.2f%n%n", count++, pay);
	}	

   }
}
