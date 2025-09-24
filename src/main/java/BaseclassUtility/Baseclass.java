package BaseclassUtility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeSuite
	public void bs() {
		System.out.println("BS-Con with the DB");
	}

	@AfterSuite
	public void as() {
		System.out.println("AS-Discon with the DB");
	}

	@BeforeTest
	public void bt() {
		System.out.println("BT-configuring Parallel Exe");
	}

	@AfterTest
	public void at() {
		System.out.println("AT-close Parallel Exe");
	}

	@AfterClass
	public void ac() {
		System.out.println("AC-Quit the browser");
	}

	@BeforeClass
	public void bc() {
		System.out.println("BC-Launch the browser");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("BM-Login");
	}

	@AfterMethod
	public void am() {
		System.out.println("AM-Logout");
	}

}
