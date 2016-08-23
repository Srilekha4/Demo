package day5;



import org.openqa.selenium.By;


public class Bing extends BaseClass{
	
	public void bingtestcase(String searchword) {
		//launchbrowser();
		driver.get("http://www.bing.com/");
		
		driver.findElement(By.id("sb_form_q")).sendKeys(searchword);
		driver.findElement(By.id("sb_form_go")).click();
		String result = driver.findElement(By.cssSelector(".sb_count")).getText();
		System.out.println(result);
		
	}

}
