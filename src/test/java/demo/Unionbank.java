package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Unionbank {

	public static void main(String[] args) {
		String expected = "2224.44";
		//Open the firefox browser
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//launch the url
		driver.get("http://www.unionbankofindia.co.in/EMICal.aspx");
		
		//Enter value into the loan textbox
		//Find the loan textbox
		WebElement loan = driver.findElement(By.id("loanamount"));
		//Enter the loan amount
		loan.sendKeys("100000");
		
		//Find the interest textbox
		WebElement rate = driver.findElement(By.id("rate"));
		//Enter the interest value
		rate.sendKeys("12");
		
		//Find the tenure textbox
		WebElement month = driver.findElement(By.name("pmonths"));
		//Enter the tenure value
		month.sendKeys("60");
		
		//find the calculate button
		WebElement button = driver.findElement(By.id("Button1"));
		//Click on the button
		button.click();
		
		//Find the emi textbox
		WebElement emi_element = driver.findElement(By.name("EMI"));
		//Get value from emi textbox
		String emi = emi_element.getAttribute("value");
		System.out.println("The emi amount is "+emi );
		
		if(emi.equals(expected))
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
