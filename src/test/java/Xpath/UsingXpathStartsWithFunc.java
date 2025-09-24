package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingXpathStartsWithFunc {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("mobile");

		driver.findElement(By.xpath("//input[starts-with(@id,'nav')]")).click();

		Thread.sleep(3000);

		driver.quit();
	}

}
