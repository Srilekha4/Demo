package day6;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingInterface implements SearchEngineinterface {
	WebDriver driver = null;
	@Override
	public void launchbrowser() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.bing.com/");
	}

	@Override
	public void search() {
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		driver.findElement(By.id("sb_form_go")).click();
		
	}

	@Override
	public void results() {
		String result = driver.findElement(By.className("sb_count")).getText();
		System.out.println(result.split(" ")[0]);
	}

	@Override
	public void tear_down() {
		driver.close();
		
	}

}
