package testNG;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import pomClasses.AmazonAddToCartPage;
import pomClasses.AmazonHomePage;
import pomClasses.AmazonInsideAddToCartPage;
import pomClasses.AmazonSsdPage;

public class Practice {
	WebDriver driver;
	AmazonHomePage amazonHomePage;
	AmazonAddToCartPage amazonAddToCartPage;
	AmazonSsdPage amazonSsdPage;
	SoftAssert soft
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
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void creatPomObject() {
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		amazonAddToCartPage = new AmazonAddToCartPage(driver);
		amazonHomePage = new AmazonHomePage(driver);
	    amazonSsdPage = new AmazonSsdPage(driver);
	    ArrayList<String> addr;
	    SoftAssert soft = new SoftAssert();
	}
	
	@BeforeMethod
	public void openHomePage() {
		
	}
	

	
}
