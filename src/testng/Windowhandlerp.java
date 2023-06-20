package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandlerp {
	ChromeDriver driver;
@BeforeTest
public void set() 
{
	driver=new ChromeDriver();
}
@Test
public void test1()
{
driver.get("https://demo.guru99.com/popup.php");
String parentwindowString=driver.getWindowHandle();
System.out.println("parent window"+ driver.getTitle());
driver.findElement(By.xpath("/html/body/p/a")).click();

Set<String> multiplewindow=driver.getWindowHandles();
for(String handle : multiplewindow)
{
	if(!handle.equalsIgnoreCase(parentwindowString))
	{
		driver.switchTo().window(handle);
		
		String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
		System.out.println(s);
		driver.close();
		
	}
}


}
}