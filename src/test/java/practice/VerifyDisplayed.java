package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyDisplayed {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		
		//boolean actual = driver.findElement(By.linkText("Gmail")).isDisplayed();;
		//System.out.println("Success");
		//driver.close();
	}
	
}
