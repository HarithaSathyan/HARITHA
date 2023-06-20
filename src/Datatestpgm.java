import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datatestpgm {
	ChromeDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
@BeforeMethod
public void urlloading()
{
	driver.get("https://www.facebook.com");
}
	@Test
	public void test1() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\LENOVO\\OneDrive\\Desktop\\Book4.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sh=wb.getSheet("Sheet1");
		int row=sh.getLastRowNum();
		for(int i=1;i<=row;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username  +"\n"  + "password=" +password);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys("Abx@kl");
			driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys("ghdfnd");
			driver.findElement(By.name("email")).clear();
		    driver.findElement(By.name("email")).sendKeys("hfdd");
			driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys("dbdn");
			driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys("dddp");
			driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys("dhej");
			driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys("dddff");
			driver.findElement(By.name("pass")).clear();
            driver.findElement(By.name("pass")).sendKeys("etede");
		    driver.findElement(By.name("login")).click();

		}
	}
}
