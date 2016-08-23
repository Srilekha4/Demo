package day6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBhandler {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		String query = "select * from Selenium.dbo.employee";
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		 conn = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;user=sa;password=JackDaniels;databaseName=Selenium");
		if (conn!=null)
		{
			System.out.println("The connection is successfull");
		}
		
		Statement statement = conn.createStatement();
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
		//*****************************
		System.out.println("*****************************");
		String update = "update Selenium.dbo.employee set Location = 'IndiraNagar' where Name = 'Jim'";
		int result = statement.executeUpdate(update);
		
		System.out.println(result);
		
		rs = statement.executeQuery(query);
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
		statement.close();
		conn.close();
	}

}








