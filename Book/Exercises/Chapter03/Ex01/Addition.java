/*
 * File name: Addition.java
 *
 * Subject: Read 2 numbers and dispaly their sum using JOptionPane class.
 *
 * Date: August 6, 2024
 *
 * Author: Alsayed-Ali
 *
 * Last modification: August 6, 2024 --> [3:41 AM]
 *
 * */


// import declaration.
import javax.swing.JOptionPane;

public class Addition // class declaration.
{
	public static void main(String[] args)
	{
		// read the numbers from the user.
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter 1st number."));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter 2nd number."));

		// adding and formating the expression.
		int sum = num1 + num2;
		String msg = String.format("%d + %d = %d", num1, num2, sum);

		// display it.
		JOptionPane.showMessageDialog(null, msg);
	}
}

