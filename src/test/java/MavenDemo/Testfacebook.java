package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class Testfacebook {
	WebDriver driver;
	@Test
	public void TestFireFox(){

		System.setProperty("webdriver.ie.driver", ".\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Applsssiccaghththtion titlgghe is y============="+driver.getTitle());
		driver.quit();

	}


}