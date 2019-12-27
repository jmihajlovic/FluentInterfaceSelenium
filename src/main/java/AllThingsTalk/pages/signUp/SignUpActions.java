package AllThingsTalk.pages.signUp;


import static AllThingsTalk.AllThingsTalk.DriverFactory.getChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpActions {

	private WebDriver driver = getChromeDriver();
	
	
	WebElement email; 	
	WebElement username; 	
	WebElement password; 
	WebElement signUpButton; 
	
	
	public SignUpActions sendKeysToEmail(String emailValue) {
		email = driver.findElement(By.cssSelector("input[placeholder='email']")); 
		email.sendKeys(emailValue);
		return this; 
	}	
	
	public SignUpActions sendKeysToUsername(String usernameValue) {
		username = driver.findElement(By.cssSelector("input[placeholder='username']")); 
		username.sendKeys(usernameValue);
		return this; 
	}
	
	public SignUpActions sendKeysToPassword(String passwordValue) {
		password = driver.findElement(By.cssSelector("input[placeholder='password']"));
		password.sendKeys(passwordValue);
		return this; 
	}
	
	public SignUpActions clickOnSignUp() {
		signUpButton = driver.findElement(By.className("sign-button")); 
		signUpButton.click();
		return this; 
	}
	
	
}
