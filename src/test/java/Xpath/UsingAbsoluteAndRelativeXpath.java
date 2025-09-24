package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAbsoluteAndRelativeXpath {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///C:/Users/LENOVO_PUNJAGUTTA/Desktop/SampleLoginWebpage.html");

		// Identify username element using absolute path
		driver.findElement(By.xpath("./html/body/input[1]")).sendKeys("selenium");

		// Identify password element using absolute path
		driver.findElement(By.xpath("./html/body/input[2]")).sendKeys("abc123");
		Thread.sleep(3000);

		// Identify forgotten password link using relative path
		driver.findElement(By.xpath("//a")).click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();

	}

}
