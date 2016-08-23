package day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicit {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("http://www.bigbasket.com/choose-city/?next=/");
		driver.findElement(By.id("skip_explore")).click();
		driver.findElement(By.id("id_q")).sendKeys("Mango");
		//Thread.sleep(5000);
		WebDriverWait wait = new WebDriverWait(driver,8);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a")));
		WebElement suggestionbox_data1 = driver.findElement(By.cssSelector("ul[id='uiv2-autosearch-list'] li:nth-child(1) a"));
		suggestionbox_data1.click();
		driver.close();
	}
	
	
	
	
	
	

}
