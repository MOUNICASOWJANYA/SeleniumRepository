package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNG_4_Description {
	WebDriver driver;
	
	  @Test(priority=0,enabled=true,description="Top Menus Module")
	  public void rm_1() {
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/ul/li[1]/a")).click();
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/ul/li[2]/a")).click();
		 driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/ul/li[3]/a")).click();
	  }
	  
	  @Test(priority=2,description="Sign In Module")
	  public void testcase2() {
			 driver.findElement(By.xpath("//*[@class=\"login\"]")).click();
			 
	  }
	    
	  @Test(description="Registration Module",priority=4,enabled=true)
	  public void testcase3() {
		  driver.findElement(By.xpath("//*[@class=\"register\"]")).click();
	  }
	  
	  @Test(priority=3, description="Main Menus")
	  public void testcase4() {
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[3]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6664]/a")).click();
	  } 
	  
	  @Test(priority=1, description="Search", enabled=false)
	  public void testcase5() {
		  driver.findElement(By.xpath("//*[@id=\"q\"]")).sendKeys("Java");
	  }
	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://redmine.org/");
  }

}
