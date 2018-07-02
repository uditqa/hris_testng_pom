package hris.hristest123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Hris_function {
  
	public WebDriver driver;
   public Hris_function(WebDriver driver) {
     this.driver=driver;
   }
   //Hris_function obj = new Hris_function(driver);
 //  public void logInPage() {
	  
	//      driver.get("http://hris.qainfotech.com");
	//	   driver.findElement(By.className("active")).click();
  // }
   public void logInWithValidCredentials() {
	  
		 driver.findElement(By.id("txtUserName")).sendKeys("uditsharma"); 
		 driver.findElement(By.id("txtPassword")).sendKeys("Udit@321#");
		 driver.findElement(By.xpath("//input[@name='Submit']")).click();
   }

}