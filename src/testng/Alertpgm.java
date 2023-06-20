package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Alertpgm {
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://demo.guru99.com/test/simple_context_menu.html");
}
@Test
public void alerttest1()
{
	WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	Actions act=new Actions(driver);
	act.contextClick(right);
	act.perform();
	driver.findElement(By.xpath("//*[@id=\"authentication\"]ul/li[1]")).click();
	 driver.switchTo().alert();
	
	WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	
	act.doubleClick(doubleclick);
	act.perform();
	Alert a= driver.switchTo().alert();
	System.out.println(a.getText());
	a.accept();
}
}
