package TestngProject.TestngProject;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL="https://demo.guru99.com/v1/index.php";
	public String username="mngr389091";
	public String pwd="padugEm";
	public String title="GTPL Bank Manager HomePage";
	public static WebDriver driver;
	public static Logger logger;
	
	
	 public  void captureScreenshot(String filename) throws IOException
     {

			//LocalDate myObj = LocalDate.now(); 
		  LocalTime myObj = LocalTime.now();
		  
			String date =myObj.toString().replaceAll(":", "_");
			
		    
		 TakesScreenshot tc= (TakesScreenshot)driver;
	      File  src =tc.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("./screenshot/"+date+filename));
 	   
     }

	
	@BeforeClass
	public void setup() 
	{
	

		  System.setProperty("webdriver.chrome.driver","/home/amitkumr.gond/Desktop/chromedriver");
			//driver=new ChromeDriver(); System.getProperty("user.dir");
			//WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				driver = new ChromeDriver(options);
	 
	}
	
	@AfterClass
	public void tearDown()
	{
	
	driver.quit();
	}
	

}