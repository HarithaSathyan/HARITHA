package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Buttonpgm {
	
	
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@Test
public void fileuploadpgm()throws Exception
{
	driver.get("https://www.ilovepdf.com/word_to_pdf");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
	
fileupload("C:\\Users\\LENOVO\\OneDrive\\Documents.docx");
}
public void fileupload(String s)throws AWTException
{
StringSelection strselection=new StringSelection(s)	;
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
Robot rob =new Robot();
rob.delay(3000);
rob.keyPress(KeyEvent.VK_CONTROL);
rob.keyPress(KeyEvent.VK_V);
rob.keyRelease(KeyEvent.VK_V);
rob.keyRelease(KeyEvent.VK_CONTROL);


rob.keyPress(KeyEvent.VK_ENTER);
rob.delay(2000);
rob.keyRelease(KeyEvent.VK_ENTER);
}

}