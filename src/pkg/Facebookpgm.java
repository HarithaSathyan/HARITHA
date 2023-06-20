package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookpgm {
	ChromeDriver driver;
	 @Before
	 public void setup()
	 {
		 
	 driver=new ChromeDriver();
	 driver.get("https://www.facebook.com");
	 }
	 @Test
	 
	public void test1()	 
	{
		 driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		 driver.findElement(By.name("pass")).sendKeys("123.com");
		 driver.findElement(By.name("login")).click();

		 String actualtitle=driver.getTitle();
		 System.out.println(actualtitle);
		 
		 
	}
	 
@After
public void tearout()
{
	driver.quit();
}
}
