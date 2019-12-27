package AllThingsTalk.pages.login;

import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import static AllThingsTalk.AllThingsTalk.DriverFactory.getWebDriverWait; 
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfAllElementsLocatedBy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginActions {

	 private WebDriver driver = getChromeDriver();
	 private WebDriverWait wait = getWebDriverWait();
	
	WebElement signInButton;	
	WebElement signUpButton;	
	WebElement usernameEmail; 
	WebElement password; 
	List<WebElement> buttons; 
	
	public LoginActions sendKeysInUsernameEmail(String usernameValue) {
		usernameEmail = driver.findElement(By.cssSelector("input[placeholder='username / email']"));
		usernameEmail.sendKeys(usernameValue);
		return this; 
	}
	
	public LoginActions sendKeysInPassword(String passwordValue) {
		password = driver.findElement(By.cssSelector("input[placeholder='password']")); 
		password.sendKeys(passwordValue);
		return this; 
	}
	
	public LoginActions clickOnSignInButton() {
		signInButton = driver.findElement(By.className("sign-button"));
		signInButton.click();
		return this; 
	}
	
	public LoginActions clickOnSignUpButton() {
		signUpButton = driver.findElement(By.className("signup-button"));
		signUpButton.click();		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='email']")));
		return this; 
	}
	
	public LoginActions clikcOnButton(int k) {
		buttons = driver.findElements(By.className("create-button")); 
		buttons.get(k).click();
		return this; 
	}
	
	
	
 }
