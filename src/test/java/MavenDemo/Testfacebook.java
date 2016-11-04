package MavenDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testfacebook {
	WebDriver driver;
	@Test
	public void TestFireFox(){

		 driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("Applsssiccaghththtion titlgghe is y============="+driver.getTitle());
		driver.quit();

	}
	

}