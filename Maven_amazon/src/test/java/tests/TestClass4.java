package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pomClasses.AmazonHomePage;

public class TestClass4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\software testing\\selenium\\new\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.in/");
		
		AmazonHomePage amazonHomePage = new AmazonHomePage(driver);
		
		
		
	}
	
	
	
}
