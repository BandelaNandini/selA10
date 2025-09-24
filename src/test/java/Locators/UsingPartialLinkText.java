package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPartialLinkText {
	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("https://demowebshop.tricentis.com/");
		
		//Identify login link and click on it
		driver.findElement(By.partialLinkText("Log")).click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();
	}

}
