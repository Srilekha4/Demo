package day8;

import org.testng.annotations.Test;

public class Learndataprovider2 {
	
	@Test(dataProvider = "DP_name", dataProviderClass=day8.Learndataprovider2DP.class)
	public void name(String firstname, String lastname)
	{
		System.out.println(firstname+ "  "+ lastname);
	}

}
