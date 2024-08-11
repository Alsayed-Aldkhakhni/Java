/*
 * Subject: A program tha takes 10 integers and print the largest 2 numbers.
 *
 * Date: March 19th, 2024
 *
 * Author: Alsayed Ali
 *
 */

import java.util.Scanner; // import declaration.
public class Largest2Nums // class  declaration.
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        int count = 1;
        int num1 = 0, num2 = 0;
        
	while(count <= 10)
        {
            System.out.printf("Enter number #%d: ", count);
            num1 = input.nextInt();
            
	    // swapping the current largest value
	    // with the previous largest one.	    
            if(num1 > num2)
            {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }
            
            count++;
        }
        
        System.out.printf("The 1st largest number: %d.%nThe 2nd largest number: %d.%n", num2, num1);
    }
}




