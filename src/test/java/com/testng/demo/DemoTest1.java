package com.testng.demo;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoTest1 {
	
  @Test
  public void test1() {
	  System.out.println("Inside the test1 Method");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Inside the BeforeMethod Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("Inside the afterMethod Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Inside the beforeClass Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("Inside the afterClass Method");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Inside the beforeTest Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Inside the afterTest Method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Inside the beforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Inside the AfterSuite Method");
  }

}
