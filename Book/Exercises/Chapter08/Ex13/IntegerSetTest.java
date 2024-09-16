/* 
 * 
 *  File name : IntegerSetTest.java
 *  
 * Subject    : Test the class IntegerSet.
 * 
 * Date       : September 16, 2024
 * 
 * Author     : Alsayed A. Aldkhakhni
 * 
 * Last mod   : September 16, 2024
 * 
 * */


public class IntegerSetTest // class declaration.
{
	public static void main(String[] args)
	{
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		for(int i = 0; i < 15; i++)
		{
			set1.insertElement(i);
			set2.insertElement(i);
		}
		
		// print numbers stored in both sets.
		System.out.printf("Set1: %s%n", set1);
		System.out.printf("Set2: %s%n", set1);
		
		System.out.println();
		
		// check if they are equal.
		System.out.printf("set1 %s set2.%n", (set1.isEqual(set2) == true ? "is equal to" : "isn't equal to"));
		
		// remove some data from set1.
		set1.deleteElement(0);
		set1.deleteElement(5);
		set1.deleteElement(8);
		set1.deleteElement(11);
		
		// remove some data from set2.
		set2.deleteElement(1);
		set2.deleteElement(4);
		set2.deleteElement(9);
		set2.deleteElement(12);
		
		// find the union and the intersection of them.
		IntegerSet set3 = IntegerSet.intersection(set1, set2);
		IntegerSet set4 = IntegerSet.union(set1, set2);

		System.out.println();
		
		// print them.
		System.out.printf("Union of set1 and set3: %s%n", set4);
		System.out.printf("Intersection of set1,3: %s%n", set3);
	}
}