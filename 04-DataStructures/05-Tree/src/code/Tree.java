/*
 * File name: Tree.java
 * 
 * Subject  : Construct the binary search tree data structure.
 * 
 * Date     : March 15, 2025
 * 
 * Author   : Alsayed A. Khaleel
 * 
 */

package code;

public class Tree<T extends Comparable<T>> // class declaration.
{
	// the pointer on the tree.
	private	Node<T> root;

	// initiate the tree.
	public Tree() { root = null; }

	// insert a node in the tree.
	public void insertNode(T data)
	{
		if(isEmpty()) // has no nodes yet.
			root = new Node<T>(data);
		else          // there is at least one node.
			root.insert(data);
	}

	// client method, prints tree in root-left-right order.
	public void preorder()  { preorderHelper(root); }
	
	// client method, prints tree in left-right-root order.
	public void postorder() { postorderHelper(root); }
	
	// client method, prints tree in left-root-right order.
	public void inorder()   { inorderHelper(root); }
	
	// predicate method, checks if the tree's empty.
	public boolean isEmpty() { return root == null; }
	
	// less complex one for the client.
	public T findMin() { return findMin(root); }	
	public T findMax() { return findMax(root); }
	
	// helper [less complex] methods.
	private void preorderHelper(Node<T> node)
	{
		if(node == null) // base case.
			return;

		System.out.printf("%s ", node.data);// root.
		preorderHelper(node.left);          // left.
		preorderHelper(node.right);         // right.
	}
	
	// left-right-root.
	private void postorderHelper(Node<T> node)
	{
		if(node == null) // base case.
			return;

		postorderHelper(node.left);         // left sub-tree.
		postorderHelper(node.right);        // right sub-tree.
		System.out.printf("%s ", node.data);// root node.
	}

	// left-root-right.
	private void inorderHelper(Node<T> node)
	{
		if(node == null) // base case.
			return;

		inorderHelper(node.left);           // left node.
		System.out.printf("%s ", node.data);// root node.
		inorderHelper(node.right);          // right node.
	}
	
	// find the maximum node in the tree.
	private T findMin(Node<T> node)
	{
		if(node == null) // if no nodes in the tree. [base case].
			return null;
		else if(node.left == null && node.right == null)// leaf node.
			return node.data;
		else if(node.left == null && node.right != null)// if the right is empty, the root is the smallest.
			return node.data;
		else
			return findMin(node.left);                  // otherwise repeat.
	}
	
	// find the maximum node in the tree.
	private T findMax(Node<T> node)
	{
		if(node == null) // there are no nodes.
			return null;
		else if(node.left == null && node.right == null)// leaf node.
			return node.data;
		else if(node.left != null && node.right == null)// if the right is empty, the root is the greatest.
			return node.data;
		else
			return findMax(node.right);                 // otherwise, re-do.
	}
}
