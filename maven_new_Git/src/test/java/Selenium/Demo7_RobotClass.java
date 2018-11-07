package Selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo7_RobotClass {
  WebDriver driver=null;
	@Test
  public void f() throws AWTException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
 WebDriver driver =new ChromeDriver();
 Robot rob=new Robot();
 rob.keyPress(KeyEvent.VK_4);
 rob.keyRelease(KeyEvent.VK_4);
driver.get("http://www.inviul.com/");
driver.findElement(By.name("s")).sendKeys("Web driver");
 rob.setAutoDelay(1000);
rob.keyPress(KeyEvent.VK_ENTER);
rob.keyRelease(KeyEvent.VK_ENTER);

System.out.println("title of the page "+driver.getTitle());
System.out.println("Current URL of the page "+driver.getCurrentUrl());
 driver.close();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	  	     
  }
}
