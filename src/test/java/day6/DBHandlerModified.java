package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBHandlerModified {
	
	Connection conn = null;
	Statement statement = null;
	public DBHandlerModified() throws ClassNotFoundException, SQLException
	{	
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;user=sa;password=JackDaniels;databaseName=Selenium");
		if (conn!=null)
		{
			System.out.println("The connection is successfull");
		}
		 statement = conn.createStatement();
	}
	public  void executeSelectquery(String query) throws ClassNotFoundException, SQLException {
		
		
		ResultSet rs = statement.executeQuery(query);
		
		while(rs.next())
			{
				System.out.print(rs.getString("ID"));
				System.out.print("         ");
				System.out.print(rs.getString("Name"));
				System.out.print("         ");
				System.out.print(rs.getString("Location"));
				System.out.println();
				
			}
		rs.close();
	}		
	
	public void executeUpdateInsertQuery(String query) throws SQLException
	{
		int result = statement.executeUpdate(query);
		
		System.out.println(result +" are affected");
		
	
	}
	
	public void tear_down_connection() throws SQLException
	{
		statement.close();
		conn.close();
	}
}
