package UsingAssertions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UsingHardAssert {

	@Test
	public void hardAssert() {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.flipkart.com/");

//		// Validate the webpage
//		if (driver.getTitle().contains("Online Shopping, Electronics, Furniture")) {
//			System.out.println("Test Pass");
//		} else {
//			System.out.println("Test Fail");
//		}

		// Using Hard Assert
//		Assert.assertEquals(driver.getTitle(),
//				"Online Shopping Site for Mobiles, Electronics");
		
		Assert.assertNotNull(driver);
		
		Assert.assertTrue(driver.getCurrentUrl().contains("flipkart"));

		//Fail the testScript
		Assert.fail();
		// Close the browser
		driver.quit();
	}

}
