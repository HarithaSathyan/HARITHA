package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Akgpage;

public class Akgtest {
	WebDriver driver;
	@BeforeTest
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https:// www.akghospital.in");
	}
	@Test
	public void set()
	{
		Akgpage ob=new Akgpage(driver);
		ob.home();
		ob.hamp();
		
	}
}
