package demo;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingExpample {

	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the search keyword");
		String text = in.next();
		in.close();
		//Open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//Maximise
		
		driver.manage().window().maximize();
		
		//launch the URL
		
		driver.get("http://www.bing.com/");
		
		//find search textbox 
		WebElement search_texbox = driver.findElement(By.id("sb_form_q"));
		//Enter value into search texbox
		search_texbox.sendKeys(text);
		
		//find the search button
		WebElement button = driver.findElement(By.id("sb_form_go"));
		//Click on the search button
		button.click();
		
		//find the result element
		WebElement result_element = driver.findElement(By.className("sb_count"));
		//Get the result
		String actual_result = result_element.getText();
		
		System.out.println("THe number of hits is "+ actual_result);
		//Close browser
		
		driver.close();
	
	}

}
