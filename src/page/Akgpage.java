package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Akgpage {
WebDriver driver;
By akghome=By.xpath("//*[@id=\"ftco-nav\"]/ul/li[1]/a/span");
By make=By.xpath("/html/body/section[1]/div[2]/div/div/div/a");

public Akgpage(WebDriver driver)
{
	this.driver=driver;

}

public void home()
{
	driver.findElement(akghome).click();
}
public void hamp()
{
	driver.findElement(make).click();
}
}
