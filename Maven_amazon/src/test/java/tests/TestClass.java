package tests;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonAddToCartPage;
import pomClasses.AmazonHomePage;
import pomClasses.AmazonInsideAddToCartPage;
import pomClasses.AmazonSsdPage;

public class TestClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver); 
		
		amazonHomePage.Searchbox();
		amazonHomePage.Searchboxnext();
		
		
		AmazonSsdPage amazonSsdPage = new AmazonSsdPage(driver);
		
		amazonSsdPage.Ssd();
		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(addr.get(1));
				
//		amazonSsdPage.Changepage();
	
//		amazonSsdPage.FeaturedDropDown();
//		amazonSsdPage.Addtocartquantity();
		
		AmazonAddToCartPage amazonAddToCartPage = new AmazonAddToCartPage(driver); 
		amazonAddToCartPage.Addtocartbutton();
		
		AmazonInsideAddToCartPage amazonInsideAddToCartPage = new AmazonInsideAddToCartPage(driver);
		amazonInsideAddToCartPage.getTextofAddToCart();
	}
}
