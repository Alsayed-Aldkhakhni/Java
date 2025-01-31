/*
 * File name: Tabular.java
 *
 * Subject: Print a table of squared and qubic numbers from 1 to 5.
 *
 * Date: March 19, 2024
 *
 * Author: Alsayed Ali Aldkhakhni
 *
 * Last modification: August 11, 2024 at [12:42 PM]
 *
 * */

public class Tabular // class declaration.
{
    public static void main(String[] args)
    {
        int num = 1;
        System.out.println("N\tN*10\tN*100\tN*1000");
        
        while(num <= 5)
        {
            System.out.printf("%d\t%d\t%d\t%d%n", num, num*10, num*100, num*1000);
            num++;
        }
    }
}
