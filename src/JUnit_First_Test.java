import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;
import org.junit.Test;

public class JUnit_First_Test {

	@Test
	public void test() {
		WebDriver browser;
		//Firefox's geckodriver requires you to specify its location.
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I344644\\Documents\\SAP VT\\New Cloud Project\\geckodriver-v0.24.0-win64\\geckodriver.exe");   
		browser = new FirefoxDriver();
		browser.get("http://saucelabs.com");   
		WebElement header = browser.findElement(By.id("site-header"));   
		assertTrue((header.isDisplayed()));   
		browser.close();
	}
}
