package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleInterface implements SearchEngineinterface{
	WebDriver driver = null;
	
	@Override
	public void launchbrowser() {
		
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://google.com/");
	}

	@Override
	public void search() {
		driver.findElement(By.id("lst-ib")).sendKeys("selenium");
		driver.findElement(By.name("btnG")).click();
		
	}

	@Override
	public void results() {
		String result = driver.findElement(By.id("resultStats")).getText();
		System.out.println(result.split(" ")[1]);
		
	}

	@Override
	public void tear_down() {
		driver.close();
		
	}

}
