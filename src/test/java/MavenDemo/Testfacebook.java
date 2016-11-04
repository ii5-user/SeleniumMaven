package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testfacebook {

	@Test
	public void TestFireFox(){

		System.setProperty("webdriver.firefox.marionette",".\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Applsssiccation titlgghe is y============="+driver.getTitle());
		driver.quit();

	}

}