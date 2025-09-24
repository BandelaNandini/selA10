package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDataFromPropertyFile {

	public static void main(String[] args) throws IOException {

		// Step 01 : Convert physical file to java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");

		// Step 02 : Create an obj of properties
		Properties prop = new Properties();

		// Step 03 : Load the data from java obj to prop obj
		prop.load(fis);

		// Step 04 : Fetch the data from prop obj using key
		String data = prop.getProperty("url");

		System.out.println(data);
		
		WebDriver driver= new ChromeDriver();
		driver.get(data);

	}

}
