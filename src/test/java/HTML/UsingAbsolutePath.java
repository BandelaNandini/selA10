package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsolutePath {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to the url
		driver.get("file:///C:/Users/LENOVO_PUNJAGUTTA/Desktop/SampleLoginWebpage.html");

		Thread.sleep(3000);
		// Identify username TextField
		WebElement un = driver.findElement(By.xpath("./html/body/input[1]"));
		un.sendKeys("selenium");
		Thread.sleep(3000);

		// Identify password textfield
		WebElement pswd = driver.findElement(By.xpath("./html/body/input[2]"));
		pswd.sendKeys("abc123");
		Thread.sleep(3000);

		// Identify forgotten password link
		driver.findElement(By.xpath("./html/body/a")).click();
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();


	}

}
