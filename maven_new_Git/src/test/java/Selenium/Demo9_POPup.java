package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo9_POPup {
  WebDriver driver =null;
	@Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
 WebDriver driver =new ChromeDriver();
driver.get("http://demo.guru99.com/test/delete_customer.php");
Thread.sleep(2000);
driver.findElement(By.name("cusid")).sendKeys("12345");
driver.findElement(By.name("submit")).click();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
Alert alt=driver.switchTo().alert();
System.out.println("terms and conditions of the alert is "+alt.getText());
Thread.sleep(2000);
alt.accept();  //click on OK Button
Alert alt2=driver.switchTo().alert();
System.out.println("terms and conditions of the alert is "+alt2.getText());
alt2.accept();
driver.close();
	    
	    
	     
	  
	     
	     
	     
	  
  }
}
