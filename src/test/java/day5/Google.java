package day5;



import org.openqa.selenium.By;


public class Google extends BaseClass{
	
	
	public void googletestcase() {
		//launchbrowser();
		driver.get("http://google.com/");
		driver.findElement(By.linkText("Gmail")).click();
		
	}
	

}
