package day1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Paramertize_allahabad {
	
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the expected emi");
		String expected = in.next();
		System.out.println("Enter the principal");
		String loan = in.next();
		System.out.println("Enter the rate");
		String interest = in.next();
		System.out.println("Enter the duration");
		String month = in.next();
		in.close();
		
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
		principal.sendKeys(loan);
		//Find the rate textbox
		WebElement rate = driver.findElement(By.name("interest" ));
		//Enter the rate value
		rate.sendKeys(interest);
		//Find the month textbox +//Enter the months value
		driver.findElement(By.name("instalment")).sendKeys(month);
		
		
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
