package day8;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandler {
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://in.rediff.com/");
		
	}
	
	@Test
	public void Handlwindow()
	{
		System.out.println(driver.getTitle());
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		for(String x :windowHandles)
		{
			if(!x.equals(parentwindow))
			{
				driver.switchTo().window(x);
				System.out.println(driver.getTitle());
				driver.close();
				break;
				
			}
		}
		
		
		driver.switchTo().window(parentwindow);
		System.out.println(driver.getTitle());
		
		
	}
	
	//@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}

}
