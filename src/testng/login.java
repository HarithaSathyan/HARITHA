package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com/");
}
@Test
public void alerttest1()
{
 driver.findElement(By.name("email")).sendKeys("hsriths");
 driver.findElement(By.name("pass")).sendKeys("1234");
driver.findElement(By.name("login")).click();
String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1NDM4NDc3LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
String actual=driver.getCurrentUrl();
if(actual.equals(exp))
{
	System.out.println("sucess");
}
else
{
	System.out.println(" not sucess");	
}
}
}
