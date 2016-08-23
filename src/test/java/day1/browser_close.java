package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class browser_close {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		//driver.get("http://www.yahoo.com/");
		//driver.close();
		
		driver.quit();
	}

}
