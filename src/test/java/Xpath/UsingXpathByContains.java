package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathByContains {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		//Identify forgotten password link and click on it
		//Using xpath by contains --> Using text
		driver.findElement(By.xpath("//a[contains(text(),'Fo')]")).click();
		
		//Identify TF and Pass the phno
		//Using xpath by contains --> Using attribute
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email a')]")).sendKeys("9876543210");
		
		//Identify search btn and click on it
		driver.findElement(By.xpath("//button[contains(@id,'di')]")).click();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
