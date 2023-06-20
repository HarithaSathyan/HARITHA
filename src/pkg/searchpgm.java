package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
	
	driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	}
	@Test()
	public void test1()
	
	
	
	{
	String actualtitle=driver.getTitle();
	System.out.println(actualtitle);
	}
@After
public void teardown()
{
	// driver.quit();
}
}
