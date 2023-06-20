package page;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Fbloginpage {
;
WebDriver driver;
By fbemail=By.id("email");
By fbpass=By.id("pass");
By fblog=By.name("login");


public Fbloginpage(WebDriver driver)
{
	this.driver=driver;
	
}
public void setvalues(String username,String passwrd)
{
	driver.findElement(fbemail).sendKeys(username);
	driver.findElement(fbpass).sendKeys(passwrd);
}
@Test
public void login() {
	driver.findElement(fblog).click();
}
}
