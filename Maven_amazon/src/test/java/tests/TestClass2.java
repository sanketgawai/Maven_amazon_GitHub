package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonHomePage;
import pomClasses.AmazonPrimeVideoMoviesPage;

public class TestClass2 {
	
	

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	
	driver.get("https://www.amazon.in/");
	
	AmazonHomePage amazonHomePage = new AmazonHomePage(driver); 
	
	amazonHomePage.ClickonAllIcon();
	amazonHomePage.ClickOnAmazonPrimeVideo();
	amazonHomePage.ClickOnAmazonPrimeVideoMovies();
	
	AmazonPrimeVideoMoviesPage amazonPrimeVideoMoviesPage = new AmazonPrimeVideoMoviesPage(driver); 
	amazonPrimeVideoMoviesPage.clickOnTermsAndPrivacyPage();
			
	}
}
 