package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleAndUrlUsingJSE {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.flipkart.com/");

		// Fetch the title
		JavascriptExecutor js = (JavascriptExecutor) driver;
		System.out.println(js.executeScript("return document.title"));

		// Fetch the url
		System.out.println(js.executeScript("return document.URL"));
		Thread.sleep(3000);

		//Refresh the webpage
		js.executeScript("history.go(0)");
		
		Thread.sleep(3000);
		driver.quit();
	}

}
