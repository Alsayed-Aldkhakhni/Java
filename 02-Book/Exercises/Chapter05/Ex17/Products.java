/*
 * File name: Products.java
 *
 * Subject: Calculate the total price of sold items.
 *
 * Date: April 07, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [04:00 PM]
 *
 * */


import java.util.Scanner; // import declaration.
public class Products     // class declaration.
{
 	public static void main(String[] args)
 	{	
		// instantiate an object of type 'Scanner' to read user's data at the keyboard.
		Scanner input = new Scanner(System.in);
		
		// vairables to hold the data.
 		double totalPrice = 0;
		int itemsNum;
		int productNumber = 0;
		
		do
        	{
			// prompt the user to enter the product's number.
        		System.out.print("Enter the product number: ");
			
			productNumber = input.nextInt();
           
		        // the price.	
            		System.out.print("How many items sold: ");
			
			itemsNum = input.nextInt();
			System.out.println();
			
			// take the appropriate action based on user's input.
			switch(productNumber)
		       	{
			case 1:
				totalPrice += itemsNum * 2.98;
				break;
                
			case 2:
				totalPrice += itemsNum *4.50;
				break;
				
			case 3:
				totalPrice += itemsNum * 9.98;
				break;
				
			case 4:
				totalPrice += itemsNum * 4.49;
				break;
				
			case 5:
				totalPrice += itemsNum * 6.87;
				break;
				
			default:
				System.out.println(productNumber + ", invalid input");
	     		}

		}while(productNumber < 6);
        
		System.out.printf("Total price of sold items is: $%,.2f%n",totalPrice);
	}
}







