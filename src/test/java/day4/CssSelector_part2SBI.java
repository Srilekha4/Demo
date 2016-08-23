package day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelector_part2SBI {
	public static void main(String[] args) {
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.sbi.co.in/portal/web/home/emi-calculator");
		driver.findElement(By.cssSelector("input[class='textbox'][name='uamount']")).sendKeys("100000");
		driver.findElement(By.cssSelector("input[class='textbox'][name='uTime']")).sendKeys("60");
		driver.findElement(By.cssSelector("input[class='textbox'][name='uRate']")).sendKeys("12");
		//driver.findElement(By.cssSelector("table[class='commontable'] tbody:nth-child(1) tr:nth-child(3) td:nth-child(1) p:nth-child(1) input:nth-child(1)")).click();
		//driver.findElement(By.cssSelector("table[class='commontable']>tbody:nth-child(1)>tr:nth-child(3)>td:nth-child(1)>p:nth-child(1)>input")).click();
		//driver.findElement(By.cssSelector("table[class='commontable']>tbody>tr:nth-child(3)>td>p>input")).click();
		driver.findElement(By.cssSelector("table[class='commontable']>:nth-child(1)>:nth-child(3)>:nth-child(1)>:nth-child(1)>input")).click();
		//String actual = driver.findElement(By.cssSelector("input[name^='uEm']")).getAttribute("value");
		String actual = driver.findElement(By.cssSelector("input[name$='mi']")).getAttribute("value");
		System.out.println("THe EMI is "+ actual);
		driver.close();
	}

}
