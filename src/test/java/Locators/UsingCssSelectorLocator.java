package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorLocator {

	public static void main(String[] args) throws InterruptedException

	{

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		// Identify search TF and pass the text
		driver.findElement(By.cssSelector("input[name=\"q\"]")).sendKeys("mobiles");
		Thread.sleep(3000);

		// Identify search btn and click on it
		driver.findElement(By.cssSelector("input[type='submit']")).click();

		Thread.sleep(3000);

		// Close the browser
		driver.quit();

	}

}
