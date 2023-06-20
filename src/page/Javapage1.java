package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Javapage1 {
	WebDriver driver;
	By createpagelink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	By getstartedbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button");
	
public Javapage1(WebDriver driver)

{
this.driver=driver;	
}
public void createpagelinkclick()
{
	driver.findElement(createpagelink).click();
}
public void getstartedbutton()
{
	driver.findElement(getstartedbutton).click();
}
}