/*
 * File name: RightTriangle.java
 *
 * Subject: Do three lengths can make a right triangle.
 * 
 * Date: March 22, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 12, 2024 at [11:07 AM]
 *
 * */


import java.util.Scanner; // import declaration, to read the user's input.
public class RightTriangle// class  declaration.
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
	 * The rule.
            a*a + b*b = c*c
        */
        
        System.out.println();
        
        if(hypotenuse*hypotenuse == adjacent*adjacent + opposite*opposite)
            System.out.println("Can represent a right triangle.");
        else
            System.out.println("Can't represent a right triangle.");
        
        System.out.println();
    }
}






