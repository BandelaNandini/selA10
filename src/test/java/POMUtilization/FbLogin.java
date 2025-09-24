package POMUtilization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Pom.LoginPomPage;

public class FbLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
//		WebElement name = driver.findElement(By.id("name"));
		Thread.sleep(3000);
//		name.sendKeys("selenium")

		LoginPomPage l= new LoginPomPage(driver);
		l.getNameTF().sendKeys("selenium");
		Thread.sleep(3000);

		driver.navigate().refresh();
		Thread.sleep(3000);
		l.getNameTF().sendKeys("selenium");

		
//		name.sendKeys("manual");
	}
}
