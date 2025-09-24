package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingActionMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://demowebshop.tricentis.com/");

		WebElement searchTF = driver.findElement(By.id("small-searchterms"));
		searchTF.sendKeys("mobile");
		Thread.sleep(3000);
		searchTF.clear();
		Thread.sleep(3000);
		searchTF.sendKeys("computers");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Search']")).submit();

		driver.findElement(By.name("As")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Isc")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Sid")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[contains(@class,\"search-button\")]")).submit();

		Thread.sleep(3000);

		driver.quit();

	}

}
