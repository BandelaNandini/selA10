package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingImplicitWait {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://shoppersstack.com/");

		// Identify login btn and click
		driver.findElement(By.id("loginBtn")).click();

		Thread.sleep(2000);
		// Close the browser
		driver.quit();
	}

}
