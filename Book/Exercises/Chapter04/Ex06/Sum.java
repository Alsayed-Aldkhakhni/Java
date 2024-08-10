/*
 * File name: Sum.java
 *
 * Subject: A program tha calculates the sum of numbers from 1 to 10.
 *
 * Date: March 17, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 10, 2024
 *
 * */


public class Sum // class declaration.
{
    public static void main(String[] args)
    {
        int x = 1;
        int sum = 0;
        
        while(x != 11) 	sum += x++;
        
        System.out.printf("The sum of [1, 10] is: %d%n", sum);
    }
}
