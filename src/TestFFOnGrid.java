import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestFFOnGrid {

	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setPlatform(Platform.WINDOWS);
		URL url=new URL("http://localhost:12345/wd/hub");
		WebDriver driver = new RemoteWebDriver(url, cap);
		driver.get("http://learn-automation.com");
		System.out.println("Title is "+driver.getTitle());
		driver.quit();
	}
}
