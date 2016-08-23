package day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LearnContructors {
	WebDriver driver = null;
	public LearnContructors(String browser)
	{
		//System.out.println(System.getProperty("user.dir"));
		if(browser.equalsIgnoreCase("Firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver",  System.getProperty("user.dir")+"\\src\\test\\resources\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		
		else if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com/");
		
	}
	
	public void clickonLink(String link)
	{
		driver.findElement(By.linkText(link)).click();
	}
	
	public void tear_down()
	{
		driver.close();
	}

}
