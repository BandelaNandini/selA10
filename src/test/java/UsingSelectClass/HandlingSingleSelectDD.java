package UsingSelectClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelectDD {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigate to an appln
		driver.get("https://www.amazon.in/");

		// Identify dropdown
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));

		// Create an obj of select class
		Select s = new Select(dd);

		// Select the option with index
		s.selectByIndex(7);

		Thread.sleep(3000);

		// Select option by value
		s.selectByValue("search-alias=dvd");

		Thread.sleep(3000);

		// Select option by using visible text
		s.selectByVisibleText("Video Games");

		// Fetch all the options
		List<WebElement> options = s.getOptions();

		for (WebElement ele : options) {
			System.out.println("Options : " + ele.getText());
		}

		// Fetch all the selected options
		List<WebElement> list = s.getAllSelectedOptions();

		for (WebElement ele : list) {
			System.out.println("Selected Options : " + ele.getText());
		}
		
		//Fetch the first selected option
		System.out.println("First selected option : "+s.getFirstSelectedOption().getText());

		
		//Check whether the DD is multi selet DD
		System.out.println("Multi select DD  : "+s.isMultiple());
		
		driver.quit();
	}

}
