/*
 * File name: EmptyListException.java
 * 
 * Subject  : Create our exception class that lists throw if they are empty.
 * 
 * Date     : March 14, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package codes;

@SuppressWarnings("serial")
public class EmptyListException extends RuntimeException // class declaration.
{
	// default exception message.
	public EmptyListException() { super("List is empty."); }
	
	// customized exception message.
	public EmptyListException(String message) { super(message); }
}

