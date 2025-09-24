package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {

	public static void main(String[] args) throws InterruptedException {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to the webpage
		driver.get("file:///C:/Users/LENOVO_PUNJAGUTTA/Desktop/SampleLoginWebpage.html");
		
		//Identify disabled username TF and pass the text
		WebElement untf = driver.findElement(By.id("user"));
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", untf,"selenium");
		
		Thread.sleep(3000);
		
		//Identify disabled login button and click on it
		WebElement login = driver.findElement(By.id("login"));
		
		//Enabling the Button
		js.executeScript("arguments[0].checked=true", login);
		Thread.sleep(3000);

		login.click();
		
		Thread.sleep(3000);

		driver.quit();
	}

}
