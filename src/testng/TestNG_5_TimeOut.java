package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_5_TimeOut {
	WebDriver driver;
	
	  @Test
	  public void withouttimeout() {
		  driver.get("https://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("Tirupati");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
	  }
	  
	  @Test(timeOut=7000)
	  public void withtimeout() {
			 
		  driver.get("https://www.google.com");
		  driver.findElement(By.name("q")).sendKeys("Bengaluru");
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
	    
	 
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
  }

}
