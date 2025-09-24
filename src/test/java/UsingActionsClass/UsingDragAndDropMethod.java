package UsingActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UsingDragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement drag_1 = driver.findElement(By.id("fourth"));
		WebElement drag_2 = driver.findElement(By.id("fourth"));
		WebElement drag_3 = driver.findElement(By.id("credit2"));
		WebElement drag_4 = driver.findElement(By.id("credit1"));
		WebElement drop_1 = driver.findElement(By.id("amt7"));
		WebElement drop_2 = driver.findElement(By.id("amt8"));
		WebElement drop_3 = driver.findElement(By.id("bank"));
		WebElement drop_4 = driver.findElement(By.id("loan"));

		Actions act = new Actions(driver);
		act.dragAndDrop(drag_1, drop_1).perform();
		Thread.sleep(3000);

		act.dragAndDrop(drag_2, drop_2).perform();
		Thread.sleep(3000);

		act.dragAndDrop(drag_3, drop_3).perform();
		Thread.sleep(3000);

		act.dragAndDrop(drag_4, drop_4).perform();
		Thread.sleep(3000);

		WebElement perfect_ele = driver.findElement(By.id("equal"));

		System.out.println(perfect_ele.getText());
		
		driver.quit();

	}

}
