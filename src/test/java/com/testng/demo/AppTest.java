package com.testng.demo;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.testng.app.App;

public class AppTest {
	
	App a1;

	// BeforeClass annotation will run only once before executing all the methods in
	// the class or suite
	@BeforeSuite
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Inside BeforeSuite Method");
	}

	// AfterClass annotation will run only once after executing all the methods in
	// the class or suite
	@AfterSuite
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Inside afterSuite Method");
	}

	// Before annotation will run Before executing each testCase
	@BeforeMethod
	public void setUp() throws Exception {
		a1 = new App();
		System.out.println("Inside Before Method");
	}

	// After annotation will run After executing each testCase
	@AfterMethod
	public void tearDown() throws Exception {
		System.out.println("Inside after Method");
	}

	@Test
	public void test1() {
		assertEquals(10,a1.add(-10, 20));
		assertEquals(-30,a1.sub(-20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(-2,a1.div(20, -10));
		assertEquals(2,a1.mod(20,9));
		System.out.println("Inside test1 Method");

	}

	@Test
	public void test2() {
		assertEquals(30,a1.add(10, 20));
		assertEquals(10,a1.sub(20, 10));
		assertEquals(30,a1.mul(10, 3));
		assertEquals(2,a1.div(20, 10));
		assertEquals(0,a1.mod(20, 10));
		System.out.println("Inside test2 Method");
	}

}
