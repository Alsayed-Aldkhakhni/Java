/* 
 * 
 *  File name : IntegerSet.java
 *  
 * Subject    : Construct class IntegerSet to stores numbers 0-99.
 * 
 * Date       : September 16, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 16, 2024
 * 
 * */

public class IntegerSet // class declaration.
{
	// instance variable.
	private boolean[] set;
	
	// assign a reference to set.
	IntegerSet() { set = new boolean[100]; }
	
	// add a number to the set.
	public void insertElement(int k)
	{
		// the index before accessing.
		if(k < 0 || k >= 100)
			throw new IllegalArgumentException("Invalid range, it is must be 0-99");
		
		// do you have it?
		if(set[k] == true)
			System.out.println("Item is already exist.");
		else
			set[k] = true;
	}
	
	// delete an item from it.
	public void deleteElement(int m)
	{
		// validate the index.
		if(m < 0 || m >= 100)
			throw new IllegalArgumentException("Invalid range, it is must be 0-99");
	
		// is it empty?
		if(set.length == 0)
			System.out.println("---");
		else
			set[m] = false;
	}
	
	// return a list of the numbers.
	public String toString()
	{
		String str = ""; // define an empty String to hold the list.
		
		// find out the existing numbers.
		for(int i = 0; i < set.length; i++)
		{
			if(set[i] == true)
			{
				// add them to our String list.
				str += Integer.toString(i);
				str += ", ";
			}
		}
		
		// return the list if any.
		return (str == "" ? "---" : str); 
	}
	
	// check if two IntegerSet objects contain the same data.
	public boolean isEqual(IntegerSet st)
	{
		for(int i = 0; i < st.set.length; i++)
		{
			// if any difference, stop immediately.
			if(st.set[i] != this.set[i])
				return false;
		}
		
		// 25 27 so far so good :-).
		return true;
	}
	
	// find the union between two sets.
	// union needs the same item to be exist in one set at least.
	public static IntegerSet union(IntegerSet set1, IntegerSet set2)
	{
		IntegerSet newSet = new IntegerSet();
		
		for(int i = 0; i < newSet.set.length; i++)
		{
			if(set1.set[i] == true || set2.set[i] == true)
				newSet.set[i] = true;
		}
		
		return newSet;
	}

	// find the intersection between two sets.
	// intersection needs item to be exist in both sets.
	public static IntegerSet intersection(IntegerSet set1, IntegerSet set2)
	{
		IntegerSet newSet = new IntegerSet();
		
		for(int i = 0; i < newSet.set.length; i++)
		{
			if(set1.set[i] == false || set2.set[i] == false)
				newSet.set[i] = false;
			else
				newSet.set[i] = true;
		}
		
		return newSet;
	}	
}

