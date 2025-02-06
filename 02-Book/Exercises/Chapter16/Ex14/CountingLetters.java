/*
 * File name: CountingLetters.java
 *  
 * Subject  : Count the number of occurrences of chars.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 3, 2025
 */

// import declaration(s).
import java.util.*;

public class CountingLetters // class declaration.
{
	public static void main(String[] args)
	{
		try(Scanner input = new Scanner(System.in))
		{
			System.out.print("Enter a phrase: ");
			String str = input.nextLine();

			showOccurrences( toMap(str) );
		}
		catch(Exception ex) {
			System.out.println(ex.getStackTrace());
		}
	}
	
	// convert the str to char-int pair map.
	public static Map<Character, Integer> toMap(String str)
	{
		// prepare the variables. 
		char[] chs = str.toCharArray();
		Map<Character, Integer> mapOfChars = new HashMap<Character, Integer>();
		
		// fill the map.
		for(Character ch : chs)
		{
			if(mapOfChars.containsKey(ch))
			{
				int occurrences =  mapOfChars.get(ch) + 1; // increase occurrences.
				mapOfChars.put(ch, occurrences);           // overwrite the old value.
			}
			else
				mapOfChars.put(ch, 1);
		}
		
		// give the filled map back to the caller.
		return mapOfChars;
	}
	
	// print the character's occurrences in the passed Map.
	public static void showOccurrences(Map<Character, Integer> map)
	{
		// get the keys of the map in a set.
		Set<Character> setOfChars = new TreeSet<Character>(map.keySet());
		
		for(Character ch : setOfChars)
		{
			int occurrences = map.get(ch); // get the value associated with ch key.
			System.out.println("\'"+ ch +"\' appeared "+ occurrences+ " time(s).");
		}
	}
}


