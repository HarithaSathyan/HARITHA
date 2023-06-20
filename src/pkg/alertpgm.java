package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/OneDrive/Documents/.html");		 
			 		 
	}
@Test
public void alertverify()
{
driver.findElement(By.xpath("//html/body/input[1]")).click();
Alert a= driver.switchTo().alert();
String text=a.getText();
a.accept();
if(text.equalsIgnoreCase("hello i am an alert box!"))
{
	System.out.println("pass");
}
else
{
	System.out.println("pass");
}
driver.findElement(By.xpath("//html/body/input[2]")).sendKeys("hari");
driver.findElement(By.xpath("//html/body/input[3]")).sendKeys("surendran");
driver.findElement(By.xpath("//html/body/input[4]")).click();
}
}