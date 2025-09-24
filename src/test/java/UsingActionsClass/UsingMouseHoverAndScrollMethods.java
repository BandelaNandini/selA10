package UsingActionsClass;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingMouseHoverAndScrollMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.amazon.in/");
		WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));

		Actions act = new Actions(driver);
		act.moveToElement(prime).perform();
		Thread.sleep(3000);

		WebElement join = driver.findElement(By.linkText("Join Prime Now"));
		act.click(join).perform();
		Thread.sleep(3000);

		act.scrollByAmount(0, 700).perform();
		Thread.sleep(3000);

		WebElement music = driver.findElement(By.xpath("//h3[text()='Prime Music']"));
		act.scrollToElement(music).perform();

		Thread.sleep(3000);

		driver.quit();

	}

}
