package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText_PartialLinktext {
	
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		Thread.sleep(5000);
		driver.quit();
	}

}
