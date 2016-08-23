package day8;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Iframehandler {
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.propertiesindia.com/");
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}

	@Test
	public void clickbuyradioButn() throws InterruptedException
	{
		WebElement frame = driver.findElement(By.xpath("//iframe[@src= 'search/about.php']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='bar_category'][@value='S']")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(5000);
	}

}
