package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseclassUtility.Baseclass;

public class NavigateToFlipkart extends Baseclass{

	@Parameters("browser")
	@Test(groups = "ft")
	public void flipkart(String BROWSER) throws InterruptedException {

		WebDriver driver = null;
		// Launch the browser
		if (BROWSER.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (BROWSER.equals("edge")) {
			driver = new EdgeDriver();
		} else if (BROWSER.equals("firefox")) {
			driver = new FirefoxDriver();
		} else {
			driver = new ChromeDriver();
		}
		// Maximize the window
		driver.manage().window().maximize();

		// Imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.flipkart.com");

		System.out.println("flipkart");
		Thread.sleep(3000);

		// Close the browser
		driver.quit();
	}

}
