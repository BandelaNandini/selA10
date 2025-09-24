package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingGetterMethods {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// Maximize the window
		driver.manage().window().maximize();

		// Navigate to an appln
		driver.get("https://www.facebook.com/");

		// Identify forgot password link
		WebElement FP_Ele = driver.findElement(By.linkText("Forgotten password?"));

		// Fetch the text
		System.out.println("Visible Text : " + FP_Ele.getText());

		// Fetch the tagname
		System.out.println("Tagname : " + FP_Ele.getTagName());

		// Fetch the Attribute value
		System.out.println("Attribute value : " + FP_Ele.getAttribute("id"));

		// Fetch the size of the element
		System.out.println("Size (Dimension class) of the element: " + FP_Ele.getSize());

		// Fetch the location of the element
		System.out.println("Location (point class) of the element : " + FP_Ele.getLocation());

		// Fetch the size and loc of the element
		System.out.println(FP_Ele.getRect().getDimension());
		System.out.println(FP_Ele.getRect().getPoint());

		// Fetch the css value of the element
		System.out.println("Css value : " + FP_Ele.getCssValue("color"));

		// Close the browser
		driver.quit();
	}

}
