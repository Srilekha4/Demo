package day6;

import java.sql.SQLException;

public class DBDRiver {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String update = "update Selenium.dbo.employee set Location = 'HAL' where Name = 'Jim'";
		String select = "select * from Selenium.dbo.employee";
		DBHandlerModified db = new DBHandlerModified();
		db.executeUpdateInsertQuery(update);
		db.executeSelectquery(select);
		db.tear_down_connection();
	}

}
