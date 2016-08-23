package day8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.DataProvider;

public class LearnDataProvider3DP {
	
	@DataProvider(name="DP_webtable")
	public static Object[][] Webtable_DP() throws IOException
	{
		
		List<String> ls = XLHandler();
		System.out.println(ls);
		Object[][] obj = new Object[ls.size()][3];
		for(int i=0;i<ls.size();i++)
		{
			obj[i][0] = ls.get(i).split(";")[0];
			obj[i][1] = ls.get(i).split(";")[1];
			obj[i][2] = ls.get(i).split(";")[2];
		}
		
		
		
		/*obj[0][0] = "100000";
		obj[0][1] = "12";
		obj[0][2] = "5";
		
		obj[1][0] = "200000";
		obj[1][1] = "12";
		obj[1][2] = "7";
		
		obj[2][0] = "300000";
		obj[2][1] = "12";
		obj[2][2] = "7";*/
		
		
		return obj;
	}
	
	public static List<String> XLHandler() throws IOException
	{
		//Objective
		
		/* To get the input from the Webtableinput xlsx file and pass it to dataprovider
		 * 1. Establish connection between xlsx and XLHandler using ExcelReader
		 * 2. get the values and pass it to dataprovider
		 * 
		 */
		String path  = System.getProperty("user.dir")+"\\src\\test\\resources\\WebtableInput.xlsx";
		ExcelReader xl = new ExcelReader(path);
		int rowcount = xl.getRowcount("Webtable");
		System.out.println(rowcount);
		List<String> lis = new ArrayList<String>();
		for(int i = 1;i<rowcount;i++)
		{
			if(xl.readXLcellvalue("Webtable", i, 0).equalsIgnoreCase("Y"))
			{
				String principal = xl.readXLcellvalue("Webtable", i, 1);
				String interest = xl.readXLcellvalue("Webtable", i, 2);
				String tenure = xl.readXLcellvalue("Webtable", i, 3);
				lis.add(principal+";"+interest+";"+tenure);
			}
			
			
			
		}
		//System.out.println(lis);
		return lis;
		
		 
	}

}
