package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingThread_sleep {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://shoppersstack.com/");

		Thread.sleep(10000);

		// Identify login btn and click
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(2000);
		// Close the browser
		driver.quit();
	}

}
