package headlessDriverTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.junit.*;


public class AutomatedTest {


	
	@Test
	public void verifyFacebookTitle() {
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	

}
