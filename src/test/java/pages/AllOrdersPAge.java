package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllOrdersPAge {

	public AllOrdersPAge(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[.='Web Orders']")
	public WebElement webOrders;
	
	@FindBy(css=".=login_info")
	public WebElement welcomeMsg;
	
	@FindBy(xpath="//h2[contains(text(),'List of All Orders')]")
    public WebElement listofallorders;
	
	@FindBy(linkText="View all orders")
	public WebElement viewAllOrders;
	
	@FindBy(linkText="View all products")
	public WebElement viewAllProduct;
	
	@FindBy(linkText="Order")
	public WebElement orderTab;
	
	
	
	
	
	
	
}
