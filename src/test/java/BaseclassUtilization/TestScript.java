package BaseclassUtilization;

import org.testng.annotations.Test;

import BaseclassUtility.Baseclass;

public class TestScript extends Baseclass {

	@Test
	public void create() {
		System.out.println("Test create");
	}

	@Test
	public void modify() {
		System.out.println("Test modify");
	}

}
