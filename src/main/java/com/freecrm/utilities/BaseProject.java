package com.freecrm.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseProject {
	public static Properties prop;
	public static WebDriver driver;
	
	/*Constructor
	 * it has the same name as the class
	 * it does not have a return value
	 * when an instance of an object is created we can initialize the value within that instance
	 */
	public BaseProject() {
		
		 try {
			 prop = new Properties();
			FileInputStream fis = new FileInputStream("/Users/waqaskhan/Desktop/eclipse/com.freecrm/src/main/java/com/freecrm/config/file.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
			
		}
	}
	
	public static void initialize() {
		
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/waqaskhan/Downloads/chromedriver");
			 driver=new ChromeDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/waqaskhan/Downloads/geckodriver");
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
	}
	
}
