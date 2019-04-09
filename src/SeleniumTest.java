
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {

	@Test
	public void test1() {
	FirefoxDriver driver = new FirefoxDriver();
	driver.get("http://blazemeter.com");
	WebElement title = driver.findElement(By.xpath("//title"));
	System.out.println("***********************************************************");
	System.out.println("*"+title.getAttribute("text")+"*");
	System.out.println("***********************************************************");
	driver.quit();
	}
}
