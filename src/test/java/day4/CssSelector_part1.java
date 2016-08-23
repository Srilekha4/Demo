package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_part1 {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.timeanddate.com/weather/");
		driver.manage().window().maximize();
		//driver.findElement(By.className("nine")).sendKeys("India");
		//driver.findElement(By.className("blue")).click();
		//String result = driver.findElement(By.className("accent")).getText();
		/*
		 * By XPATH
		 * driver.findElement(By.xpath("//input[@id='wcquery']")).sendKeys("India");
		//driver.findElement(By.xpath("//input[@class = 'three blue']")).click();
		driver.findElement(By.xpath("//input[contains(@class,'blue')]")).click();
		String result = driver.findElement(By.xpath("//span[@class ='accent' ]")).getText();
		*/
		//CSSSelector
		//driver.findElement(By.cssSelector("input[id='wcquery']")).sendKeys("India");
		//driver.findElement(By.cssSelector("input[id='wcquery'][name = 'query']")).sendKeys("India");
		//driver.findElement(By.cssSelector("#wcquery")).sendKeys("India");
		driver.findElement(By.cssSelector("input[class^='inline']")).sendKeys("India");
		//driver.findElement(By.cssSelector("input[class = 'three blue']"));
		driver.findElement(By.cssSelector("input[class$='blue']")).click();
		//driver.findElement(By.cssSelector(".blue")).click();
		//String result = driver.findElement(By.cssSelector("span[class = 'accent']")).getText();
		String result = driver.findElement(By.cssSelector(".accent")).getText();
		result = result.replace("– (", "").replace(")", "");//589)
		System.out.println("The number of results is "+result);
		driver.close();
		
		
	}

}
