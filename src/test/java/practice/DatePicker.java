package practice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatePicker {
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://redbus.in");
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		driver.findElement(By.id("txtOnwardCalendar")).click();
		List<WebElement> dates = driver.findElements(By.xpath("//div[@id='rbcal_txtReturnCalendar']//table[1]//td"));
		int total_id=dates.size();
		for(int i=0;i<total_id;i++)
		{
			String date=dates.get(i).getText();
				if(date.equals("31"))
			{
				dates.get(i).click();
				
				break;
			}
		}
		/*String parentwindow=driver.getWindowHandle();		
		System.out.println(parentwindow);
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles.size());
		for(String x:windowHandles)
		{
			if(!x.equals(parentwindow))
			{
				driver.switchTo().window(x);
				System.out.println(driver.getTitle());
				driver.close();
				break;
				
			}
		}*/
		
		//driver.switchTo().window(parentwindow);
	}

}
