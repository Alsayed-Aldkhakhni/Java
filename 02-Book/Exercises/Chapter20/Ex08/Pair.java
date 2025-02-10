/*
 * File name: Pair.java
 * 
 * Subject  : A generic class for a pair of 2 values.
 * 
 * Date     : Feb 10, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

public class Pair<F, S> // class declaration.
{
	// instance variables.
	private F first;
	private S second;
	
	// methods related to first instance variable.
	public void set1st(F first) { this.first = first; }
	public F    get1st(       ) { return this.first;  }
	
	// methods related to second instance variable.
	public void set2nd(S second) { this.second = second; }
	public S    get2nd(        ) { return this.second;   }
}
