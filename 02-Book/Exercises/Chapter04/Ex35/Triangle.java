/*
 * Subject: A program that calculates whether three lengths entered by the user are valid to represent a triangle or not.
 *
 * Date: March 22th, 2024
 *
 * Author: Alsayed Aldkhakhni
 *
 */
package triangle;
import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the opposite of the triangle:   ");
        double opposite = input.nextDouble();
                
        System.out.print("Enter the adjacent of the triangle:   ");
        double adjacent = input.nextDouble(); 
        
        System.out.print("Enter the hypotenuse of the triangle: ");
        double hypotenuse = input.nextDouble();
        
        /*
	 * Rules to decide.

            a+b > c
            a+c > b
            b+c > a
        */
        
        System.out.println();
        
        if(opposite + adjacent > hypotenuse)
        {
            if(opposite + hypotenuse > adjacent)
            {
                if(hypotenuse + adjacent > opposite)
			System.out.println("Can represent a triangle.");
                else
			System.out.println("Can't represent a triangle.");
            }
            else
                System.out.println("Can't represent a triangle.");
        }
        else
        {
            System.out.println("Can't represent a triangle.");
        }
    }
}






