package Selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo10_WindowHandler {

	WebDriver driver =null;

  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\Browser Drivers\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
	  String url="http://demo.guru99.com/popup.php";
	  driver.get(url);
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("/html/body/p/a")).click();
	  Set<String> windows=driver.getWindowHandles();
	  Iterator<String> it=windows.iterator();
	  String parentwindow =it.next();
	  String childwindow=it.next();
	  driver.switchTo().window(childwindow);
	  driver.findElement(By.name("emailid")).sendKeys("aravid.guggilla57@gmail.com");
	  driver.findElement(By.name("btnLogin")).click();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  System.out.println("child window current URL is "+driver.getCurrentUrl());
	  System.out.println("child window title is "+driver.getTitle());
	  driver.close(); 
	  driver.switchTo().window(parentwindow);
	  System.out.println("parent window title is"+driver.getTitle());
	  //driver.quit();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
