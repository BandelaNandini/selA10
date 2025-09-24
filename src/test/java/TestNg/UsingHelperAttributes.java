package TestNg;

import org.testng.annotations.Test;

public class UsingHelperAttributes {

	@Test(dependsOnMethods = "register")
//	(priority = 2)
	public void login() {
		System.out.println("login");
	}

	@Test
//	(priority = 1,enabled = false)
	public void register() {
		System.out.println("reg");
	}

	@Test(dependsOnMethods = "login", invocationCount = 3, threadPoolSize = 3)
//	(priority = 3, invocationCount = 3)
	public void create() {
		System.out.println("create");
	}

}
