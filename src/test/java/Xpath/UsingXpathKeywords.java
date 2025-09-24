package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathKeywords {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an application
		driver.get("https://www.facebook.com/");
		
		//Identify UN TF and pass the text
		driver.findElement(By.xpath("//input[@name='email' or @aria-label='Email address or phone']")).sendKeys("selenium");
		
		//Identify pswd TF and pass the text
		driver.findElement(By.xpath("//input[@aria-label='Password' and @name='pass']")).sendKeys("abc123");
		
		//Identify login btn and click on it
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal') or text()='Log']")).click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();
	}

}
