package UtilizingTakesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfAWebpage {

	public static void main(String[] args) throws InterruptedException, IOException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// IMplicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.swiggy.com/restaurants");

		Thread.sleep(3000);

		// Take the screenshot of the webpage
		// Step 1 : Downcast takesscreenshot<<i>> with the webdriver<<i>> ref variable
		TakesScreenshot ts = (TakesScreenshot) driver;

		// Step 2 : Take the Screenshot and store it in temp file
		File src = ts.getScreenshotAs(OutputType.FILE);

		// Step 3 : Create a new empty file
		File dest = new File("./Priya/Swiggy.png");

		// Step 4 : Copy the screenshot from src to dest
//		FileHandler.copy(src, dest);
		
		FileUtils.copyFile(src, dest);

		driver.quit();
	}

}
