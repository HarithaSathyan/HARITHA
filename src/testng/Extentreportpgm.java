package testng;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import dev.failsafe.internal.util.Assert;

public class Extentreportpgm {
	ChromeDriver driver;
	String base1="https://www.facebook.com";


ExtentHtmlReporter reporter;
ExtentReports extents;
ExtentTest test;		
	
	@BeforeTest
public void beftest()
{
	//reporter=new ExtentHtmlReporter(System.getProperty("user.dir")+"/reports/myreport.html");
	reporter=new ExtentHtmlReporter("./reprts/myreport1.html");
	reporter.config().setDocumentTitle("Automationreport");
	reporter.config().setReportName("functional test");
	reporter.config().setTheme(Theme.DARK);
	extents=new ExtentReports();
	extents.attachReporter(reporter);
	extents.setSystemInfo("hostname", "localhost");
	extents.setSystemInfo("os", "windows10");
	extents.setSystemInfo("testername", "abc");
	extents.setSystemInfo("Browser Name", "chrome");
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();	

}

@BeforeMethod
public void setup() {
	
	driver.get(base1);

}



@Test 
public void fbtitleverification() throws IOException 
{
	
	test=extents.createTest("Fbtitleverification");
	String Exp="facebook";
	String actual=driver.getTitle();
	Assert.assertequals(Exp, actual);
	System.out.println("hello");
		
}
	

@Test
public void fbbuttontest() throws IOException
{
	test=extents.createTest("Fbbuttontest");
	String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).getText();
	Assert.assertEquals(buttontext, "register");
	
}


@Test
public void fblogotest() throws IOException
{
	test=extents.createTest("Fblogotest");
	boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
	Assert.assertTrue(b);
	
	

	
}
@AfterTest 
public void teardown()
{
	extents.flush();
}


		@AfterMethod
		public void browserclose(ITestResult  result) throws IOException
		{

	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL, "test case failed is"+result.getName());
		test.log(Status.FAIL, "test case failed is"+result.getThrowable());
		String screenshotpath=ExtendedReports.screenshotMethod(driver,result.getName());
		test.addScreenCaptureFromPath(screenshotpath);
		
	}else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP, "test case skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS, "test case Passed is"+result.getName());
	}
	 
}

public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	String destination="./Screenshot/"+screenshotname +".png";
	//File finaldestination=new File(destination);
	//FileHandler.copy(src, finaldestination);
	FileHandler.copy(src, new File(destination));

	return destination;
}



}






	

}
