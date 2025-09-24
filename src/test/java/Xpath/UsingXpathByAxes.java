package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByAxes {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://www.flipkart.com/");

		// Identify search TF and pass the text
		driver.findElement(By.name("q")).sendKeys("mobile" + Keys.ENTER);

		// Identify dynamic element using ancestor and descendant axes
		WebElement price = driver.findElement(By.xpath(
				"//div[text()='REDMI A3X (Olive Green, 128 GB)']/ancestor::div[@class=\"yKfJKb row\"]/descendant::div[@class=\"Nx9bqj _4b5DiR\"]"));

		// Using parent and child axes
//		//div[text()='REDMI A3X (Olive Green, 128 GB)']/parent::div/parent::div/child::div[@class="col col-5-12 BfVC2z"]/child::div/child::div/child::div[@class="Nx9bqj _4b5DiR"]

		// Using following and preceding sibling
//		//html/head/link/following-sibling::meta/following-sibling::script/preceding-sibling::link

		System.out.println(price.getText());

		// Close the browser
		driver.quit();

	}

}
