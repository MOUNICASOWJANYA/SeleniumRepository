package log4jtutorial;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jdemo {
	WebDriver driver;
  @Test
  public void log4J() {
	  Logger log= Logger.getLogger("signin");
	  PropertyConfigurator.configure("Log4j.properties");
	  
	  driver= new ChromeDriver();
	  log.info("Chromebrowser launch");
	  driver.manage().window().maximize();
	  log.info("browser maximised");
	  driver.get("https://www.google.com/");
	  
	  log.info("Launch google url");
  }
}
