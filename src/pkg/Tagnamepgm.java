package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamepgm {
	ChromeDriver driver;
	//private WebElement[] links;
	@Before
	public void setup()
	{
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
	@Test()
	public void test1() 
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of tagname="+links.size());
		for(WebElement u:links);
		{
			String link= u.getattribute("href");
			String linktext= u.gettext();
			System.out.println(link+"------"+linktext);
			
		}
	}
}
