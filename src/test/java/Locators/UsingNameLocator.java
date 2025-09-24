package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNameLocator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		Thread.sleep(20000);
		
		driver.findElement(By.name("name")).sendKeys("sel");
		driver.findElement(By.name("email")).sendKeys("sel@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sel123");
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
	}

}
