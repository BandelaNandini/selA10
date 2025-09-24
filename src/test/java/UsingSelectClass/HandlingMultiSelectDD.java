package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumNetworkConditions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelectDD {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new FirefoxDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

		// Identify DD element
		WebElement multi_ssDD = driver.findElement(By.id("select-multiple-native"));

		Select s = new Select(multi_ssDD);

		// Select the option using index,value and visible text
		s.selectByIndex(2);
		Thread.sleep(3000);
		s.selectByValue("White Gold Plated Princess");
		Thread.sleep(3000);
		s.selectByVisibleText("SanDisk SSD PLUS 1TB...");

		// Fetch all the options
		List<WebElement> options = s.getOptions();
		for (WebElement ele : options) {
			System.out.println("All options : " + ele.getText());
		}

		// Fetch selected options
		List<WebElement> selected = s.getAllSelectedOptions();
		for (WebElement ele : selected) {
			System.out.println("selected options : " + ele.getText());
		}

		// Fetch the first selected option
		System.out.println("First selected option : " + s.getFirstSelectedOption().getText());

		// Deselect the options
//		s.deselectByIndex(2);
//		Thread.sleep(3000);
//		s.deselectByValue("White Gold Plated Princess");
//		Thread.sleep(3000);
//		s.deselectByVisibleText("SanDisk SSD PLUS 1TB...");
//		Thread.sleep(3000);
		
		s.deselectAll();

		// Check whether it is mnulti select DD
		System.out.println("Multi select DD : " + s.isMultiple());
		
		driver.quit();

	}

}
