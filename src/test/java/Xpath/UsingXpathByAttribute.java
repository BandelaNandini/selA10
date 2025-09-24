package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Identify un TF and pass the text
		driver.findElement(By.xpath("//input[@data-testid=\"royal-email\"]")).sendKeys("selenium");
		
		//Identify pswd TF and pass the text
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("abc123");
		
		//Identify login btn and click on it
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		
		driver.quit();
	}

}
