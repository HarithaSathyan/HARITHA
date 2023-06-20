package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Javatest1 {
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
	 driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com");
	}
}
