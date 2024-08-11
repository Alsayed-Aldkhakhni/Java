/*
 * File name: SalesCommission.java
 *
 * Subject: Calculate the commission of salespeople.
 *
 * Date: March 22, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [10:20 AM]
 *
 * */

import java.util.Scanner;   // import declaration to read the user's input.
public class SalesCommission// class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        int count = 1;
       	double totalValues = 0;

	// print the headers.
	System.out.println("Item\tValue");
	System.out.printf("%d\t", count++);
        double valueOfItem = input.nextDouble();

	// valiedate the value.
	 if(valueOfItem < 0)
                System.out.printf("%.2f Invalid value.", valueOfItem);
           
	// read the rest.
        while(valueOfItem >= 0)
        {
		totalValues += valueOfItem;

		System.out.printf("%d\t", count++);
		valueOfItem = input.nextDouble();
        }
        
	// display the salesperson commission.
        double salespersonCommission = 200.0 + (0.09 * totalValues);
        System.out.printf("%nSalesperson's commission is: $%,.2f%n", salespersonCommission);  
    } 
}
