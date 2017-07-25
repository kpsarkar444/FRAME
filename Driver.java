package GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver {
	
	public static String browser=null;
	public static WebDriver driver;
	public static String currentPath=System.getProperty("user.dir");
	
	
	public static WebDriver getDriver(){
		if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();			
		}
		
		else if(browser.equalsIgnoreCase("chrome")){
			System.getProperty("webdriver.chrome.dirver", currentPath+"\\src\\main\\resources\\server\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browser.equalsIgnoreCase("ie")){
			System.getProperty("webdriver.chrome.dirver", currentPath+"\\src\\main\\resources\\server\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
		}
		else{
			System.out.println("Please select any browser name form the any three");
		}
		
		return driver;
	}

}
