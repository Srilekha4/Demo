package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googlepage {
	FirefoxDriver driver =null;
	
	public void launchbrowser()
	{
		 driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		
	}
	
	public String clickonLink(String link) throws InterruptedException
	{
		driver.findElement(By.linkText(link)).click();
		
		Thread.sleep(5000);
		
		return driver.getTitle();
		
		
	}
	
	public void tear_down()
	{
		driver.close();
		
	}
	
	/*
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
		Thread.sleep(5000);
		driver.close();
	}
*/
}
