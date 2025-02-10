/*
 * File name: InvalidSubscriptException.java 
 * 
 * Subject  : Customizing our own exception class.
 * 
 * Date     : Feb 8, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

public class InvalidSubscriptException extends RuntimeException
{
	// the default exception message.
	public InvalidSubscriptException() { super("Invalid Subscript"); }

	// supported exception message.
	public InvalidSubscriptException(String msg) { super(msg); }
}
