package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	
	{
		driver =new ChromeDriver();
		driver.get("www.flipkart.com");
	}
	@Test
	public void test1()
	{
	driver.findElement(By.xpath("//*[@class='_3704LK']")).sendKeys("phones",Keys.ENTER);
	driver.findElement(By.xpath("//*[@span='Cart']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@loading='lazy']")).click();
	

	String actualtitle=driver.getTitle();
System.out.println(actualtitle);
}
}