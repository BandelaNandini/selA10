package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByGroupIndexing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify UN TF using group indexing
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("selenium");
		
		//Identify pswd TF using group indexing
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("abc123");
		
		//Identify login btn and click on it
		driver.findElement(By.xpath("//button")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
