package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection          // class declaration.
{
	// instance variables.
	private final String DB_URL;   // the database url.
	private final String USER_NAME;// the username of the target db.
	private final String PASSWORD; // the username's password.
	private Statement statement;   // the statement that executes the query.
	private Connection connection; // the connection that creates the statement above.
	
	// initialize the instance variables and initiate the connection.
	public DBConnection(String url, String username, String password) throws SQLException
	{
		DB_URL = url;
		USER_NAME = username;
		PASSWORD = password;
		initiateConnection();
	}
	
	// initialize the connection.
	private void initiateConnection()
	{
		// open the connection using DriverManager with the specified url and username and password.
		// the statement is the one used to execute the query.
		try {
			connection = DriverManager.getConnection(getDB_URL(), getUSER_NAME(), getPASSWORD());
			statement  = connection.createStatement();
		}
		catch(SQLException sqlException)
		{
			sqlException.printStackTrace();
		}
	}
	
	// this method performs insert, update and delete
	// operations on the specified database;
	public void updateDB(String query) throws SQLException
	{
		statement.execute(query);
	}
	
	// this performs only the select query;
	public ResultSet readFromDB(String query) throws SQLException
	{
		return statement.executeQuery(query);
	}
	
	// close the resultset object.
	public void closeConnection()
	{
		try {
			statement.close();
			connection.close();
		}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	// local helpers, won't be called by the clients.
	private String getDB_URL()    { return DB_URL; }
	private String getUSER_NAME() { return USER_NAME; }
	private String getPASSWORD()  { return PASSWORD; }
}


