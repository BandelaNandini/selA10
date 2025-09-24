package HandlingWindows;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingNewWindowAndTab {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Imp wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.swiggy.com/restaurants");

		Thread.sleep(3000);
		// create a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		Thread.sleep(3000);

		// Create a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);

		// Close the browser
		driver.quit();

	}

}
