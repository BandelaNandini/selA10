package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingExplicitWait {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/");

		WebElement login = driver.findElement(By.id("loginBtn"));
		// Explicit wait using visiblity of element
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(login));
		login.click();

		// Explicit wait using title
		wait.until(ExpectedConditions.titleContains("ShoppersStack | Login"));
		System.out.println("Got the Title");

		driver.findElement(By.id("Email")).sendKeys("abc123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc123");
		WebElement loginbtn = driver.findElement(By.id("Login"));

		// Explicit wait using element To Be clickable
		wait.until(ExpectedConditions.elementToBeClickable(loginbtn));
		loginbtn.click();
		Thread.sleep(3000);

		driver.quit();
	}

}
