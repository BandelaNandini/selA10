package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions_Rightclick {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		// Identify right click element
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));

		// Create an obj of actions class and right click on an element
		Actions act = new Actions(driver);
		act.contextClick(rightclick).perform();

		// refresh
		driver.navigate().refresh();

		// Double click
		WebElement doubleclick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

		act.doubleClick(doubleclick).perform();
		Thread.sleep(3000);

		driver.quit();
	}

}
