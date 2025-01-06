//==========================================================
// File Name: Main.java
// Subject  : Driver class.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//===========================================================

package control;
import java.time.LocalDate;
import model.*;

public class Main
{
	public static void main(String[] args)
	{
		Task task1 = new Task(1150, 123, "Front End", TaskStatus.InProgress, LocalDate.of(2025, 1, 15),
							 "Your are assigned to design and implement\n"+
							 "the fron end of the web site being developed.\n");
		
		System.out.printf("%s", task1);
		
	}
	
}
