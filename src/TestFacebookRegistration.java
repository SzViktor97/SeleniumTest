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
		browser = new FirefoxDriver(); //�j B�ng�sz�p�ld�nyt hozunk l�tre Firefoxb�l
		browser.get("http://www.facebook.com");  // Facebookot megnyitja b�ng�sz�ben
		browser.manage().window().maximize(); // a k�perny� m�ret�t nagyra �ll�tja
		//WebElement header = browser.findElement(By.id("site-header"));   
		//assertTrue((header.isDisplayed()));
		
		
		browser.findElement(By.xpath("//*[@id='u_0_l']")).sendKeys("Endre vagyok"); //Textboxba be�rja a vezet�knevet
		
		browser.findElement(By.xpath("//*[@id=\'u_0_a\']")).click(); //radio button-ok k�z�l kiv�lasztja a f�rfit
		
		Select sel1=new Select(browser.findElement(By.xpath("//*[@id='year']"))); //leg�rd�l� men�b�l kiv�laszt index alapj�n
		sel1.selectByIndex(6);
		
		Select sel2=new Select(browser.findElement(By.xpath("//*[@id=\"month\"]"))); //leg�rd�l� men�b�l kiv�laszt megjelen�tett sz�veg alapj�n
		sel2.selectByVisibleText("�pr.");
		
		Select sel3=new Select(browser.findElement(By.xpath("//*[@id=\"day\"]"))); //leg�rd�l� men�b�l kiv�laszt �rt�k alapj�n
		sel3.selectByValue("6");
		
		browser.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("Nevem kell ide");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click(); //k�ld gombra kattint
		
		browser.findElement(By.xpath("//*[@id=\"u_0_n\"]")).sendKeys("Igen");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys("Endre");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_x\"]")).sendKeys("Jelsz�");
		
		browser.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click(); //k�ld gombra kattint
		
		
		String text=browser.findElement(By.xpath("//*[@id=\"js_1r\"]")).getText().toString();
		System.out.println(text);     //Ezzel stringbe le tudjuk menteni a hiba�zenetet
		
		String text2=", tudd m�r, hogy ide mit kell �rni!";
		browser.findElement(By.xpath("//*[@id=\"u_0_q\"]")).sendKeys(text2);
		//browser.close(); //Bez�rja a b�ng�sz�t */
	}

}
