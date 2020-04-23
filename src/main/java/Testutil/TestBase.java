package Testutil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Testutil.TestUtil;

public class TestBase {
	
	 public  static WebDriver driver;
		static Properties prop;
		//public  static EventFiringWebDriver e_driver;
		//public static WebEventListener eventListener;
		
		public TestBase(){

	
	try {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("C:\\Users\\ajeet\\eclipse-workspace\\Freeui\\src\\main\\java\\config\\config.properties");
		System.out.print("------------------");
		prop.load(ip);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	}


public static void initialization(){
	String browserName = prop.getProperty("browser");
	System.out.print(browserName);
	

	System.out.print("------------------hgghggghjhjg");
	System.out.print("------------------"+browserName);
	
	if(browserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ajeet\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
			}
	else if(browserName.equals("FF")){
		System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Documents/SeleniumServer/geckodriver");	
		driver = new FirefoxDriver(); 
	}
	
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
	driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
	
	
}


public static String getReportConfigPath(){
	String reportConfigPath = prop.getProperty("reportConfigPath");
	if(reportConfigPath!= null) return reportConfigPath;
	else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
}
}













