package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSVGTagsUsingNameFunc {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("mobile");
		
		driver.findElement(By.xpath("//*[name()='svg'][@width='24']")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
