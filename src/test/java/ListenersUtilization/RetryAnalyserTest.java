package ListenersUtilization;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserTest {
	
	@Test(retryAnalyzer =ListenersUtility.RetryAnalyser.class)
	public void retry()
	{
		System.out.println("Test");
		Assert.fail();
	}

}
