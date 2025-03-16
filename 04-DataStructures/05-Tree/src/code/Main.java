/*
 * File name: Main.java
 * 
 * Subject  : Test our homemade Tree data structure.
 * 
 * Date     : March 15, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

// import declaration.
import java.security.SecureRandom;

public class Main // class declaration.
{
	public static void main(String[] args)
	{
		Tree<Integer> tree = new Tree<Integer>();  // the tree to store those nodes.
		SecureRandom random = new SecureRandom();  // generate random numbers.
		
		for(int i = 0; i < 10; i++)                // populate the tree with nodes.
			tree.insertNode(10+random.nextInt(90));// JVM takes care about auto-boxing from int -> Integer object.
		
		// print the nodes in pre-order.
		System.out.print("preorder:  "); tree.preorder();
		System.out.println();
		
		// print the nodes in in-order.
		System.out.print("inorder:   ");  tree.inorder();
		System.out.println();
		
		// print the nodes in post-order.
		System.out.print("postorder: "); tree.postorder();
		System.out.println();
		
		// find the greatest and smallest nodes
		System.out.println("Max: " + tree.findMax());
		System.out.println("Min: " + tree.findMin());
	}
}
