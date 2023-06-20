package test;

import org.testng.annotations.Test;

import page.Javapage1;

public class Createtest extends Javatest1 {
@Test
public void Createtest()
{
	Javapage1 page=new Javapage1(driver);
	page.createpagelinkclick();
	page.getstartedbutton();
}
}
