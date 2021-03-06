package day8;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnDataprovider3 {
	
	WebDriver driver = null;
	@BeforeMethod
	public void launchbrowser()
	{driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://www.homeloanshub.com/mortgage-calculator/");
		
	}
	
	@AfterMethod
	public void tear_down()
	{
		driver.quit();
	}
	
	@Test(dataProvider= "DP_webtable", dataProviderClass= day8.LearnDataProvider3DP.class)
	public void Webtablehandler(String principal, String interest, String tenure)
	{
		// input data for 5 years
		
		//retrive emi for the 3rd year
		driver.findElement(By.name("principal")).sendKeys(principal);
		driver.findElement(By.name("interest")).sendKeys(interest);
		driver.findElement(By.name("tenure")).sendKeys(tenure);
		
		driver.findElement(By.cssSelector("input[class='btn1'][value='Calculate']")).click();
		//no. of columns
		//List<WebElement> ls = driver.findElements(By.xpath("//div[@id='emiresults']/table/tbody/tr[1]/td"));
		//no of rows
		
		List<WebElement> ls = driver.findElements(By.xpath("//div[@id='emiresults']/table/tbody/tr/td[1]"));
		//no.of cells in the webtable
		//List<WebElement> ls = driver.findElements(By.xpath("//div[@id='emiresults']/table/tbody/tr/td"));
		
		System.out.println(ls.size());
		String actual_emi = null;
		for(int i=1;i<=ls.size();i++)
		{
			String tenure_month = driver.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr["+i+"]/td[1]")).getText();
			//System.out.println(tenure_month);
			if(tenure_month.equals("36"))
			{
				//System.out.println("Yes the tenure is present");
				actual_emi =driver.findElement(By.xpath("//div[@id='emiresults']/table/tbody/tr["+i+"]/td[2]")).getText();
				break;
			}
		}
		
		System.out.println("The emi for the 3rd year is "+ actual_emi);
	}

}
