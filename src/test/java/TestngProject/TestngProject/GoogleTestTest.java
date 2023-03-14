package TestngProject.TestngProject;



import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.*;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class GoogleTestTest  extends BaseClass {
	
	
	/*public static void  captureScreenshot(String filename) throws IOException
     {
		 TakesScreenshot tc= (TakesScreenshot)driver;
	      File  src =tc.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(src, new File("./screenshot/filename.png"));
  	   
     }
     */
	 
	 
      

	public static void main(String[] args) throws IOException {
		
		
		  System.setProperty("webdriver.chrome.driver","/home/amitkumr.gond/Desktop/chromedriver");
			//driver=new ChromeDriver(); System.getProperty("user.dir");
			//WebDriverManager.chromedriver().setup();
				ChromeOptions options = new ChromeOptions();
				
				options.addArguments("--no-sandbox");
				options.addArguments("--disable-dev-shm-usage");
				driver = new ChromeDriver(options);
				 logger=Logger.getLogger("ebanking");
		
		        driver.get("https://www.w3schools.com/html/");
		        driver.findElement(By.xpath("//*[contains(text(),'HTML HOME')]")).click();
		        
		        TakesScreenshot tc= (TakesScreenshot)driver;
		        File  src =tc.getScreenshotAs(OutputType.FILE);
		        FileUtils.copyFile(src, new File("./screenshot/image1.png"));
		        driver.quit();
		      
		        
		
		
		
		
		
	}

}
