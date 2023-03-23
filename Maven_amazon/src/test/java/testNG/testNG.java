package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG {

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Before Suite - TestNGClass");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test - TestNGClass");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before Class - TestNGClass");
	}
	
	
	@BeforeMethod
	public void beforeMehtod() {
		System.out.println("Before Method - TestNGClass");
	}
	
	
	@Test
	public void testA() {
			System.out.println("Test - A - TestNGClass");
	}
			
	@Test
	public void testB() { 
			System.out.println("Test - B - TestNGClass");
	}
	
	@Test
	public void testC() { 
			System.out.println("Test - C - TestNGClass");
	}
	
	@Test
	public void testD() {
			System.out.println("Test - D - TestNGClass");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After method - TestNGClass");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After Class - TestNGClass");
	}
	
	@AfterTest
	public void afterTest () {
		System.out.println("After Test - TestNGClass");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite - TestNGClass");
	}
	
}
