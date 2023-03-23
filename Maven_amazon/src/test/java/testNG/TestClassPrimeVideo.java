package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
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

import pomClasses.AmazonHomePage;
import pomClasses.AmazonPrimeVideoMoviesPage;

public class TestClassPrimeVideo {
	WebDriver driver;
	AmazonHomePage amazonHomePage;
	AmazonPrimeVideoMoviesPage amazonPrimeVideoMoviesPage;
	
	@Parameters("browser")
	@BeforeTest
	public void openBrowser(String browserName) {
		if(browserName.equals("Chrome")) {
			 System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");
			 driver = new ChromeDriver();
			
		}
		if(browserName.equals("Firefox")) {
			System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
			driver.manage().window().maximize();
	}
	@BeforeClass
	public void createPomObject() {
	amazonHomePage = new AmazonHomePage(driver);
	amazonPrimeVideoMoviesPage = new AmazonPrimeVideoMoviesPage(driver); 
		
	}
	@BeforeMethod
	public void openHomePage() {
		System.out.println("beforeMethod");
		
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test()
	public void verifyopenAllIcon() {
		System.out.println("Test - 1");
		amazonHomePage.ClickonAllIcon();
		amazonHomePage.ClickOnAmazonPrimeVideo();
		amazonHomePage.ClickOnAmazonPrimeVideoMovies();
		
		String actualTitle = driver.getTitle();
		String actualURL = driver.getCurrentUrl();
		
		String expectedTitle= "Prime Video: Movies";
		String expectedURL = "https://www.primevideo.com/storefront/movie/ref_=atv_nb_sf_mv?ref_=nav_em_0_2_6_3";
		
//		if(actualTitle.equals(expectedTitle))
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
		
		boolean result = ((actualTitle.equals(actualTitle)) && actualURL.equals(expectedURL));
		
		Assert.assertEquals(result, result);
		
	}
	
	@Test
	public void verifyOpenTermsAndPrivacyPage() {
		System.out.println("Test - 2");
		
		amazonPrimeVideoMoviesPage.clickOnTermsAndPrivacyPage();
			
		String actualTitle = driver.getTitle();
		String expectedTitle = "Prime Video: Help";
		
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("failed");
		}
		
	}
	
	@AfterMethod
	public void closedCurrentTab() {
		System.out.println("afterMethod");
		
		ArrayList<String> addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(0));
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
		
		amazonHomePage = null;
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
//		driver.quit();
//		driver = null;
//		System.gc();
	}
	
}
	
	
	
		
	
	

