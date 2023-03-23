package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite -Automation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - Automation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - Automation");
	}
	
	@Test
	public void test1() {
		System.out.println("Test - 1- Automation");
	}
	
	@Test
	public void test2() throws InterruptedException {
			System.out.println("Test -2 - Automation"); 
	}
	
	@Test
	public void test3() {
			System.out.println("Test -3 - Automation"); 
	}
	
	@Test
	public void test4() throws InterruptedException {
			System.out.println("Test -4 - Automation"); 
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method - Automation");
	}
	
	@AfterClass
	public void afterClass () {
		System.out.println("After Class - Automation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test - Automation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Test - Automation");
	}
	

	
//  Suite-tagname   class- annoatation
//  parameter
//	suite		-> @BeforeSuite @AfterSuitd
//	test		-> @BeforeTest @AfterTest
//	class 		-> @BeforeClass @AfterClass
//	include		-> @BeforeMethod @Test @AfterMethod
	 
	
}
