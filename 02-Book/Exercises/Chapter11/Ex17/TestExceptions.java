/*
 * File name: TestExceptions.java
 * 
 * Subject  : Make sure that a superclass can catch a subclass exception.
 * 
 * Date     : October 6, 2024
 * 
 * Author   : Alsayed A. Aldkhakhni
 * 
 * Last mod : October 6, 2024
 * 
 * */

import java.io.*;           // to use IOException class. 
public class TestExceptions // class declaration.
{
	public static void main(String[] args)
	{
		try {
			throw new ExceptionA();  // an exception of type ExceptionA occurred.
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try {
			throw new ExceptionB();  // an exception of type ExceptionB occurred.
		}
		catch(Exception e){
			System.out.println(e);
		}
		
		try {
			throw new Exception();  // an exception of type Exception occurred.
		}
		catch(Exception e){
			System.out.println(e);
		}

		try {
			throw new IOException();// an exception of type IOException occurred.
		}
		catch(Exception e){
			System.out.println(e);
		}

		try {
			throw new NullPointerException(); // an exception of type NullPointerException occurred.
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
