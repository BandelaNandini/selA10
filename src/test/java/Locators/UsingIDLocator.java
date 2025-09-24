package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIDLocator {

	public static void main(String[] args) throws InterruptedException {
		// Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("https://www.facebook.com/");
		
		//Identify username TF and pass the text
		driver.findElement(By.id("email")).sendKeys("selenium");
		
		//Identify password TF and pass the text
		driver.findElement(By.id("pass")).sendKeys("abc123");
		
		//Identify login btn and click on it
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();

	}

}
