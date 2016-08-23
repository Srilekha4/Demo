package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTagname {

	
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com/");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(" the size of the list is "+list.size());
		
		for(int i =0;i<list.size();i++)
		{
			System.out.println(list.get(i).getText()+ " no "+ i);
		}
		
		driver.close();
	
	
	}

}
