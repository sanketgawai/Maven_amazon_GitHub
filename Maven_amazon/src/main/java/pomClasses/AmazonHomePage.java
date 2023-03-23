package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonHomePage {
	private Actions act ;
	private WebDriver driver;

	@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	private WebElement searchbox;
	
	@FindBy(xpath ="//input[@id=\"nav-search-submit-button\"]")
	private WebElement searchboxnext;
	
	@FindBy(xpath ="//a[@id='nav-hamburger-menu']")
	private WebElement allIcon;
	
	@FindBy(xpath ="//a[@data-menu-id='6']")
	private WebElement amazonPrimeVideo;
	
	@FindBy(xpath ="//a[text() = 'Movies']")
	private WebElement amazonPrimeVideoMovies;
	
	public AmazonHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
		 this.driver = driver;
	}
	
	public void Searchbox() {
		searchbox.click();
		searchbox.sendKeys("sansung 970 evo pluse ssd 1tb");
	}
	
	public void Searchboxnext() {
		searchboxnext.click();
	}
	
	public void ClickonAllIcon() {
		allIcon.click();
	}
	
	public void ClickOnAmazonPrimeVideo() {
		
	  WebDriverWait  wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(amazonPrimeVideo));
		act.moveToElement(amazonPrimeVideo).click().build().perform();
	}
	
	public void ClickOnAmazonPrimeVideoMovies() {
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(amazonPrimeVideoMovies));
		act.moveToElement(amazonPrimeVideoMovies).click().build().perform();
		
	}
	
	
}
