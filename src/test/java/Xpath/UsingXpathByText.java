package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByText {

	public static void main(String[] args) throws InterruptedException {

		// launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to the application
		driver.get("https://www.facebook.com/");

		// Identify header and print the text
		WebElement header = driver.findElement(By.xpath("//h2"));
		System.out.println(header.getText());

		// Identify un TF using xpath by attribute and pass the text
		WebElement un = driver.findElement(By.xpath("//input[@data-testid='royal-email']"));
		un.sendKeys("selenium");

		// Identify pswd TF using xpath by attribute and pass the text
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc123");

		// Identify login button using xpath By text and click on it
		driver.findElement(By.xpath("//button[.=\"Log in\"]")).click();

		Thread.sleep(3000);

		// close the browser
		driver.quit();

	}

}
