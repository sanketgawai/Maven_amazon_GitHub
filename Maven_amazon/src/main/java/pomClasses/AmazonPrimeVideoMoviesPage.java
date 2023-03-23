package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrimeVideoMoviesPage {

	private Actions act;
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()='Terms and Privacy Notice']")
	private WebElement termsAndPrivacyNotice;
	
	public AmazonPrimeVideoMoviesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		//global veriable = local veriable
		this.driver = driver;
	}
	
	public void clickOnTermsAndPrivacyPage() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("windows.scrollIntoView(true)", termsAndPrivacyNotice);
		termsAndPrivacyNotice.click();
	}
	
	
	
}
