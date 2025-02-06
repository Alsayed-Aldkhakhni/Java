/*
 * File name: CountDupWords.java
 *  
 * Subject  : Count the duplicated words in a statement.
 *
 * Author   : Alsayed A. Khaleel
 *  
 * Date     : Feb 3, 2025
 */

// import(s) declaration.
import java.util.*;

public class CountDupWords // class declaration.
{
	public static void main(String[] args)
	{
		try(Scanner input = new Scanner(System.in))
		{
			// read the statement from the user.
			System.out.print("Enter a statement: ");
			String str = input.nextLine();
			
			// create the map.
			Map<String, Integer> mapOfWords = createMap(str);
			
			// display the duplications.
			showDublications(mapOfWords);
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	// convert the str to char-int pair map.
	public static Map<String, Integer> createMap(String statement)
	{
		// the map that hold the values and keys.
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// divide the statement into words.
		String[] tokens = statement.split(" ");
		
		// fill the map.
		for(String token : tokens)                     // go through the array of tokens.
		{
			token = token.toLowerCase();               // ignore the sensitivity.
			
			if(token.matches("( |[.,?!:;\'\"])"))      // ignore the punctuation.
				continue;
			else if(map.containsKey(token))            // if we have at least one of it.
			{
				int occurrences =  map.get(token) + 1; // increase occurrences.
				map.put(token, occurrences);           // overwrite the old value.
			}
			else
				map.put(token, 1);                     // set the 1st occurrence.
		}
		
		return map;
	}
	
	// print the number of replicas of a word.
	public static void showDublications(Map<String, Integer> mapOfWords)
	{
		// get the sorted keys. 
		Set<String> keys = new TreeSet<String>(mapOfWords.keySet());
		
		// print the map's content.
		for(String key : keys)
		{
			if(mapOfWords.get(key) > 1)
				System.out.printf("%-10s%s%n", key, " dublicated "+ (mapOfWords.get(key) - 1) +" time(s).");
		}
	}
}

