package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {

	public static void main(String[] args) throws IOException {

		// Convert physical file to java obj
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");

		// Create an obj of properties
		Properties p = new Properties();

		// Load properties obj
		p.load(fis);

		// Enter the data to properties obj
		p.put("subject", "selenium");

		// Convert properties obj to physical file
		FileOutputStream fos = new FileOutputStream("./src/test/resources/data.properties");

		// Save the Property file
		p.store(fos, "updated");
	}

}
