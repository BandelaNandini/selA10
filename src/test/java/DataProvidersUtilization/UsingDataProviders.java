package DataProvidersUtilization;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UsingDataProviders {

	@Test(dataProvider = "data")
	public void loginTest(String un, String pswd) {
		System.out.println(un + " " + pswd);
	}

	@DataProvider
	public Object[][] data() {
		Object[][] obj = new Object[2][2];

		obj[0][0] = "un1";
		obj[0][1] = "pswd1";

		obj[1][0] = "un2";
		obj[1][1] = "pswd2";

		return obj;

	}
}
