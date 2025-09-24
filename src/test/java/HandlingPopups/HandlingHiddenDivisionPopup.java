package HandlingPopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingHiddenDivisionPopup {

	public static void main(String[] args) {

		//Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Navigate to an appln
		driver.get("https://www.makemytrip.com/");
		
		//Close the popup
		driver.findElement(By.xpath("//span[@data-cy=\"closeModal\"]")).click();
		
		
		
		
	}

}
