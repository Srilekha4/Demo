package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Allahabadbank {
	public static void main(String[] args) {		
		
		String expected = "2224.44";
		/*Open browser
		firefox*/
		FirefoxDriver driver = new FirefoxDriver();
		//maximize
		driver.manage().window().maximize();
		//launch the URL
		driver.get("https://www.allahabadbank.in/english/emi_calculator.aspx");
		//Find the principle textbox
		WebElement principal = driver.findElement(By.name("principal"));
		//Enter the principle value
		principal.sendKeys("100000");
		//Find the rate textbox
		WebElement rate = driver.findElement(By.name("interest" ));
		//Enter the rate value
		rate.sendKeys("12");
		//Find the month textbox +//Enter the months value
		driver.findElement(By.name("instalment")).sendKeys("60");
		
		
		//Find the calculate button+//Click on calculate
		driver.findElement(By.name("B1")).click();
		
		//Find the EMi textbox +//get the emi value
		String emi = driver.findElement(By.name("total")).getAttribute("value");
		
		System.out.println("THe emi is "+emi);
		//validate
		
		if(emi.equals(expected))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		// close the browser
		driver.close();
	
	}

}
