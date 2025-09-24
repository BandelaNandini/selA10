package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(3000);

		Alert al = driver.switchTo().alert();
		al.sendKeys("selenium");
		al.accept();
		Thread.sleep(3000);

		// Identify the result and print the text
		WebElement res = driver.findElement(By.id("result"));
		System.out.println(res.getText());

		// Close the browser
		driver.quit();

	}

}
