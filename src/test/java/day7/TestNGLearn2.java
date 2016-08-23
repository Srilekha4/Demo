
package day7;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class TestNGLearn2 {
	
	@Test(priority = 1)
	public void login()
	{
		//Assert.assertEquals(1, 0);
		System.out.println("This is the login method");
		
	}
	
	@Test(dependsOnMethods ="login")
	public void sendmail()
	{
		//Assert.fail();
		System.out.println("this is the sendmail mthod");
	}
	
@Test(dependsOnMethods ={"sendmail","login"})
	//@Test(dependsOnMethods ="sendmail")
	public void logout()
	{
		System.out.println("this is the logout mthod");
	}

}
