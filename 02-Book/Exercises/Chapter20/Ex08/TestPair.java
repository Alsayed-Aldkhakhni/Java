/*
 * File name: TestPair.java
 * 
 * Subject  : Test the class Pair.
 * 
 * Date     : Feb 10, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

public class TestPair // class declaration.
{
	public static void main(String[] args)
	{
		// 1st Pair, name and its age.
		Pair<String, Integer> number1 = new Pair<String, Integer>();
		number1.set1st("Alsayed Ali Alsayed");
		number1.set2nd(21);
		System.out.println(number1.get1st() +" is "+ number1.get2nd() +" years old.");
		
		// 2nd Pair, name and its age.
		Pair<String, Integer> number2 = new Pair<String, Integer>();
		number2.set1st("Hassen Ibrahiem Ahmed");
		number2.set2nd(45);
		System.out.println(number2.get1st() +" is "+ number2.get2nd() +" years old.");

		// 3rd Pair, name and its age.
		Pair<String, Integer> number3 = new Pair<String, Integer>();
		number3.set1st("Moamen Adel Ashraf");
		number3.set2nd(30);
		System.out.println(number3.get1st() +" is "+ number3.get2nd() +" years old.");
	}
}
