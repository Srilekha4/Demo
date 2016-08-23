package day7;

import org.testng.annotations.Test;



public class TestngLearn1 {

	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("This is the login method");
	}
	
	@Test(priority = 2)
	public void sendmail()
	{
		System.out.println("this is the sendmail mthod");
	}
	
	@Test(priority = 3)
	public void logout()
	{
		System.out.println("this is the logout mthod");
	}
}
