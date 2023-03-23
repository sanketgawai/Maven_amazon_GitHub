package pomClasses;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	private Actions act;
	private WebDriver driver;
	
	@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	private WebElement ref ;
	
	
	@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	private WebElement ref1;
	
	public PracticePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		Actions act = new Actions(driver);
		this.driver= driver;
	}
	
	public void clickOnTermsAndPrivacyNotice() {
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollIntoView(true)", ref1);
		ref1.click();
	}
	
	
	
}
