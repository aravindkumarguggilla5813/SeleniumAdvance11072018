package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Demo4_Actions_Demowebshop {
 WebDriver driver =null;
	@Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aravind.g.kumar\\Desktop\\chromedriver.exe");
		   driver =new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			WebElement search =driver.findElement(By.id("small-searchterms"));
			Actions act1=new Actions(driver);
			Thread.sleep(5000);
			act1.sendKeys(search,"computer");
			Thread.sleep(5000);
	
	  
  }
}
