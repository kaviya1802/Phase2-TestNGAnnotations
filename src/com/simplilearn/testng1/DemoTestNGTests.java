package com.simplilearn.testng1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;

public class DemoTestNGTests {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Test");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method test");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class test");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Before class test");
  }
  
  @Test
  public void testcase() {
	  System.out.println("Test case");
  }

}
