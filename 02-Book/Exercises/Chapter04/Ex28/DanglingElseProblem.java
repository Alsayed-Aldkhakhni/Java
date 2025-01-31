/*
 * File name: DanglingElseProblem.java
 *
 * Subject: Solve the problem of dangling else.
 *
 * Date: March 21, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [02:29 PM]
 *
 * */


public class DanglingElseProblem // class declaration.
{
    public static void main(String[] args)
    {
        int x = 5;
        int y = 8;
        
        System.out.println("a)");

        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
       	    else
                System.out.println("#####");
        
        System.out.println("$$$$$");
        System.out.println("&&&&&");
        
        /*
            a) Assuming that x = 5 and y = 8, the following output is produced:
                @@@@@
                $$$$$
                &&&&&
        */

        //----------------------------------------------------------------------
        
        System.out.println("\nb)");
        
        if (y == 8)
        {
            if (x == 5)
                System.out.println("@@@@@");
            else
                System.out.println("#####");
        }
        else
        {
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

        
        /*
            b) Assuming that x = 5 and y = 8, the following output is produced:
                @@@@@
        */
        
        //----------------------------------------------------------------------
        
        System.out.println("\nc)");

        
        if (y == 8)
            if (x == 5)
                System.out.println("@@@@@");
            else
            {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
                
        /*
            c) Assuming that x = 5 and y = 8, the following output is produced:
                @@@@@
        */
        
        //----------------------------------------------------------------------

        System.out.println("\nd)");
        
        y = 7;
        
        if (y == 8)
        {
            if (x == 5)
                System.out.println("@@@@@");
        }
        else
        {
            System.out.println("#####");
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

	/*
	
	d) Assuming that x = 5 and y = 7, the following output is produced. [Note: The last three
	   output statements after the else are all part of a block.]
		#####
		$$$$$
		&&&&&
	*/

	System.out.println();
       //----------------------------------------------------------------------
    }
}
