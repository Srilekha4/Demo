package day2;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ContructXpath {

	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Choose the browser");
		String browsertype = in.next();
		in.close();
		String expected = "2224.44";
		WebDriver driver =null;
		if(browsertype.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "D:\\JavaWorkspace_2016\\April_2016_batch\\April_2016\\src\\test\\resources\\IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}
		else if(browsertype.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\JavaWorkspace_2016\\April_2016_batch/April_2016\\src\\test\\resources\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if(browsertype.equalsIgnoreCase("firefox"))
		{
			 driver = new FirefoxDriver();
		}
		//FirefoxDriver driver = new FirefoxDriver();
	/*	Chrome 
		System.setProperty("webdriver.chrome.driver","D:\\JavaWorkspace_2016\\April_2016_batch/April_2016\\src\\test\\resources\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		
		
		
		
		driver.manage().window().maximize();
		
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		
		//WebElement loan = driver.findElement(By.xpath("//input[@name='uamount']"));
		WebElement loan = driver.findElement(By.xpath("//input[@name='uTime']/../../p[1]/input"));
		loan.sendKeys("100000");
		WebElement duration = driver.findElement(By.xpath("//input[@class='textbox']"));
		duration.sendKeys("60");
		
		WebElement interest = driver.findElement(By.xpath("//input[@name ='uRate']"));
		interest.sendKeys("12");
		
		driver.findElement(By.xpath("//table[@class='commontable']/tbody/tr[3]/td/p/input[1]")).click();
		
		//WebElement emi = driver.findElement(By.xpath("//input[@name='uEmi']"));
		//WebElement emi = driver.findElement(By.xpath("//input[starts-with(@name,'uEm')]"));
		WebElement emi = driver.findElement(By.xpath("//input[contains(@name,'Em')]"));
		String actual = emi.getAttribute("value");
		
		if(expected.equals(actual))
		{
			System.out.println("The test case has passed");
		}
		else
		{
			System.out.println("The test case has failed");
		}
		
		driver.close();
	}

}
