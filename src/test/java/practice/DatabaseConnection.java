package practice;

import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
	
	public static void main(String[] args) {
		
		//getting from database
		List expectedList=new ArrayList();
		expectedList.add("10");
		expectedList.add("20");
		expectedList.add("30");
		
		//getting from application
				List actualList=new ArrayList();
				actualList.add("20");
				actualList.add("20");
				actualList.add("30");
				
				
				System.out.println(expectedList.equals(actualList));
	}

}
