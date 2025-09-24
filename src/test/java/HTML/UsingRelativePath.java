package HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingRelativePath {
	
	public static void main(String[] args) throws InterruptedException {
		
		//Launch the browser
		WebDriver driver= new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Navigate to an appln
		driver.get("file:///C:/Users/LENOVO_PUNJAGUTTA/Desktop/SampleLoginWebpage.html");
	
		//Identify username TF and pass the text
		driver.findElement(By.xpath("//input[1]")).sendKeys("selenium");
		
		//Identify password TF and pass the text
		driver.findElement(By.xpath("//input[2]")).sendKeys("abc123");
		Thread.sleep(3000);

		//Identify forgotten password link and click on it
		driver.findElement(By.xpath("//a")).click();
		
		Thread.sleep(3000);
		
		//Close the browser
		driver.quit();
		
		
		
	}

}
