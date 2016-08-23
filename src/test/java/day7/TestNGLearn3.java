package day7;

import junit.framework.Assert;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGLearn3 {
	@BeforeMethod
	public void ConnectionXL()
	{
		//Assert.assertEquals(1, 0);
		System.out.println("This is the XLconnection method");
		
	}
	
	@Test
	public void XLread()
	{
		
		System.out.println("this is the read mthod");
	}
	
	@AfterMethod
	public void Connectionclose()
	{
		System.out.println("this is the XLclose mthod");
	}

}
