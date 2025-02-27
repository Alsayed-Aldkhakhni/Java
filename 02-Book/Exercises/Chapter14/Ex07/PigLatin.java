/*
 * File Name: PigLatin.java
 *
 * Subject  : A program that converts the English sentences into Latin.
 *
 * Date     : October 31, 2024
 *
 * Author   : Alsayed A. Khaleel
 *
 * Last mod : October 31, 2024
 *
 * */


import java.util.Scanner;// import declaration.
public class PigLatin    // class  declaration.
{
        public static void main(String[] args)
        {
                Scanner input = new Scanner(System.in); // to read the user's input at the keyboard.
                System.out.print("Enter a sentence: "); // prompt the user to enter a sentence.
                String sentence = input.nextLine();     // store it in sentence variable.
                
                String[] words = sentence.split(" ");   // shrink it into words.
                
                // convert the words.
                for(String word: words)
                	System.out.printf("%s ", toLatinWord(word));
        }

        // convert an English word into Latin one method.
        public static String toLatinWord(String EnglishWord)
        {
        	// temporary string to process the word.
        	StringBuilder tempStr = new StringBuilder(EnglishWord);
        
        	// lower the 1st char in case it's upper.
        	tempStr.setCharAt(0, Character.toLowerCase(tempStr.charAt(0)));
        	
        	// move the 1st char to the end of the word.
        	tempStr.append(tempStr.charAt(0));
        	tempStr.deleteCharAt(0);
        	
        	tempStr.append("ay");     // add the "ay" phoneme.
        	return tempStr.toString();// processed string.
        }
}


