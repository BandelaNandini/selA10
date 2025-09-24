package UsingJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ClickOnAnElementUsingJSE {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.facebook.com/");

		WebElement unTF = driver.findElement(By.id("email"));
		WebElement loginbtn = driver.findElement(By.name("login"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value=arguments[1]", unTF, "mobile");

		Thread.sleep(3000);

		js.executeScript("arguments[0].click()", loginbtn);
		Thread.sleep(3000);
		driver.quit();

	}

}
