 /*
 * File Name: RandnomSentences.java
 *
 * Subject  : Program to generate random sentences. 
 *
 * Date     : October 29, 2024
 *
 * Author   : Alsayed A. Aldkhakhni
 *
 * Last mod : October 29, 2024
 *
 * */

import java.util.Scanner;         // import declaration.
import java.security.SecureRandom;
public class RandomSentences      // class decalration.
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);	 // to read the user's input at the keyboard.
		SecureRandom random = new SecureRandom();// to generate the random indexes to access the arrays.

		// the arrays will make up the random sentences.
		String[] articles = {"the", "a", "one", "some" ,"any"};
	        String[] nouns = {"boy", "girl", "dog", "town", "car"};
	       	String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
	       	String[] prepositions = {"to", "from", "over", "under", "on"};

		// to hold the string sentence.
		StringBuilder sentence = new StringBuilder(75);	

		for(int i = 0; i < 20; i++)
		{
			// make up the sentence randomly.
			sentence.append(articles[random.nextInt(5)])
				.append(" ")
				.append(nouns[random.nextInt(5)])	
				.append(" ")
				.append(verbs[random.nextInt(5)])	
				.append(" ")
				.append(prepositions[random.nextInt(5)])	
				.append(" ")
				.append(articles[random.nextInt(5)])	
				.append(" ")
				.append(nouns[random.nextInt(5)])
				.append(".");

			// upper the 1st character in the sentence.
			sentence.setCharAt(0, Character.toUpperCase(sentence.charAt(0)));

			// print the sentence and its number.
			System.out.printf("Sentence #%02d: %s%n",i+1 , sentence);

			// remove the current sentence to start over again.
			sentence.setLength(0); 
		}	
	}
}



