package pkg;

import java.security.Key;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in");		 
			 		 
	}
@Test
public void test1()
{
		 
	 
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("phones",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='nav-cart-text-container']")).click();
	driver.findElement(By.xpath("//*[@class='nav-line-1 nav-progressive-content']")).click();

	driver.findElement(By.xpath("//*[@input='ap_email']")).sendKeys("abc@123",Keys.ENTER);
	driver.findElement(By.xpath("//input[@name='email']")).click();
	driver.navigate().back();
	driver.navigate().back();
	driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));
	driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();
	
	
String actualtitle=driver.getTitle();
System.out.println(actualtitle);
}

}