package pkg;

import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.config.Config;

public class brokenlinkpgm {
	ChromeDriver driver;
	//private WebElement[] links;
	@Before
	public void setup()
	{
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	}
	@Test()
	public void test1() throws  Exception
	{
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total no of tagname="+links.size());
		for(WebElement r:links);
		{
	String link=r.getattribute("href");
			verify(link);
		}
}
	private void verify(String link) {
		try {
			URL n=new URL(link);
	HttpURLConnection con=(HttpURLConnection)n.openConnection();
	con.connect();
	if(con.getResponseCode()==200)
	{
		System.out.println(" response code is 200");
	
	}
	else if(con.getResponseCode()==404)
	{
		System.out.println(" response code is 404");
		
	}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		}
	}
