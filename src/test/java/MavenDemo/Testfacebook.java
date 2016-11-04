package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testfacebook {
	WebDriver driver;
	@Test
	public void TestFireFox(){

		System.setProperty("webdriver.firefox.marionette",".\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Applsssiccaghththtion titlgghe is y============="+driver.getTitle());

	}
	@Test
	public void Test2()
	{
		System.out.println("Test 2");
		driver.quit();
	}

}