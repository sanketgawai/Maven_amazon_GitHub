package pomClasses;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSsdPage {
	private WebDriver driver;
	private Actions act;
	
	@FindBy(xpath ="//a[@class='a-link-normal s-no-outline']")
	private WebElement ssd;
	
//	@FindBy(xpath="//input[@id='add-to-cart-button']")
//	private WebElement addtocartbutton;
	
	@FindBy(xpath = "//span[@id='a-autoid-0-announce']")
	private WebElement featuredDropDown;
	
	@FindBy(xpath = "//select[@id='quantity']")
	private WebElement addtocartquantity;
	
	public AmazonSsdPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		//***** Actions ke agrument me ye driver chahiye initElements ka 
		//***** thats why we dec both driver & actions globaly
		 act = new Actions(driver);
		 this.driver = driver;
	}
	
	public void Ssd() {
		ssd.click();
	}
	
	public void Changepage() {
		//***** pom classes me sirf webelements releted code
		//***** test classes me childbrowser, alter, ifram ka code
//		ArrayList<String>addr = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(addr.get(1));
	}
	
	public void FeaturedDropDown() {
//		featuredDropDown.click();
		boolean a = featuredDropDown.isDisplayed();
	}
	
//	public void Addtocartbutton() {
//		boolean a =addtocartquantity.isDisplayed();
//		System.out.println(a);
		
//		act.moveToElement(addtocartbutton).click();
			
	}
		

