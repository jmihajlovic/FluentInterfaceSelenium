package AllThingsTalk.pages.newEmployee;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import static AllThingsTalk.AllThingsTalk.DriverFactory.getWebDriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import AllThingsTalk.AllThingsTalk.EmployeeData;
import AllThingsTalk.AllThingsTalk.LoginRegistrationData;
import AllThingsTalk.pages.login.LoginActions;
import AllThingsTalk.pages.login.LoginTests;

public class BaseTests {
	
	WebDriver driver;
	WebDriverWait wait;
	public EmployeeData values; 
	LoginActions loginAction; 

	@BeforeClass

	public void startBrowser() {
		driver = getChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
			
	}
	
	@BeforeMethod
	public void goToSignUpPage() {
		driver.get("https://screenployee-allthingstalk.firebaseapp.com");	
		try {
			values = EmployeeData.get("src\\main\\resources\\EmployeeData.json");
		} catch (Exception e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		
		loginAction = new LoginActions(); 
		loginAction.sendKeysInUsernameEmail("ray9"); 
		loginAction.sendKeysInPassword("abcd43210"); 
		loginAction.clickOnSignInButton(); 
		
		wait = getWebDriverWait();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("all-employees-text")));
		
		loginAction.clikcOnButton(0); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("employee-picture")));
		
		
		
		
	}
	
	 @AfterClass(alwaysRun = true)
	    public void closeBrowser(){
	        driver.quit();
	    }

}
