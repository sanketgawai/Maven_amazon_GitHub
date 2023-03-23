package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonAddToCartPage {
	private WebDriver driver;
	private Actions act;

	
	@FindBy(xpath ="//span[@id='productTitle']")
	private WebElement Ssdlink;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
	private WebElement addtocartbutton;
	
	public AmazonAddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
	}
	
	public void getTextofLink() {
		WebElement ssdtext = Ssdlink; 
		String text =ssdtext.getText();
	}
	
	public void Addtocartbutton() {
		
		act.moveToElement(addtocartbutton).click().build().perform();
	}
}

