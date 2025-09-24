package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIndependantAndDependantXpath {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://www.flipkart.com/");

		// identify search TF and pass the text
		driver.findElement(By.name("q")).sendKeys("toys" + Keys.ENTER);
		Thread.sleep(3000);

		// Identify the price and print
		WebElement price = driver.findElement(
		By.xpath("//a[contains(text(),'KOBBET')]/../a[@class=\"DMMoT0\"]/div/div"
				+ "[@class=\"Nx9bqj\"]"));
		System.out.println(price.getText());

		Thread.sleep(3000);

		driver.quit();

	}

}
