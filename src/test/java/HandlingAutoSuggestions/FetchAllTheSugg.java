package HandlingAutoSuggestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchAllTheSugg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("sel");

		Thread.sleep(3000);
		
		List<WebElement> sugg = driver.findElements(By.xpath("//span[contains(text(),'sel')]"));

		for (WebElement ele : sugg) {
			System.out.println(ele.getText());
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
