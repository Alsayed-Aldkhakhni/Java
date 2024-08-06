/*
 * File name: Store.java
 *
 * Subject: Invoice Management System for Hardware Store
 *
 * Date: March 13, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 6, 2024 --> [5:30 AM]
 *
 * */

// import declaration.
import java.util.Scanner; 

public class Store // class declaration.
{
    public static void main(String[] args)
    {
        // instantiate two objects one to read the user's 
	// data at the keyboard the other is to represent an invoice.
        Scanner input = new Scanner(System.in);
        Invoice inv1 =  new Invoice("", 0.0, 0, "");
        
        // print the initial data stored in the object.
        inv1.printData();
        
        // prompt the user to enter the part number.
        System.out.print("Enter item's number: ");
        inv1.setPartNum(input.nextLine());
        
        // to enter the part or item's description.
        System.out.print("Enter item's description: ");
        inv1.setDescription(input.nextLine());
        
        // the quantity of the items.
        System.out.print("Enter item's quantity: ");
        inv1.setQuantity(input.nextInt());
        
        // the price per one item.
        System.out.print("Enter price per item: ");
        inv1.setPrice(input.nextDouble());  
        
        System.out.println("\n\n");
        
        // print the stored data again.
        inv1.printData();
    }
}
