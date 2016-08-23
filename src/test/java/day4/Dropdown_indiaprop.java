package day4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_indiaprop {
	
	public static void main(String[] args) {
		
		
		boolean status = false;
		WebDriver driver  = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.indiaproperties.com/");
		Alert alert = driver.switchTo().alert();
		alert.accept();	
		
		WebElement cities = driver.findElement(By.id("DDSrchCities"));
		Select dropdown = new Select(cities);
		
		//dropdown.selectByVisibleText("Chennai");
		//dropdown.selectByIndex(9);
		//dropdown.selectByValue("34");
		List<WebElement> options = dropdown.getOptions();
		System.out.println(options.size());
				
		for(WebElement e:options)
		{
			if(e.getText().equalsIgnoreCase("pune"))
			{
				System.out.println("The city is "+e.getText());
				e.click();
				 status = e.isSelected();
			}
		}
		System.out.println("Is the city pune select :"+status);
		
		//driver.close();
	}

}
