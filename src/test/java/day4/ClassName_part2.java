package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassName_part2 {
	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.timeanddate.com/weather/");
		driver.manage().window().maximize();
		driver.findElement(By.className("nine")).sendKeys("India");
		driver.findElement(By.className("blue")).click();
		String result = driver.findElement(By.className("accent")).getText();
		result = result.replace("– (", "").replace(")", "");//589)
		System.out.println("The number of results is "+result);
		driver.close();
	}

}
