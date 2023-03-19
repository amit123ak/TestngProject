package com.test.method;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

//ignore specific test method
//ignore all method inside the class 
//ignore all test method in package

public class IgnoreTestCases {
  
 

 @Test(enabled=true)
  public void Test1() {
	  System.out.print("Test1");
  }
	
  @Test
  public void Test2() {
	  System.out.print("Test2");
  }

  @Test
  public void Test3() {
	  System.out.print("Test3");
  }
  
}
