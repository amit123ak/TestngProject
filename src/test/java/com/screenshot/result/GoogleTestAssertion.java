package com.screenshot.result;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import TestngProject.TestngProject.BaseClass;

public class GoogleTestAssertion extends BaseClass {
  @Test
  public void TestGoogleSearch() {
	  
	  driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("H Y R Tutorials - H Y R Tutorials");
	 System.out.println( driver.getTitle());
	  
  }
}
