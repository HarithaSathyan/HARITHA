package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.GroupsHelper;


public class Grouppgm {
	ChromeDriver driver;
	//@BeforeTest
	//public void setup()
	//{
	//	driver=new ChromeDriver();
				
	//}
	
//@BeforeMethod
//public void urlloading(alwaysrun=true)
//{
	//driver.get("https://www.facebook.com");
//}
@Test
public void logo(Group = {"smoke","sanity"})
{
	boolean logo=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	if(logo)
	{
		System.out.println("logo is present");
	}
	else
	{
		System.out.println("logo is present");
	}
}
public void email()
{
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("hari@123");
}
public void password()
{
	driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("acbd");
}
public void submit()
{
	driver.findElement(By.xpath("//*[@id=\"u_0_5_AL\"]")).click();
}
}
