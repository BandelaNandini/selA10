package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import BaseclassUtility.Baseclass;

public class NavigateToZomato extends Baseclass{
	@Parameters("browser")
	@Test(groups = "ft")
	public void zomato(String BROWSER) throws InterruptedException {
		// Launch the browser
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
		driver.get("https://www.zomato.com");

		System.out.println("zomato");
		Thread.sleep(3000);

		// Close the browser
		driver.quit();
	}

}
