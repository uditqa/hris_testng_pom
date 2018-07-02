package hris.hristest123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;



public class Hris_invalid {
  WebDriver driver;
//	WebDriver driver= new ChromeDriver();

	public Hris_invalid(WebDriver driver) {
		this.driver=driver;
	}
	public void loginWithInvalidCredentials() {
		 driver.findElement(By.id("txtUserName")).sendKeys("uditsharma");
		 driver.findElement(By.id("txtPassword")).sendKeys("Udit321#");
		 driver.findElement(By.xpath("//input[@name='Submit']")).click();
		 String str=driver.findElement(By.xpath("//div[@class='']")).getText();
		 System.out.println(str);
		 Assert.assertEquals("Invalid Login", str);
		 
	 }
}
