package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify forgotten password link and click on it
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
