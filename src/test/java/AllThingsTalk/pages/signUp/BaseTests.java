package AllThingsTalk.pages.signUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import AllThingsTalk.AllThingsTalk.LoginRegistrationData;
import AllThingsTalk.pages.login.LoginActions;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import static AllThingsTalk.AllThingsTalk.DriverFactory.getWebDriverWait;

import java.util.concurrent.TimeUnit;

public class BaseTests {

	WebDriver driver = null; 
	WebDriverWait wait;
	LoginActions login; 
	public LoginRegistrationData data; 

	@BeforeSuite

	public void startBrowser() {
		driver = getChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		wait = getWebDriverWait();
	}
	
	@BeforeMethod
	public void goToSignUpPage() {
		driver.get("https://screenployee-allthingstalk.firebaseapp.com");	
		login = new LoginActions(); 
		login.clickOnSignUpButton();
		
		try {
		    data = LoginRegistrationData.get("src\\main\\resources\\LoginRegistrationData.json");
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
	}	
	
	@AfterSuite		
	public void closeBrowser() {
		driver.quit();
	}
}
