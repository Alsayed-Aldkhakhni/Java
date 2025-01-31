/*
 * File name: SquaresCubes.java
 *
 * Subject: Table of Squares and Cubes of [0, 10].
 *
 * Date: March 10, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 4, 2024 --> [11:39 AM]
 *
 * */


public class SquaresCubes // class declaration.
{
    public static void main(String[] args)
    {
	// print the headers.
        System.out.println("number  square  cube");
        
	// print data in three columns.
        System.out.printf("%d       %d       %d%n", 0, 0*0, 0*0*0);
        System.out.printf("%d       %d       %d%n", 1, 1*1, 1*1*1);
        System.out.printf("%d       %d       %d%n", 2, 2*2, 2*2*2);
	System.out.printf("%d       %d       %d%n", 3, 3*3, 3*3*3);
        System.out.printf("%d       %d      %d%n", 4, 4*4, 4*4*4);        
        System.out.printf("%d       %d      %d%n", 5, 5*5, 5*5*5);
        System.out.printf("%d       %d      %d%n", 6, 6*6, 6*6*6);        
        System.out.printf("%d       %d      %d%n", 7, 7*7, 7*7*7);
        System.out.printf("%d       %d      %d%n", 8, 8*8, 8*8*8);
        System.out.printf("%d       %d      %d%n", 9, 9*9, 9*9*9);
        System.out.printf("%d      %d     %d%n", 10, 10*10, 10*10*10);

    }
}
