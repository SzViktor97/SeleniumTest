import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class TestFacebookRegistration {

	public static void main(String[] args) {
		
		WebDriver browser;
		System.setProperty("webdriver.gecko.driver","C:\\Users\\I344644\\Documents\\SAP VT\\New Cloud Project\\geckodriver-v0.24.0-win64\\geckodriver.exe");   
		browser = new FirefoxDriver(); //Új Böngészõpéldányt hozunk létre Firefoxból
		browser.get("http://www.facebook.com");  // Facebookot megnyitja böngészõben
		browser.manage().window().maximize(); // a képernyõ méretét nagyra állítja
		//WebElement header = browser.findElement(By.id("site-header"));   
		//assertTrue((header.isDisplayed()));
		
		
		browser.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("Endre vagyok"); //Textboxba beírja a vezetéknevet
		
		browser.findElement(By.xpath("//*[@id=\'u_0_a\']")).click(); //radio button-ok közül kiválasztja a férfit
		
		Select sel1=new Select(browser.findElement(By.xpath("//*[@id='year']"))); //legördülõ menübõl kiválaszt index alapján
		sel1.selectByIndex(6);
		
		Select sel2=new Select(browser.findElement(By.xpath("//*[@id=\"month\"]"))); //legördülõ menübõl kiválaszt megjelenített szöveg alapján
		sel2.selectByVisibleText("ápr.");
		
		Select sel3=new Select(browser.findElement(By.xpath("//*[@id=\"day\"]"))); //legördülõ menübõl kiválaszt érték alapján
		sel3.selectByValue("6");
		
		browser.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Nevem kell ide");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click(); //küld gombra kattint
		
		browser.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Igen");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys("Endre");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_x\"]")).sendKeys("Jelszó");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click(); //küld gombra kattint
		
		
		String text=browser.findElement(By.xpath("//*[@id=\"js_1r\"]")).getText().toString();
		System.out.println(text);     //Ezzel stringbe le tudjuk menteni a hibaüzenetet
		
		String text2=", tudd már, hogy ide mit kell írni!";
		browser.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys(text2);
		//browser.close(); //Bezárja a böngészõt */
	}

}
