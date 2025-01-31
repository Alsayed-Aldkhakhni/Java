/*
 * File name: Checkerboard.java
 *
 * Subject: Print Checkerboard Pattern.
 *
 * Date: March 21, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 12, 2024 at [10:50 AM]
 *
 * */

public class Checkerboard // class declaration.
{
    public static void main(String[] args)
    {
        int lines = 1;

        while(lines <= 8)
        {
	    // the leading space at the even lines.
            if(lines % 2 == 0)
		    System.out.print(" ");
            
	    // line's asterisks.
            int asterisks = 8;
            while(asterisks >= 1)
            {
                System.out.print("* ");
                asterisks--;
            }
            
            System.out.println();
            lines++;
        }
        
    }
}






