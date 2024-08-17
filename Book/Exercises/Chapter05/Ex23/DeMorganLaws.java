/*
 * File name: DeMorgansLaws.java
 *
 * Subject: A program that evaluates some expressions using 'De Morgan's Laws'.
 *
 * Date: April 07, 2024
 *
 * Author: Alsayed_Ali_Aldkhakhni
 *
 * Last modification: August 16, 2024 at [02:15 PM]
 *
 * */
 
public class DeMorgansLaws // class declaration.
{
 	public static void main(String[] args)
 	{
	   // define the varibles that will be used through the program.
	   int x = 1, y = 2, i = 3, j = 4, g = 5, a = 6, b = 7;
 	    
	   // print the values of the varibles to the user.
 	   System.out.printf("Variables' values:%nx = %d, y = %d%ni = %d, j = %d%ng = %d, a = %d, b = %d%n%n", x, y, i, j, g, a, b);
 	    
	   // &&. operator.
 	   System.out.printf("!(x < 5) && !(y >= 7) = %b%n", !(x < 5) && !(y >= 7));
 	   System.out.printf(" (x > 5) &&  (y <= 7) = %b%n", (x > 5) && (y <= 7));
 	    
 	   System.out.println();
 	     	    
	   // ||. operator.
 	   System.out.printf("!(a == b) || !(g != 5) = %b%n", !(a == b) || !(g != 5));
 	   System.out.printf(" (a != b) ||  (g == 5) = %b%n", (a != b) || (g == 5));
 	    
 	   System.out.println();

	   // &&, ||. operators.
 	   System.out.printf("!((x <= 8) && (y > 4))) = %b%n", !((x <= 8) && (y > 4)));
 	   System.out.printf(" ((x >= 8) || (y < 4))  = %b%n", ((x >= 8) || (y < 4)));
 	    
 	   System.out.println();
		
	   // ||, &&. operators.
 	   System.out.printf("!((i > 4) || (j <= 6)) = %b%n",  !((i > 4) || (j <= 6)));
 	   System.out.printf(" ((i < 4) && (j >= 6)) = %b%n",  ((i < 4) && (j >= 6))); 
 	}
}











