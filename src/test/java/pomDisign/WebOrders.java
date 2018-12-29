package pomDisign;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AllOrdersPAge;
import pages.WebOrdersLoginPage;

public class WebOrders {

	WebDriver driver;
	WebOrdersLoginPage loginPage;
	AllOrdersPAge allOrdersPage;

	@BeforeClass // Runs once for all tests
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// driver.manage().window().fullscreen();

	}

	@BeforeMethod
	public void setUpAplication() {

		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		loginPage = new WebOrdersLoginPage(driver);
	}

	@Test(description = "Verify labels and tab links are displayed", priority = 1)
	public void lebelsVerifications() {

	 Assert.assertEquals(driver.getTitle(),"Web Orders Login","Loging page is not displayed Aplication crashed");
	    loginPage.userName.sendKeys("Tester");
	    loginPage.password.sendKeys("test");
	    loginPage.LoginButton.click();
	    allOrdersPage = new AllOrdersPAge(driver);
	    assertTrue(allOrdersPage.webOrders.isDisplayed(),"Web Orders is not displayed");
		assertTrue(allOrdersPage.listofallorders.isDisplayed(),"List Of All Orders label is not displayed");
		assertTrue(allOrdersPage.viewAllOrders.isDisplayed(),"viewAllOrders is not displayed");
	
	    
	}

}
