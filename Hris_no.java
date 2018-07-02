package hris.hristest123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Hris_no {
	WebDriver driver;
	public Hris_no(WebDriver driver) {
		this.driver=driver;
	}
public void logInWithNoCredentials() {
	driver.findElement(By.xpath("//input[@name='Submit']")).click();
	Assert.assertTrue(driver.findElement(By.id("txtUserName")).getAttribute("style").contains("red")); 
}
}
