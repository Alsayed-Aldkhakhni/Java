/*
 * File name: SelectionSort.java 
 * 
 * Subject  : Make method selectionSort generic.
 * 
 * Date     : Feb 8, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

// import(s) declaration.
import java.security.SecureRandom;
import java.util.Arrays;

public class SelectionSortTest // class declaration.
{
	public static void main(String[] args)
	{
		// random number generator.
		SecureRandom generator = new SecureRandom();
		
		Integer[] data = new Integer[10];     // create array
		for (int i = 0; i < data.length; i++) // populate array
			data[i] = 10 + generator.nextInt(90);
		
		// display array
		System.out.printf("Unsorted array:%n%s%n%n", Arrays.toString(data));
		
		// sort array
		selectionSort(data);
		
		// display array
		System.out.printf("Sorted array:%n%s%n%n", Arrays.toString(data));
	}

	// sort array using selection sort
	public static <T extends Comparable<T>> void selectionSort(T[] data)
	{
		// loop over data.length - 1 elements
		for (int i = 0; i < data.length - 1; i++)
		{
			// first index of remaining array
			int smallest = i;

			// loop to find index of smallest element
			for (int index = i + 1; index < data.length; index++)
				if ((data[index]).compareTo(data[smallest]) < 0)
					smallest = index;

			swap(data, i, smallest);          // swap smallest element into position
			printPass(data, i + 1, smallest); // output pass of algorithm
		}
	}

	// helper method to swap values in two elements
	private static <T> void swap(T[] data, int first, int second)
	{
		T temporary  = data[first]; // store first in temporary
		data[first]  = data[second];// replace first with second
		data[second] = temporary;   // put temporary in second
	}

	// print a pass of the algorithm
	private static <T> void printPass(T[] data, int pass, int index)
	{
		System.out.printf("after pass %2d: ", pass);

		// output elements till selected item
		for (int i = 0; i < index; i++)
			System.out.printf("%d ", data[i]);

		// indicate swap
		System.out.printf("%d* ", data[index]);

		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.printf("%d ", data[i]);

		// for alignment
		System.out.printf("%n");

		// indicate amount of array that’s sorted
		for (int j = 0; j < pass; j++)
			System.out.print("-- ");

		System.out.println();
	}
}

