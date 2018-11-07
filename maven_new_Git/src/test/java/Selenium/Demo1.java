package Selenium;

import org.testng.annotations.Test;

public class Demo1 {
  @Test(priority=2)
  public void  Login() {
	  System.out.println("this is login test method");
  }
  
  @Test(priority=1)
  public void  Register() {
	  System.out.println("this is Register test method");
  }
}

