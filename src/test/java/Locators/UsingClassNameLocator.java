package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingClassNameLocator {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//LAUNCH THE BROWSER
		WebDriver driver= new ChromeDriver();
		//MAXIMIZE THE WINDOW
		driver.manage().window().maximize();
		//NAVIGATE TO AN APPLN
		driver.get("https://www.facebook.com/");
		
		//IDENTIFY USERNAME TF AND PASS THE TEXT
		driver.findElement(By.className("_55r1")).sendKeys("selenium");
		//IDENTIFY PASSWORD TF AND PASS THE TEXT
		driver.findElement(By.className("_9npi")).sendKeys("abc123");
		//IDENTIFY LOGIN BUTTON AND CLICK ON IT
		driver.findElement(By.className("_6lth")).click();
		
		Thread.sleep(3000);
		//CLOSE THE BROWSER
		driver.quit();
	}

}
