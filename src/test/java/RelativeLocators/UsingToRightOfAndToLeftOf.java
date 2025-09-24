package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingToRightOfAndToLeftOf {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Identify cart link
		WebElement cart = driver.findElement(By.linkText("Cart"));

		// Using cart Identify "login" btn and click on it
		driver.findElement(RelativeLocator.with
				(By.tagName("a")).toLeftOf(cart)).click();

		Thread.sleep(3000);
		// Navigate back to home page
		driver.navigate().back();
		Thread.sleep(3000);

		// Handle login popup i.e., click on cross(x) icon
		driver.findElement(By.xpath("//span[@role=\"button\"]")).click();
		Thread.sleep(3000);

		// Identify cart link
		WebElement cart_01 = driver.findElement(By.linkText("Cart"));

		// Using cart Identify "Become a seller" and click on it
		driver.findElement(RelativeLocator.with
				(By.tagName("a")).toRightOf(cart_01)).click();

		Thread.sleep(3000);

		driver.quit();
	}

}
