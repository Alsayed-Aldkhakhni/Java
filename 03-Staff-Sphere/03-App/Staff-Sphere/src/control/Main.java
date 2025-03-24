//==========================================================
// File Name: Main.java
// Subject  : Driver class.
// Date     : Dec 31, 2024
// Author   : Alsayed A. Khaleel
//===========================================================

package control;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;

//import java.time.LocalDate;
import model.*;

public class Main
{
	public static void main(String[] args)
	{
//		Person[] persons = new Person[3];
//		
//		try {
//			
//			persons[0] =
//					new Employee(1001, "Alsayed", "Ali", "123 Tanta eg", "011-1605-0171",
//							Gender.Male, LocalDate.of(2003, 10, 18), "#123566!", 123, "CS",
//							"SE", 100, 5.12);
//
//			persons[1] = 
//					new Manager(1002, "Ahmed", "Mohammed", "22 Shebieen eg", "011-1605-0171",
//							Gender.Male, LocalDate.of(2003, 10, 18), "#123pppppp44", 7000.12, "IS", "IS.manager.ahmed@Maverick.com");
//
//			persons[2] = 
//					new Admin(1003, "Hoda", "Adel", "123 Cairo eg", "011-1605-0171",
//							Gender.Female, LocalDate.of(2000, 5, 12), 8000.12, "admin.hoda@Maverick.com", "12345@@@");
//			
//			System.out.printf("%s", persons[0]);
//			System.out.println("==============");
//			System.out.printf("%s", persons[1]);
//			System.out.println("==============");
//			System.out.printf("%s", persons[2]);
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
		
		final String DB = "jdbc:mysql://172.18.0.2:3306/staff_sphere";
		final String USERNAME = "root";
		final String PASSWORD = "P@ssw0rd";
		final String QUERY = "CALL getMgrInfo("+ 1000 +");";
		
		try
		{
			DBConnection connection = new DBConnection(DB, USERNAME, PASSWORD);
			ResultSet result = connection.readFromDB(QUERY);
			
			ResultSetMetaData meta = result.getMetaData();
			int cols = meta.getColumnCount();
			
			for(int i = 1; i <= cols; i++)
				System.out.printf("%s  ", meta.getColumnLabel(i));
			
			System.out.println();
			
			while(result.next())
			{
			for(int i = 1; i <= cols; i++)
				System.out.printf("%s  ", result.getObject(i));
			
			System.out.println();
			}
		}
		catch(SQLException sqlex)
		{
			sqlex.printStackTrace();
		}
	}
}
