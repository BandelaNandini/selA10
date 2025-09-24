package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingAboveAndBelowMethods {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://www.facebook.com/");

		// Identify password TF
		WebElement pswd = driver.findElement(By.id("pass"));

		// Identify UN TF
		WebElement un = driver.findElement
				(RelativeLocator.with(By.tagName("input")).above(pswd));

		// Identify login btn
		WebElement login = driver.findElement
				(RelativeLocator.with(By.tagName("button")).below(pswd));

		un.sendKeys("selenium");
		pswd.sendKeys("abc123");
		login.click();

		Thread.sleep(3000);

		// Close the browser
		driver.quit();

	}

}
