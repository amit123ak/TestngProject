package com.screenshot.result;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Date;

import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestngProject.TestngProject.BaseClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class TestFaceBookTest extends BaseClass {

   @Test(testName="LoginFaceBook")
	public void LoginFaceBook() throws IOException
	{
	  
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("amitgondcse@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("skg@123");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		String s=driver.getTitle();
		//System.out.print("Title is =" +s);
       String s1=driver.findElement(By.xpath("//div[@class=\"fsl fwb fcb\"]")).getText();	 
		System.out.println(s1);
		
		 Assert.assertEquals(0, 1);
		
	
		/*if(s1==s);
		{
			System.out.print("login Test is pass");
		}
		else {
            String d= "sbc";
            captureScreenshot(d);
		}
		*/
}
}