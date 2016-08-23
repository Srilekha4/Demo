package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RelativeXpathUsingFirebug {

	
	public static void main(String[] args) {
		
		String expected = "2224.44";
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		
		WebElement loan = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[1]/input"));
		loan.sendKeys("100000");
		WebElement duration = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[2]/input"));
		duration.sendKeys("60");
		
		WebElement interest = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[1]/p[3]/input"));
		interest.sendKeys("12");
		
		driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[3]/td/p/input[1]")).click();
		
		WebElement emi = driver.findElement(By.xpath(".//*[@id='content-area']/form/table/tbody/tr[2]/td[2]/p[1]/input"));
		String actual = emi.getAttribute("value");
		
		if(expected.equals(actual))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		
		driver.close();
	}

}
