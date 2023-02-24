package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\smoni\\Documents\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
	//	driver.quit();
	}

}
