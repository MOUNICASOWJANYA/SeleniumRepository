package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_3_SkipDisabledIgnore {
	WebDriver driver;
	
	  @Test(priority=0,enabled=false)
	  public void twitter() {
		  driver.get("https://www.twitter.com");
	  }
	  
	  @Test(priority=2)
	  public void google() {
		  driver.get("https://www.google.com");
	  }
	    
	  @Test(priority=4,enabled=false)
	  public void facebook() {
		  driver.get("https://www.facebook.com");
	  }
	  
	  @Test(priority=3)
	  public void selenium() {
		  driver.get("https://www.selenium.dev");
	  } 
	  
	  @Test(priority=1,enabled=false)
	  public void gmail() {
		  driver.get("https://www.gmail.com");
	  }
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();  
  }

}
