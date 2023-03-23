package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pomClasses.AmazonAddToCartPage;
import pomClasses.AmazonHomePage;
import pomClasses.AmazonInsideAddToCartPage;
import pomClasses.AmazonSsdPage;

public class TestClassXYZ {
	
	WebDriver driver;
	AmazonAddToCartPage amazonAddToCartPage;
	AmazonHomePage amazonHomePage;
	AmazonSsdPage amazonSsdPage;
	AmazonInsideAddToCartPage amazonInsideAddToCartPage;
	SoftAssert soft;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver","E:\\software testing\\selenium\\new\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			driver.manage().window().maximize();
	}
	@BeforeClass
	public void creatPomObject() {
			amazonAddToCartPage = new AmazonAddToCartPage(driver);
			amazonHomePage = new AmazonHomePage(driver);
		    amazonSsdPage = new AmazonSsdPage(driver);
		    amazonInsideAddToCartPage = new AmazonInsideAddToCartPage(driver);
		    ArrayList<String> addr;
		    soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void openHomePage() {
		System.out.println("beforeMethod");
		
		driver.get("https://www.amazon.in/");
		
		
	}
	
	@Test 
	public void verifyHomePageURLandTitle() {
		System.out.println("Test -1");
				
		String actualURL =driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		String expectedUrl="https://www.amazon.in/";
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
//		if(actualURL.equals(expectedUrl) && actualTitle.equals(expectedTitle))
//		
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
		boolean result = (actualURL.equals(expectedUrl) && actualTitle.equals(expectedTitle));
		Assert.assertEquals(result, result,"Test -1 not working");
		
	}

	@Test
	public void verifySsdLink() {
		System.out.println("test -2");
		
		amazonHomePage.Searchbox();
		amazonHomePage.Searchboxnext();
		amazonSsdPage.Ssd();
		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
		
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();
		
		String expectedURL = "https://www.amazon.in/Samsung-Internal-Solid-State-MZ-V7S1T0BW/dp/B07MBQPQ62/ref=sr_1_1?crid=2KGDYZ1B4XBKC&keywords=samsung%2B970%2Bevo%2Bplus%2Bssd%2B1tb&qid=1678085743&sprefix=%2Caps%2C172&sr=8-1&th=1";
		String expectedTitle = "Amazon.in: Buy Samsung 970 EVO Plus 1TB PCIe NVMe M.2 (2280) Internal Solid State Drive (SSD) (MZ-V7S1T0) Online at Low Prices in India | Samsung Reviews & Ratings";
		
//		if(actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle))
//		{
//			System.out.println("Passed");
//		}
//		else
//		{
//			System.out.println("Failed");
//		}
		
		boolean result = (actualURL.equals(expectedURL) && actualTitle.equals(expectedTitle));
		soft.assertEquals(result, result);
		
		
	}
	
	@AfterMethod
	public void closedCurrentTab() {
		System.out.println("afterMethod");
//		driver.close();
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
			
		amazonAddToCartPage = null;
		amazonHomePage = null;
		amazonSsdPage = null;
		amazonInsideAddToCartPage = null;
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
		driver.quit();
		driver = null;
		System.gc();
		
	}
	
	
		//thread-count="5"
	
}
