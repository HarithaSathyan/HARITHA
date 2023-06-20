package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazonwindow {
	ChromeDriver d;
	@BeforeTest
	public void beforetest()
	{
	d=new ChromeDriver();
	}
@Test
public void test() 
{
	d.get("https://www.amazon.com/");
	String parentwindowString=d.getWindowHandle();
	d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).click();
	d.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("phones",Keys.ENTER);
	d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
	
	
	
	
	
	Set<String> allwindows=d.getWindowHandles();
	for( String handle:allwindows)
	{
	if(!handle.equalsIgnoreCase(parentwindowString))	
	{
		d.switchTo().window(handle);
	 d.findElement(By.id("add-to-cart-button")).click();
	
		d.close();
	}
	}d.switchTo().window(parentwindowString);
}
}
