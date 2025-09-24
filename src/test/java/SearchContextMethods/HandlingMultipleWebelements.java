package SearchContextMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleWebelements {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//Identify all the links
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		for(WebElement ele:links)
		{
			System.out.println(ele.getText());
		}
		
		driver.quit();
	}

}
