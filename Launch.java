package hris.hristest123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Launch {
WebDriver driver;
public Launch(WebDriver driver) {
	this.driver=driver;
}
public void launchChrome() {
	 System.setProperty("webdriver.chrome.driver" ,"C:\\Users\\uditsharma\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver.get("http://hris.qainfotech.com");

}
public void logout() throws InterruptedException {
	driver.findElement(By.className("profile-btn")).click();
	//driver.findElement(By.xpath("//div[@class='col-sm-3 col-md-2 col-xs-2']//child::ul[@class='user-profile-option user-profile-option1 list-unstyled']//child::a[@href='https://hris.qainfotech.com:8086/user/logoff']")).click();
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("a[href='https://hris.qainfotech.com:8086/user/logoff']")).click();
	
	//driver.findElement(By.cssSelector("a[href='https://hris.qainfotech.com:8086/user/logoff']")).click();
}
}
