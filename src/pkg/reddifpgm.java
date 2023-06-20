package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class reddifpgm {
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
//	boolean logo=driver.findElement(By.xpath("//*[@id='wrapper']/table[1]/tbody/tr[1]/tr[1]/img")).isDisplayed();
 //if(logo)
 //{
	// System.out.println(" response code is 200");
// }
// else
// {
//	 System.out.println(" response code is 200");
// }
// }
//}
boolean radio=driver.findElement(By.xpath(""))