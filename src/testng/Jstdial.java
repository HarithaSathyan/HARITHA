package testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Jstdial {
ChromeDriver driver;
@BeforeTest
public void setup()
{
	ChromeOptions ob=new ChromeOptions();
	ob.addArguments("--disable-notifications")		;
	driver=new ChromeDriver(ob);
}
@Test
public void test1()
{
	driver.get("https://www.justdial.com/");
}
}
