package hris.hristest123;



import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Hris_main {
	WebDriver driver=new ChromeDriver();
	Hris_function obj = new Hris_function(driver);
	 Hris_invalid obj1= new Hris_invalid(driver);
	 Launch obj2= new Launch(driver);
	 Hris_no obj3= new Hris_no(driver);


@Test(priority=1)
public void test1() throws InterruptedException {
	obj2.launchChrome();
	obj.logInWithValidCredentials();
	WebDriverWait wait = new WebDriverWait(driver,20);
	WebElement time;
	time=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dv_2018-06-27']//child::span[@class='ng-binding'][1]")));
	
    String str=(time).getText();
    Assert.assertEquals( str,"08:13");
    
    obj2.logout();
 // driver.close();
}

@Test(priority=2)
public void test2() {
	obj2.launchChrome();
	obj1.loginWithInvalidCredentials();
	
}
@Test(priority=3)
public void test3() {
	obj3.logInWithNoCredentials();
	driver.quit();
	
}
	
}

