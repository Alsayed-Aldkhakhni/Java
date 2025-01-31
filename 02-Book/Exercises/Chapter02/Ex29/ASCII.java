/*
 * File name: ASCII.java
 *
 * Subject: Print the corresponding ASCII value of characters.
 *
 * Date: March 11, 2024
 *
 * Author: Alsayed-Aldkhakhni
 *
 * Last modification: August 4, 2024 --> [11:23 AM]
 */


public class ASCII // class declaration.
{
    public static void main(String[] args)
    {
	// using unary cast operator to exchange the characters to their integer values.
        System.out.printf("The character %c has the value %d%n",   'A', (int)'A');
        System.out.printf("The character %c has the value %d%n",   'B', (int)'B');
        System.out.printf("The character %c has the value %d%n%n", 'C', (int)'C');
        
        System.out.printf("The character %c has the value %d%n",   'a', (int)'a');
        System.out.printf("The character %c has the value %d%n",   'b', (int)'b');
        System.out.printf("The character %c has the value %d%n%n", 'c', (int)'c');
        
        System.out.printf("The character %c has the value %d%n",   '0', (int)'0');
        System.out.printf("The character %c has the value %d%n",   '1', (int)'1');
        System.out.printf("The character %c has the value %d%n%n", '2', (int)'2');
        
        System.out.printf("The character %c has the value %d%n", '*', (int)'*');
        System.out.printf("The character %c has the value %d%n", '+', (int)'+');
        System.out.printf("The character %c has the value %d%n", '/', (int)'/');
        System.out.printf("The character %c has the value %d%n", ' ', (int)' ');
    } 
}
