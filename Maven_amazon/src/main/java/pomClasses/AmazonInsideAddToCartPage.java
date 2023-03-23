package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonInsideAddToCartPage {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath = "//div[@id='NATC_SMART_WAGON_CONF_MSG_SUCCESS']//span")
	private WebElement addtocarttext;
	
	@FindBy(xpath = "")
	private WebElement zyx;
	
	public AmazonInsideAddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
	}
	
	public void getTextofAddToCart() {
		act.moveToElement(addtocarttext).perform();
//		addtocarttext.getText();
		String text = addtocarttext.getText();
		System.out.println(text);
	}
}
