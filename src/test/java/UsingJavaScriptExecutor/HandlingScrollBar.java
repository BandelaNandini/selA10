package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScrollBar {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an appln
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		//Scroll the webpage using hardcoded coordinates
		//Step 01:Downcast JSE with webdriver ref variable
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//Step 02 : Execute java script code
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);
		
		//Scroll the webpage using element coordinates 
		WebElement amazon = driver.findElement(By.xpath("//a[@aria-label='Amazon India Home']"));
		int xaxis = amazon.getLocation().getX();
		int yaxis = amazon.getLocation().getY();
		
//		js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
		
		//scroll the webpage using element ref variable
//		js.executeScript("arguments[0].scrollIntoView(true)",amazon);
		
		//scroll till bottom of the webpage
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		Thread.sleep(3000);
		
		//scroll till top of the webpage
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);

		//Close the browser
		driver.quit();

		
	}
}
