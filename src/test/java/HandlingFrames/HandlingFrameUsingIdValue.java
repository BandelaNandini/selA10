package HandlingFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameUsingIdValue {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.zomato.com/Restaurents/reviews");

		Thread.sleep(3000);
		// Identify login link
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(3000);

		// Switch the driver control to the frame
		driver.switchTo().frame("auth-login-ui");
		Thread.sleep(3000);

		// Identify Phno TF
		driver.findElement(By.xpath("//input[@type=\"number\"]")).sendKeys("9876543210");
		Thread.sleep(3000);

		// Identify quit icon
		driver.findElement(By.xpath("//h2[text()='Login']/following-sibling::i")).click();
		Thread.sleep(3000);

		// Switch the driver control to the main webpage
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		//Print reviews text
		WebElement reviews = driver.findElement(By.xpath("//h1"));
		
		System.out.println(reviews.getText());
		
		driver.quit();
		
	}

}
