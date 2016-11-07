package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Testfacebook {
	WebDriver driver;
	@Test
	public void TestFireFox(){

		System.setProperty("webdriver.chrome.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Applsssiccaghtddehthtion titlgghe is y============="+driver.getTitle());
		driver.quit();

	}


}