//==========================================================
// File Name: Main.java
// Subject  : Driver class.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//===========================================================

package control;
import java.time.LocalDate;

//import java.time.LocalDate;
import model.*;

public class Main
{
	public static void main(String[] args)
	{
		Person[] persons = new Person[3];

		try
		{
			persons[0] =
					new Employee(1001, "Alsayed", "Ali", "123 Tanta eg", "01116050171",
							Gender.Male, LocalDate.of(2003, 10, 18), "2Decho113!", 123, "CS",
							"SE", 50.11);
			
			persons[1] = 
					new Manager(1001, "Ahmed", "Mohammed", "22 Shebieen eg", "01116050171",
							Gender.Male, LocalDate.of(2003, 10, 18), 7000.12, "IS", "IS.manager.ahmed@ABC.com",
							"#123pppppp44");

			System.out.printf("%s", persons[0]);
			System.out.println("==============");
			System.out.printf("%s", persons[1]);

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
