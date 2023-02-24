package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsElements {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Disabled
	@Test
	void test() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(1000);
	/*	driver.findElement(By.id("edit-name")).sendKeys("mounika");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");
		Thread.sleep(2000);
	//	driver.findElement(By.className("form-submit")).click();
	//	driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click();  */
		Thread.sleep(2000);
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click();
		
	}
	
	@Test
	void test1() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(1000);
		
		List<WebElement> tl= driver.findElements(By.tagName("a"));
		System.out.println("Total Links On Website: "+tl.size());
		
	
		
	}

}
