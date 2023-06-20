package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class redpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		 driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?ForName=user_details");		 
			 		 
	}
@Test
public void test1()
{
	
	WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
	 Select daydetails=new Select(day);
	 daydetails.deselectByValue("04");
	 WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]ll"));
	 Select monthdetails=new Select(month);
	 monthdetails.deselectByValue("october");
	 WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
	 Select yeardetails=new Select(year);
	 yeardetails.deselectByValue("2001");
		
}
}