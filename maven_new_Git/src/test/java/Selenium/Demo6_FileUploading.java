package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo6_FileUploading {
  WebDriver driver =null;
	@Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get("http://demo.guru99.com/test/upload/");
	  WebElement Upload= driver.findElement(By.id("uploadfile_0"));
	 Upload.sendKeys("C:\\Users\\aravind.g.kumar\\Desktop\\flower.jpg");
	 driver.findElement(By.id("terms")).click();
	 driver.findElement(By.name("send")).click();
	 Thread.sleep(3000);
	 driver.close();
	 
	  
	  
  }
}












