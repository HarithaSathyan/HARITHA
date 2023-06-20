package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestRunner.PriorityWeight;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

public class Testngpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com");
}
@Test
public void logo(Priority = 1)
{
	driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img"));
	if(logo)
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is present");
	}
}
@Test
public void signin(priority = 4)
{
	System.out.println("signin");
}
@Test
public void password(priority = 3)
{
	System.out.println("password");
}
@Test
public void email(pririty = 2)
{
	System.out.println("email");
}
}
