package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingKeyboardActions {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.facebook.com/");
		
		WebElement untf = driver.findElement(By.id("email"));
		
		Actions act= new Actions(driver);
		act.moveToElement(untf).click(untf).sendKeys("selenium").perform();
		
		Thread.sleep(3000);
		
		act.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
				
		Thread.sleep(3000);
		
		driver.quit();
	}

}
