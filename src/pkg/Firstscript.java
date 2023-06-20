package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscript {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("http://www.google.com");
//driver.quit();
String actualtitle= driver.getTitle();
System.out.println("actualtitle="+actualtitle);
String exp="google.com";
System.out.println("expectedtitle="+"google.com");
if(actualtitle.equals(exp))
{
	System.out.println("pass");
	
}else
{
	System.out.println("fail");

}
	}

}
