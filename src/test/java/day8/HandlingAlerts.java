package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandlingAlerts {
	
	WebDriver driver = null;
	@Test
	public void AlertHandler()
	{
		
		
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		
	
	}
	
	@BeforeMethod
	public void launchbrowser()
	{driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://in.rediff.com/");
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}

}
