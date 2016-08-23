package day8;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LearnDataprovider1 {
	
	@Test(dataProvider = "DP_name")
	public void name(String firstname, String lastname)
	{
		System.out.println(firstname+ "  "+ lastname);
	}
	
	@DataProvider(name = "DP_name")
	public Object[][] DP_getname()
	{
		Object[][] obj = new Object[4][2];
		obj[0][0] = "Jim";
		obj[0][1] = "Cherian";
		
		obj[1][0] = "Ashish";
		obj[1][1] = "Choudhary";
		
		obj[2][0] = "Seena";
		obj[2][1] = "R";
		
		obj[3][0] = "Chaitra";
		obj[3][1] = "S";
		
		return obj;
	}

}
