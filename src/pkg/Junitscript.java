package pkg;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Junitscript {
	FirefoxDriver driver; 
	
	
	
	@Before
	public void setup()
	{
		FirefoxDriver	driver=new FirefoxDriver();
    driver.get("https://www.google.com");
	}
	
	@Test 
	public void test1()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
	}
	@After
	public void teardown()
	{
		driver.quit();
	}
}
