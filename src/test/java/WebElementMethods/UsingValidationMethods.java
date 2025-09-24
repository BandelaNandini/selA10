package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");

		// Identify Search TF
		WebElement searchTF = driver.findElement(By.name("q"));

		// Check whether search TF is displayed on the webpage
		if (searchTF.isDisplayed()) {
			searchTF.sendKeys("mobile");
			Thread.sleep(3000);

		} else {
			System.out.println("Element is not displayed on the webpage : Test fail");
		}

		// Identify Search btn
		WebElement searchBtn = driver.findElement(By.xpath("//*[name()='svg'][@width=\"24\"]"));
		// Check whether the search btn is enabled if enabled click on it
		if (searchBtn.isEnabled()) {
			searchBtn.click();
			Thread.sleep(3000);
		} else {
			System.out.println("Search btn is Disabled : Test fail");
		}

//		// Identify Apple check box
//		WebElement apple_CB = driver.findElement(By.xpath("//div[text()='Apple']/../div[@class=\"XqNaEv\"]"));
//		// Click on the checkbox
//		apple_CB.click();
//		Thread.sleep(5000);
//
//		// Check whether the check box is selected
//		if (apple_CB.isSelected()) {
//			System.out.println("Apple check box is selected");
//		} else {
//			System.out.println("Apple check box is not selected");
//		}

		// Navigate to demowebshop appln
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);

		WebElement radiobtn = driver.findElement(By.id("pollanswers-2"));
		radiobtn.click();

		Thread.sleep(3000);
		if (radiobtn.isSelected()) {
			System.out.println("Good radiobtn is selected");
		} else {
			System.out.println("Good radiobtn is not selected");
		}
		driver.quit();
	}

}
